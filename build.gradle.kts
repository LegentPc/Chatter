plugins {
    id("fabric-loom") version "1.15-SNAPSHOT"
    id("com.gradleup.shadow") version "9.3.1"
    kotlin("jvm") version "2.3.21"
}

version = project.properties["mod_version"] as String
group = project.properties["maven_group"] as String

base {
    archivesName.set(project.properties["archives_base_name"] as String)
}

val shadowModImpl: Configuration by configurations.creating {
    configurations.modImplementation.get().extendsFrom(this)
}

sourceSets {
    main {
        kotlin {
            srcDir("src/main/fabric")
        }
    }
}

repositories {
    mavenCentral()
    maven("https://maven.notenoughupdates.org/releases/")
}

dependencies {
    minecraft("com.mojang:minecraft:${project.properties["minecraft_version"]}")
    mappings("net.fabricmc:yarn:${project.properties["yarn_mappings"]}:v2")
    modImplementation("net.fabricmc:fabric-loader:${project.properties["loader_version"]}")
    modImplementation("net.fabricmc.fabric-api:fabric-api:${project.properties["fabric_version"]}")
    modImplementation("net.fabricmc:fabric-language-kotlin:${project.properties["fabric_kotlin_version"]}")

    shadowModImpl("org.notenoughupdates.moulconfig:modern-1.21.1:${project.properties["moulconfig_version"]}") {
        exclude("org.jetbrains.kotlin")
        exclude("org.jetbrains.kotlinx")
    }
    include("org.notenoughupdates.moulconfig:modern-1.21.1:${project.properties["moulconfig_version"]}")
}

tasks {
    processResources {
        inputs.property("version", project.version)
        filesMatching("fabric.mod.json") {
            expand("version" to project.version)
        }
    }

    shadowJar {
        archiveClassifier.set("all-dev")
        configurations = listOf(shadowModImpl)
        relocate("io.github.notenoughupdates.moulconfig", "at.LegentPc.Chatter.deps.moulconfig")
    }

    named<net.fabricmc.loom.task.RemapJarTask>("remapJar") {
        dependsOn(shadowJar)
        inputFile.set(shadowJar.get().archiveFile)
    }

    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        compilerOptions.jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_21)
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

plugins {
    id("fabric-loom") version "1.15-SNAPSHOT"
    kotlin("jvm") version "2.3.21"
}

version = "${project.properties["mod_version"]}-mc${project.properties["minecraft_version"]}"
group = project.properties["maven_group"] as String

base {
    archivesName.set(project.properties["archives_base_name"] as String)
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

    modImplementation("org.notenoughupdates.moulconfig:modern-1.21.11:${project.properties["moulconfig_version"]}")
    include("org.notenoughupdates.moulconfig:modern-1.21.11:${project.properties["moulconfig_version"]}")
}

tasks {
    processResources {
        inputs.property("version", project.version)
        filesMatching("fabric.mod.json") {
            expand("version" to project.version)
        }
    }

    withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        compilerOptions.jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_21)
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

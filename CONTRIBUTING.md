# Contributing

## Coding Styles and Conventions

### Version-Safe Code Rules

- **Version-Safe Code**: Code likho jo current aur modern versions dono par compatible ho  
- **API Compatibility**: Sirf wahi APIs use karo jo sabhi versions mein available hain  
- **Conditional Logic**: Version-specific code ke liye proper checks lagao  
- **No Hardcoded Versions**: Version numbers directly code mein mat likho  

## Language & Style Guidelines

### Kotlin & Java

- Project Kotlin aur Java dono use karta hai  
- Kotlin coding conventions follow karo (official Kotlin style guide)  
- Clean, readable code likho  
- Proper comments add karo  

### Project Structure

```text
src/
├── main/
│   ├── kotlin/    # Kotlin source files
│   └── java/      # Java source files
└── ...
```

## Git Workflow for Contributors

1. Fork the repository  
2. Clone your fork locally  
3. Create a new branch for your feature/fix  
4. Make your changes  
5. Test thoroughly  
6. Commit with clear messages  
7. Push to your fork  
8. Create a Pull Request  

## Important Notes

- **Auto-download**: Dependencies automatically download hote hain jab pehli baar project import karo  
- **Debugging**: Live debugging ke liye IDE setup zaroori hai  

---

## Rules (Mandatory)

Please read and follow all rules strictly before contributing.

1. Read the `CONTRIBUTING.md` file before making any changes.  
2. Do not use `@Suppress` in code.  
3. Use `private` wherever possible (e.g., `private val`, `private fun`). Avoid unnecessary public access.  
4. When sharing code, always include proper line references.  
5. Code should look human-written. Avoid patterns that clearly look AI-generated.  
6. Keep code simple and readable.  
7. When suggesting replacements:
   - Mention exact line numbers  
   - Mention file name above the code  
   - No need for line numbers in new files  
8. Clearly mention:
   - What existed before  
   - What has been changed  
   - If replacement fails, include surrounding lines  
9. Do not perform or suggest actions like push, pull, or PR.  
10. Do not use comments (`//`) inside code when sharing it.  
11. All dependencies must use stable releases.  
   - If stable is not available, then beta/alpha of the same version can be used.  
   - If I tell you to do this, then do it, only this time you can break the rules.
12. Code must not contain warnings (including yellow warnings).  
13. Take proper time. Do not rush. Quality matters.  
14. Avoid temporary or hacky solutions. Create proper files and structure when needed.  
15. Code must not contain typos.  
16. Always provide full file paths (e.g., `src/main/java/...`).  
17. Provide all related code and changes together.  
18. Before implementing any feature/fix/improvement:
   - Review at least 4–5 similar files in the project  
   - Then provide the final code  
   
# Contributing

## Coding Styles and Conventions

### Version-Safe Code Rules

- **Version-Safe Code**: Write code that is compatible with both current and modern versions.
- **API Compatibility**: Sirf wahi APIs use karo jo sabhi versions mein available hain  
- **Conditional Logic**: Apply proper checks for version-specific code.
- **No Hardcoded Versions**: Version numbers directly code mein mat likho  

## Language & Style Guidelines

### Kotlin & Java

- The project uses both Kotlin and Java.
- Follow Kotlin coding conventions (official Kotlin style guide).
- Write clean, readable code.
- Add proper comments.

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

- **Auto-download**: Dependencies are downloaded automatically when you import the project for the first time.
- **Debugging**: IDE setup required for live debugging

---

## Testing

- Please test your features thoroughly before submitting a PR!
- Screenshots or showcases would also accelerate the review process of your PR and are strongly suggested.
- Please note clearly in the PR if it has not been tested.
- PR Title and Description should be as per the template 

- Unit tests are also strongly encouraged. Note that you can create unit tests for methods containing Minecraft classes. See ItemUtilsTest for an example.

- Thank you for contributing to Chatter, and hope you have fun!

---

## Rules (Mandatory)

#### Please read and follow all rules strictly before contributing.

1. Read the `CONTRIBUTING.md` file before making any changes.  
2. Do not use `@Suppress` in code:
   - Use @Suppress only where it is necessary.
3. Use `private` wherever possible (e.g., `private val`, `private fun`):
   - Avoid unnecessary public access.
   - Sometimes feature not work if you use private val, private fun.
4. Keep code simple and readable.
5. Take proper time. Do not rush. Quality matters.
6. Do not use //TODO in code:
   - Use TODO only when it is absolutely necessary.
7. Code must not contain warnings (including yellow warnings):
   - There may be some warnings
8. Avoid temporary or hacky solutions. Create proper structure and files when needed.
9. All dependencies must use stable releases:
   - If stable is not available, then beta/alpha of the same version can be used.
   - If I tell you to do this, then do it, only this time you can break the rules.

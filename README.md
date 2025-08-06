# 🔐 Password Authenticator – Java Console App

## 📝 Description

This is a **Java command-line password authenticator** that prompts the user to create a strong password, confirms it, and validates it against a set of secure rules. No files, no fluff – just straight-up password strength validation via the terminal.

Perfect for learning input validation, condition checks, and good security practices.

---

## 💡 Features

- ✅ Command-line based – runs in any terminal or command prompt
- ✅ Validates passwords based on multiple strong security criteria
- ❌ Removed file-saving (no more writing to `passwords.txt`, because that was sus 😏)
- 🔁 Keeps asking until the password is 💯

---

## 🔒 Password Requirements

To be accepted, the password must:

- Be **at least 8 characters** long
- Contain **at least one uppercase letter** (e.g. `A`)
- Contain **at least one lowercase letter** (e.g. `b`)
- Contain **at least one digit** (e.g. `3`)
- Contain **at least one special character** (e.g. `@`, `#`, `!`, etc.)

---

## 🖥️ How to Use

### 1. Compile the program

```
javac passwordAuthenticator.java
```
### 2. Run it
```
java passwordAuthenticator
```
### 3. Follow the prompts

Enter your password:
> P@ssword123

Please confirm your password:
> P@ssword123

✅ Password has been successfully created!

## 🛠️ Requirements
Java JDK 8 or higher
Any terminal (Command Prompt, bash, PowerShell, etc.)



## 📚 Educational Uses
This app is great for:

Learning user input handling in Java

Understanding conditional checks and loops

Exploring password strength validation



🧠 Author
Sahar the Code Slayer
Made with love (and logic).

# 🧪 Selenium Automation with GitHub Actions

Automated Selenium testing pipeline built with **Java**, **Maven**, and **GitHub Actions**.  
This project runs browser-based tests (like Google Search automation) in a **headless Chrome** environment whenever you push code.

---
## 📁 Project Structure
```
Selenium-GitHub_Action/
├── src/
│ └── main/java/com/example/
│ └── GoogleSearch.java
├── .github/
│ └── workflows/
│ └── selenium.yml
├── pom.xml
└── README.md
```
---

## ⚙️ Prerequisites

Before you begin, make sure you have:

- 🧰 **Java 17+**
- 🧱 **Maven 3.8+**
- 🌐 **Google Chrome** (latest)
- ☁️ (Optional) **GitHub Account** for CI/CD

---

## 🛠️ Installation & Setup (Local)

1. **Clone the repository**

   git clone https://github.com/Nandkishor-Jagtap/Selenium-GitHub_Action.git
   cd Selenium-GitHub_Action
   
Install dependencies


mvn clean install
Run the test locally

mvn -q compile exec:java -Dexec.mainClass="com.example.GoogleSearch"

🤖 Run with GitHub Actions (CI/CD)

Once pushed to GitHub, the workflow in
.github/workflows/selenium.yml will automatically:

Set up Java and Maven

Install dependencies

Run your Selenium test in a headless Chrome browser

Show logs under the Actions tab

You can check the output in:

GitHub → Actions → Latest Run → Logs
🧾 Example Output

Page title is: https://www.google.com/search?q=Selenium+WebDriver
Cleaning up orphan processes

✅ Indicates that the test executed successfully.

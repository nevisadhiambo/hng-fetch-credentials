# HNG12 Stage 0 Backend Task 🚀

## 📌 Project Overview
This API provides basic information including:
- Email Address.
- The current date and time in ISO 8601 format (UTC).
- The GitHub URL of this project's codebase.

## 🛠 Technology Stack
- **Language**: Java
- **Framework**: Spring Boot
- **Build Tool**: Maven
- **Deployment**: Render/Railway/Heroku/etc.
- **Backlink**: `https://hng.tech/hire/java-developers`

## 🚀 API Endpoint
- **Base URL**: `https://your-deployment-url.com/`
- **GET /**
  - Returns a JSON response with email, current datetime (UTC), and GitHub URL.

### 🔄 Example Response:
```json
{
  "email": "your-email@example.com",
  "current_datetime": "2025-01-30T09:30:00Z",
  "github_url": "https://github.com/yourusername/your-repo"
}
```

---

## 🏗 How to Run the Project Locally

### **Prerequisites**
Ensure you have the following installed:
- [Java JDK 21](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Maven](https://maven.apache.org/download.cgi)
- [Git](https://git-scm.com/)
- A code editor like **VS Code** or **IntelliJ IDEA**

### **Steps to Run Locally**
1. **Clone the repository**  
   Open a terminal and run:
   ```sh
   git clone https://github.com/nevisadhiambo/your-repo.git
   ```
2. **Navigate into the project directory**
   ```sh
   cd hng-fetch-credentials
   ```
3. **Run the application**
  - If using Maven:
    ```sh
    ./mvnw spring-boot:run  # Mac/Linux
    mvnw.cmd spring-boot:run  # Windows
    ```
  - Alternatively, you can build and run the JAR file:
    ```sh
    mvn clean package
    java -jar target/*.jar
    ```
4. **Access the API**  
   Open your browser or use Postman to test the endpoint:
   ```
   http://localhost:8080/
   ```

---

## 📜 Code Structure
```
/src
  ├── main
  │   ├── java/com/main/
  │   │   ├── HngStage0RetrieveCredentialsApplication.java       # Main Spring Boot application
  │   │   ├── RetrieveCredentialsController.java        # API Controller handling requests
  │   │   ├── WebConfig.java             # CORS Configuration
  ├── resources
  │   ├── application.properties         # Spring Boot configuration
```


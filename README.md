# HNG12 Stage 0 Backend Task 🚀

## 📌 Project Overview
This API provides basic information including:
- Your registered email address on the HNG12 Slack workspace.
- The current date and time in ISO 8601 format (UTC).
- The GitHub URL of the project's codebase.

## 🛠 Technology Stack
- **Language**: Java
- **Framework**: Spring Boot
- **Build Tool**: Maven
- **Deployment**: Render/Railway/Heroku/etc.

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


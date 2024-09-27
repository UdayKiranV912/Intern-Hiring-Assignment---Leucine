
# College Directory Application

## Backend

This repository contains the backend and frontend code for the College Directory Application. The application uses **Spring Boot** and **PostgreSQL** for the backend, and **ReactJS** for the frontend.

---

### Backend Overview

The backend is developed using **Java** and **Spring Boot**, providing RESTful APIs to handle authentication, profile management, course management, and student/faculty data. The database used is **PostgreSQL**.

#### Technologies Used

- Java
- Spring Boot
- Spring Security (JWT Authentication)
- PostgreSQL
- Maven

---

### Backend Features

- User authentication (JWT-based)
- Role-based access control (Student, Faculty Member, Administrator)
- CRUD operations for users, profiles, and courses
- API endpoints for managing students, faculty, and administrators
- Graphical dashboard for administrators

---

### Backend Setup Instructions

1. **Clone the repository**:

    ```bash
    git clone https://github.com/UdayKiranV912/Intern-Hiring-Assignment---Leucine
    cd college-directory-backend
    ```

2. **Configure PostgreSQL**:

    Update `src/main/resources/application.properties` with your PostgreSQL credentials:

    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:8000/collegedirectory
    spring.datasource.username=your_db_user
    spring.datasource.password=your_db_password
    ```

3. **Run the backend**:

    Install the required dependencies and run the application using Maven:

    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

---

### Backend Deployment (Heroku)

1. Install Heroku CLI.

2. Create a Heroku app:

    ```bash
    heroku create college-directory-backend
    ```

3. Add PostgreSQL:

    ```bash
    heroku addons:create heroku-postgresql:hobby-dev
    ```

4. Push the code to Heroku:

    ```bash
    git push heroku main
    ```

---

### Backend API Endpoints

- **Login**: `/login` (POST) - Authenticates a user and returns a JWT.
- **Students**: `/students/profile/{id}` (GET) - Retrieves student profile data.
- **Faculty**: `/faculty/manage` (GET) - Fetches class list for faculty members.
- **Admin**: `/admin/dashboard` (GET) - Displays administrative dashboard.

#### Example API Call for Login

```json
POST /login
{
  "username": "student1",
  "password": "password123"
}
```

---

## Frontend

The frontend is developed using **ReactJS**. It provides a user interface for students, faculty, and administrators to interact with the backend. Axios is used for HTTP requests, and React Router is used for navigation.

#### Technologies Used

- React
- React Router DOM
- Axios
- CSS for styling

---

### Frontend Features

- Role-based login (Student, Faculty Member, Administrator)
- Dynamic routing based on user roles
- Profile management interface for students and faculty
- Administrator dashboard with data visualization

---

### Frontend Setup Instructions

1. **Clone the repository**:

    ```bash
    git clone https://github.com/UdayKiranV912/Intern-Hiring-Assignment---Leucine
    cd college-directory-frontend
    ```

2. **Install dependencies**:

    ```bash
    npm install
    ```

3. **Create a `.env` file**:

    Set the API URL for the backend in a `.env` file:

    ```bash
    REACT_APP_API_URL=http://localhost:8080
    ```

4. **Run the frontend**:

    Start the development server:

    ```bash
    npm start
    ```

---

### Frontend Deployment (Vercel)

1. Install the Vercel CLI.

2. Build the project:

    ```bash
    npm run build
    ```

3. Deploy the frontend:

    ```bash
    vercel
    ```

---

### License

This project is licensed under the MIT License.

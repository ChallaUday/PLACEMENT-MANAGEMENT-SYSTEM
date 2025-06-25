
# Placement_Management_System

The **Placement Management System** is a web application built with Spring Boot for the backend and plain HTML/CSS/JavaScript for the frontend, developed as part of the **TNS India Foundation** **Java Full Stack** training. It provides CRUD operations for managing admin users, includes login functionality, and a CRUD operations page, all designed to be user-friendly and responsive.
## Features

- **Login Page**: Allows admins to log in using their credentials.


- **CRUD Operations**:


  - Fetch admin details by ID
  - Save new admin
  - Update existing admin details
  - Delete an admin
- **View Admins**: Display a list of all admins.
- **Logout**: Logs out the current user and returns to the login page.

## Technologies Used

- **Backend**: Spring Boot
- **Frontend**: HTML, CSS, JavaScript
- **Database**: MySQL

## Setup Instructions

### Prerequisites

- **Java JDK 17** or later
- **MySQL Server** (or any other compatible database)
- **Maven** (for building the Spring Boot application)
- **Node.js** (for running the frontend server if applicable)

### Backend Setup

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Udaychalla/placement-management-system.git
   ```

2. **Navigate to the Project Directory**:
   ```bash
   cd placement-management-system
   ```

3. **Configure the Application**:
   - Open `src/main/resources/application.properties` and update the database URL, username, and password as per your MySQL setup.

4. **Build and Run the Spring Boot Application**:
   ```bash
   ./mvnw spring-boot:run
   ```
   The application will be accessible at `http://localhost:8081`.

### Frontend Setup

1. **Navigate to the Frontend Directory** (if it's a separate directory):
   ```bash
   cd frontend
   ```

2. **Run the Frontend Server**:
   ```bash
   # Assuming you are using a local server
   npm start
   ```
   The frontend will be accessible at `http://127.0.0.1:3000/`.

## Usage

1. **Login**:
   - Open the login page in your browser (`Placement_Mgmt_System.html`).
   - Enter your admin credentials and click `Login`.

2. **Perform CRUD Operations**:
   - **Fetch Admin By ID**: Enter an ID and click `Fetch`.
   - **Save Admin**: Enter the name and password, then click `Save`.
   - **Update Admin**: Enter the ID, new name, and password, then click `Update`.
   - **Delete Admin**: Enter the ID and click `Delete`.
   - **View Admins**: Click `View Admins` to see a list of all admins.

3. **Logout**:
   - Click the `Logout` button to return to the login page.

## Contribution and Acknowledgements

This project was developed as part of the **TNS India Foundation** Java Full Stack training program. I managed the Admin Entity within the project among the team. Special thanks to the training team for their guidance and support.

## Contributing

If you would like to contribute to this project, please fork the repository and submit a pull request with your changes. Ensure that you follow the coding standards and include relevant tests.

## Contact

For any questions or issues, please contact [CHALLA UDAY KIRAN](mailto:udaychalla03@gmail.com).

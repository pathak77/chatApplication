# Java Chat Application

This is a real-time chat application built using Java, designed to facilitate seamless communication between users. The project is developed and tested using the NetBeans IDE, ensuring a robust and feature-rich development environment.

## Features

- Real-time messaging between multiple users
- User-friendly graphical interface
- Database integration for storing chat history and user information
- Support for multiple chat rooms or private messaging
- Easy setup with included libraries

## Prerequisites

To run this project, ensure you have the following installed:

- **Java Development Kit (JDK)**: Version 8 or higher. Download from [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html).
- **NetBeans IDE**: Latest version recommended for full compatibility. Download from [NetBeans Official Site](https://netbeans.apache.org/download/index.html).
- **Database**: A relational database (e.g., MySQL) configured to store chat data. Refer to the database setup section for details.
- **Git**: For cloning the repository. Download from [Git Official Site](https://git-scm.com/downloads).

## Installation

Follow these steps to set up and run the project:

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Pathak-77/chatApplication.git

2. Open in NetBeans:

3. Launch NetBeans IDE.
   Select File > Open Project and navigate to the cloned chatApplication folder.


4. Add Required Libraries:

   All necessary libraries are included in the libraries folder within the repository.
   To add them to your project:

   Right-click on the project name in the "Projects" window.
   Select Properties.
   Navigate to the Libraries category.
   Click Add JAR/Folder and select all JAR files from the libraries folder.
   Click OK to save.




## Database Configuration:

   1. The application uses a database to store user data and chat history.
   2. Check the database_dump.sql file in the repository for the database schema and sample data.
   3. Import the SQL dump into your database management system (e.g., MySQL Workbench).
   4. Update the database configuration in the project (e.g., in a config.properties file or equivalent) with your database credentials:

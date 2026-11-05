# Student Grade Management System

A JavaFX desktop application for managing student records and grades, developed as an academic group project. The application was developed and successfully tested by the project team in NetBeans.

## Features
- Login screen with demonstration credentials
- Add students and assign grades
- View student details
- Save and load student records using Java object serialization (`data.bin`)
- Generate grade statistics: average, pass/fail counts, and above/below-average counts

## Technologies
Java, JavaFX, FXML, CSS, Java Collections, Java Serialization, NetBeans.

## Project structure
- `src/main/java/com/mycompany/studentmanageproject/` — Java application, model, and controllers
- `src/main/resources/com/mycompany/studentmanageproject/` — FXML screens, CSS, and background image
- `pom.xml` — Maven/JavaFX build configuration prepared for portfolio sharing

## Run
1. Install JDK 17+ and Apache Maven, or open the Maven project in NetBeans.
2. From the project directory, run `mvn clean javafx:run`.
3. The application opens at the login screen. Demo credentials are defined in `App.java`.

**Note:** The team tested the original application in NetBeans. The Maven packaging in this repository has not been independently compiled or tested; the environment may require JavaFX setup adjustments. Data is saved locally to `data.bin` when the Save action is used. Do not use real student records or credentials in this demonstration project.

## Contribution
Academic group project. Retal Alkabawi reports implementing all parts of the application, including UI, student management, grades, file operations, and reports, as part of the team project.

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.studentmanageproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
/**
 * Student Management System
 * Team Members:
 * - Name: Retal Alkabawi
 * - Name: Safaa Ahmed Sobh
 * - Name: Wasn Hussien Alwafi
 * Group: 8
 */

/**
 * Controller class for adding new students
 */
public class AddStudentController implements Initializable {

    // TextField for entering student name
    @FXML
    TextField Nametxt;
    // TextField for entering student ID
    @FXML
    TextField IDtxt;
    // Label for displaying messages
    @FXML
    Label AddResult;

    /**
     * Initialize the Add Student screen
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // No initialization required
    }

    /**
     * Add a new student to the system
     */
    @FXML
    private void AddStudents() throws IOException {
        // Validate that all required fields are filled
        if (IDtxt.getText().isEmpty() || Nametxt.getText().isEmpty()) {
            AddResult.setText("All required fields must be filled");

        } else {
            // Read student information from input fields
            int ID = Integer.parseInt(IDtxt.getText());
            String name = Nametxt.getText();
            // Create a new student object
            Students student = new Students(name, ID);
            // Add student to the student list
            App.allStudents.add(student);
            // Display success message
            AddResult.setText("Student added successfully");
            // Clear input fields
            Nametxt.clear();
            IDtxt.clear();
        }
    }

    /**
     * Return to Dashboard screen
     */
    @FXML
    private void Back() throws IOException {
        App.setRoot("Dashboard");
    }

}

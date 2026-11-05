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
 * Controller class for managing student grades
 */
public class AddGradesController implements Initializable {
    
    // ComboBox for displaying student IDs
    @FXML
    ComboBox StudentIDs;
    // TextField for entering student grade
    @FXML
    TextField Gradetxt;
    // Label for displaying status messages
    @FXML
    Label Graderesult;
    // Button for adding grades
    @FXML
    Button AddGrade;

    /**
     * Initialize the screen and load student IDs
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Clear previous items from ComboBox
        StudentIDs.getItems().clear();
        // Display message if there are no students
        if (App.allStudents.size() == 0) {
            Graderesult.setText("There is no students, please add students");
        }
        // Load all student IDs into the ComboBox
        for (Students student : App.allStudents) {
            StudentIDs.getItems().add(student.ID);

        }

    }

    /**
     * Add a grade to the selected student
     */
    @FXML
    private void AddGrade() throws IOException {
        // Check that at least one student exists
        if (App.allStudents.size() > 0) {
            // Validate that the grade field is not empty
            if (Gradetxt.getText().isEmpty()) {
                Graderesult.setText("All required fields must be filled");

            } else {
                // Get selected student ID
                int ID = (int) StudentIDs.getSelectionModel().getSelectedItem();
                // Search for the selected student and update grade
                for (Students student : App.allStudents) {
                    if (student.getID() == ID) {
                        student.setScore(Double.parseDouble(Gradetxt.getText()));
                    }
                    // Display success message
                    Graderesult.setText("Grade added successfully");
                }
            }
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

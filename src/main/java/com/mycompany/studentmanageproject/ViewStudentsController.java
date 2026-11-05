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
 * Controller class for View Students screen
 */
public class ViewStudentsController implements Initializable {
    // ComboBox for selecting student IDs

    @FXML
    ComboBox StudentIDs;
    // Label used to display student information
    @FXML
    Label Viewresult;

    /**
     * Initialize the screen and load student IDs
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Clear previous items from ComboBox
        StudentIDs.getItems().clear();
        // Display message if there are no students
        if (App.allStudents.size() == 0) {
            Viewresult.setText("There is no students, please add students");
        }
        // Load all student IDs into the ComboBox
        for (Students student : App.allStudents) {
            StudentIDs.getItems().add(student.ID);

        }

    }

    /**
     * Display selected student information
     */
    @FXML
    private void ViewStudents() throws IOException {
        // Check if there are students in the system
        if (App.allStudents.size() > 0) {
            // Get selected student ID
            int ID = (int) StudentIDs.getSelectionModel().getSelectedItem();
            // Search for the selected student
            for (Students student : App.allStudents) {
                // Display student details
                if (student.getID() == ID) {
                    Viewresult.setText("Student name: " + student.getName() + "\nStudent ID: " + student.getID() + "\n Grade: " + student.getScore());
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

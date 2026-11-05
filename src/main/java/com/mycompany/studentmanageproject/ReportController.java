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
 * Controller class for Reports screen
 */
public class ReportController implements Initializable {

    // Label used to display report statistics
    @FXML
    Label Reporttxt;

    /**
     * Generate and display report information
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Check if there are students in the system
        if (App.allStudents.size() > 0) {
            // Variables used for report calculations
            double total = 0;
            double average = 0;
            int countpass = 0;
            int countfail = 0;
            int countaboveaverage = 0;
            int countbelowaverage = 0;

            // Calculate total grades
            for (Students student : App.allStudents) {

                total += student.getScore();
            }
            // Calculate average grade
            average = total / App.allStudents.size();

            // Count passed, failed, above-average and below-average students
            for (Students student : App.allStudents) {

                if (student.getScore() > 60) {
                    countpass++;
                } else {
                    countfail++;
                }

                if (student.getScore() > average) {
                    countaboveaverage++;
                } else {
                    countbelowaverage++;
                }
            }
            // Display report results
            Reporttxt.setText("The total number of students: " + App.allStudents.size() + "\nThe average of grades: " + average + "\nNumber of passed students: " + countpass + "\nNumber of failed students: " + countfail + "\nThe number of above average students: " + countaboveaverage + "\nThe number of above below students: " + countbelowaverage);
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

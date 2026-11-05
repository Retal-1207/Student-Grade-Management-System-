package com.mycompany.studentmanageproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
/**
 * Student Management System
 * Team Members:
 * - Name: Retal Alkabawi
 * - Name: Safaa Ahmed Sobh
 * - Name: Wasn Hussien Alwafi
 * Group: 8
 */

/**
 * Controller class for Dashboard screen
 */
public class DashboardController {

    // Label used to display status messages
    @FXML
    Label resulttlabel;

    /**
     * Open Add Student screen
     */
    @FXML
    private void AddStudents() throws IOException {
        App.setRoot("AddStudent");
    }

    /**
     * Open View Students screen
     */
    @FXML
    private void ViewStudent() throws IOException {
        App.setRoot("ViewStudents");
    }

    /**
     * Open Add Grades screen
     */
    @FXML
    private void AddGrade() throws IOException {
        App.setRoot("AddGrades");
    }

    /**
     * Save all students data to file
     */
    @FXML
    private void SaveToFile() throws IOException {
        try {
            // Create or replace the data file
            File f = new File("data.bin");
            f.delete();//to delete any other text file so the program doesn't waste time searching through them all
            // Write students data to file
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.bin"));
            oos.writeObject(App.allStudents);
            // Display success message
            resulttlabel.setText("Successfully saved " + App.allStudents.size() + " students to file");
            oos.close();
        } catch (IOException e) {
            // Display error message
            resulttlabel.setText("Error in saving file: " + e.getMessage());

        }
    }

    /**
     * Load students data from file
     */
    @FXML
    private void ReadFromFile() throws IOException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.bin"))) {
            // Clear current student list
            App.allStudents.clear();
            // Read students from file
            App.allStudents = (ArrayList<Students>) ois.readObject();
            // Display success message
            resulttlabel.setText("Successfully loaded " + App.allStudents.size() + " students from file");
        } catch (IOException | ClassNotFoundException e) {
            // Display error message
            resulttlabel.setText("Error loading from file: " + e.getMessage());
        }

    }

    /**
     * Open Reports screen
     */
    @FXML
    private void Report() throws IOException {
        App.setRoot("Report");
    }
}

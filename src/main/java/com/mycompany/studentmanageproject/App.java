package com.mycompany.studentmanageproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
/**
 * Student Management System
 * Team Members:
 * - Name: Retal Alkabawi
 * - Name: Safaa Ahmed Sobh
 * - Name: Wasn Hussien Alwafi
 * Group: 8
 */

/**
 * Main application class for Student Grade Management System
 */
public class App extends Application {

    // Main application scene
    private static Scene scene;
    // Login credentials
    final static String username = "admin";
    final static String password = "12345";
    // List that stores all students
    public static ArrayList<Students> allStudents = new ArrayList<Students>();

    /**
     * Start the application and load Login Screen
     */
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("LoginScreen"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Switch between application screens
     */
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    /**
     * Load FXML file and return its root node
     */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    /**
     * Application entry point
     */
    public static void main(String[] args) {
        launch();
    }

}

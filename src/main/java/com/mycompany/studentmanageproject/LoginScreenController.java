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
 * Controller class for Login screen
 */
public class LoginScreenController implements Initializable {

    // TextField for entering password
    @FXML
    TextField Passwordtxt;
    // TextField for entering username
    @FXML
    TextField userNametxt;
    // Label for displaying login messages
    @FXML
    Label result;

    /**
     * Initialize the Login screen
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // No initialization required
    }

    /**
     * Validate user login credentials
     */
    @FXML
    private void switchToSecondary() throws IOException {
        // Check that all required fields are filled
        if (userNametxt.getText().isEmpty() || Passwordtxt.getText().isEmpty()) {
            result.setText("All required fields must be filled");
        } else {
            // Verify username and password
            if (Passwordtxt.getText().equals(App.password) && userNametxt.getText().equals(App.username)) {
                // Open Dashboard screen
                App.setRoot("Dashboard");
            } else {
                // Display error message
                result.setText("User name or password are not correct");

            }
        }
    }
}

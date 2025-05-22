package com.example;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    Label usernamelabel;

    @FXML
    Label passwordlabel;

    @FXML
    TextField usernametextfield;

    @FXML
    TextField passwordtextfield;

    @FXML
    Button loginbutton;

    public void loginbuttonHandler(ActionEvent event) throws IOException {
        String uname = usernametextfield.getText().trim();
        String pword = passwordtextfield.getText().trim();
        System.out.println("hello");
        File accountsfile = new File("accounts.txt");

        if (accountsfile.createNewFile()) {
            System.out.println("File created: " + accountsfile.getName());
        } else {
            System.out.println("File already exists.");
        }

        boolean loginSuccessful = false;
        Scanner filescanner = new Scanner(accountsfile);

        while (filescanner.hasNextLine()) {
            String data = filescanner.nextLine().trim();
            if (!data.isEmpty()) {
                String[] parts = data.split(",");
                if (parts.length >= 2) {
                    String fileUsername = parts[0].trim();
                    String filePassword = parts[1].trim();

                    if (fileUsername.equals(uname) && filePassword.equals(pword)) {
                        loginSuccessful = true;
                        break;
                    }
                }
            }
        }

        filescanner.close();

        if (loginSuccessful) {
            System.out.println("Login successful.");
            App.setRoot("Home");
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login Failed");
            alert.setHeaderText(null);
            alert.setContentText("Invalid username or password.");
            alert.showAndWait();
        }
    }
}

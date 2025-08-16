package cse213.group19fc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminDashboardController {

    @FXML
    private Button exportUserDataButton;

    @FXML
    private Button generateReportsButton;

    @FXML
    private Button logoutButton;

    @FXML
    private Button searchUsersButton;

    @FXML
    private Label statusLabel;

    @FXML
    private Button systemStatisticsButton;

    @FXML
    private Button updateUserStatusButton;

    @FXML
    private Button viewAllProjectsButton;

    @FXML
    private Button viewAllUsersButton;

    @FXML
    private Button viewUserDetailsButton;

    private Scene scene;

    @FXML
    void handleExportUserData(ActionEvent event) {
        switchScene(event, "/cse213/group19fc/Samira/AdminExportUserData.fxml");
    }

    @FXML
    void handleGenerateReports(ActionEvent event) {
        switchScene(event, "/cse213/group19fc/Samira/AdminGenerateReport.fxml");
    }

    @FXML
    void handleLogout(ActionEvent event) {
        switchScene(event, "/cse213/group19fc/loginScene.fxml");
    }

    @FXML
    void handleSearchUsers(ActionEvent event) {
        switchScene(event, "/cse213/group19fc/Samira/AdminSearchUsers.fxml");
    }

    @FXML
    void handleSystemStatistics(ActionEvent event) {
        switchScene(event, "/cse213/group19fc/Samira/AdminSystemStatistics.fxml");
    }

    @FXML
    void handleUpdateUserStatus(ActionEvent event) {
        switchScene(event, "/cse213/group19fc/Samira/AdminUpdateUserStatus.fxml");
    }

    @FXML
    void handleViewAllProjects(ActionEvent event) {
        switchScene(event, "/cse213/group19fc/Samira/AdminViewAllProjects.fxml");
    }

    @FXML
    void handleViewAllUsers(ActionEvent event) {
        switchScene(event, "/cse213/group19fc/Samira/AdminViewAllUsers.fxml");
    }

    @FXML
    void handleViewUserDetails(ActionEvent event) {
        switchScene(event, "/cse213/group19fc/Samira/AdminViewUserDetails.fxml");
    }

    private void switchScene(ActionEvent event, String fxmlFile) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
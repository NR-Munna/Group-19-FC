package cse213.group19fc;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HRManagerDashboardController {

    @FXML
    private Button scheduleInterviewBtn;
    @FXML
    private Button updateContactBtn;
    @FXML
    private Button viewRatingsBtn;
    @FXML
    private Button manageLeaveBtn;
    @FXML
    private Button employeeRecordsBtn;
    @FXML
    private Button manageFreelancerBtn;
    @FXML
    private Button trackTrainingBtn;
    @FXML
    private Button calculateSalaryBtn;
    @FXML
    private Button logoutBtn;

    private Scene scene;

    @FXML
    private void onScheduleInterview(ActionEvent event) {
        switchScene(event, "/cse213/group19fc/Munna/scheduleInterview.fxml");
    }

    @FXML
    private void onUpdateContact(ActionEvent event) {
        switchScene(event, "/cse213/group19fc/Munna/updateContact.fxml");
    }

    @FXML
    private void onViewRatings(ActionEvent event) {
        switchScene(event, "/cse213/group19fc/Munna/viewRatings.fxml");
    }

    @FXML
    private void onManageLeave(ActionEvent event) {
        switchScene(event, "/cse213/group19fc/Munna/manageLeave.fxml");
    }

    @FXML
    private void onEmployeeRecords(ActionEvent event) {
        switchScene(event, "/cse213/group19fc/Munna/employeeRecords.fxml");
    }

    @FXML
    private void onManageFreelancer(ActionEvent event) {
        switchScene(event, "/cse213/group19fc/Munna/manageFreelancer.fxml");
    }

    @FXML
    private void onTrackTraining(ActionEvent event) {
        switchScene(event, "/cse213/group19fc/Munna/trackTraining.fxml");
    }

    @FXML
    private void onCalculateSalary(ActionEvent event) {
        switchScene(event, "/cse213/group19fc/Munna/calculateSalary.fxml");
    }

    @FXML
    private void onLogout(ActionEvent event) {

        switchScene(event, "loginScene.fxml");
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
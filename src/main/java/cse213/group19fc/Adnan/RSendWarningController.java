package cse213.group19fc.Adnan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class RSendWarningController {

    @FXML
    private Button backBtn;

    @FXML
    private TableColumn<?, ?> currentRatingCol;

    @FXML
    private TableColumn<?, ?> emailCol;

    @FXML
    private TableColumn<?, ?> freelancerIdCol;

    @FXML
    private TableColumn<?, ?> lastWarningCol;

    @FXML
    private TableView<?> lowRatedFreelancersTable;

    @FXML
    private ComboBox<?> messageTypeCombo;

    @FXML
    private TableColumn<?, ?> nameCol;

    @FXML
    private TableColumn<?, ?> projectsCompletedCol;

    @FXML
    private ComboBox<?> ratingThresholdCombo;

    @FXML
    private Button sendWarningBtn;

    @FXML
    private Button sortBtn;

    @FXML
    private TextArea warningMessageArea;

    @FXML
    void handleBack(ActionEvent event) {

    }

    @FXML
    void handleSendWarning(ActionEvent event) {

    }

    @FXML
    void handleSort(ActionEvent event) {

    }

}

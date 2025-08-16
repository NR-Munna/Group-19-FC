package cse213.group19fc.Samira;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class AdminExportUserDataController {

    @FXML
    private CheckBox accountInfoCheckBox;

    @FXML
    private CheckBox activityLogCheckBox;

    @FXML
    private Button backButton;

    @FXML
    private CheckBox basicInfoCheckBox;

    @FXML
    private Button clearSelectionButton;

    @FXML
    private CheckBox contactInfoCheckBox;

    @FXML
    private RadioButton csvRadioButton;

    @FXML
    private TableColumn<?, ?> emailColumn;

    @FXML
    private Label errorLabel;

    @FXML
    private Button generatePdfButton;

    @FXML
    private TableColumn<?, ?> idColumn;

    @FXML
    private CheckBox includeHeadersCheckBox;

    @FXML
    private TableColumn<?, ?> nameColumn;

    @FXML
    private CheckBox paymentInfoCheckBox;

    @FXML
    private RadioButton pdfRadioButton;

    @FXML
    private Button previewButton;

    @FXML
    private CheckBox profileInfoCheckBox;

    @FXML
    private CheckBox projectHistoryCheckBox;

    @FXML
    private CheckBox ratingsCheckBox;

    @FXML
    private Button selectAllUsersButton;

    @FXML
    private TableColumn<?, ?> selectColumn;

    @FXML
    private Label selectedCountLabel;

    @FXML
    private TableColumn<?, ?> statusColumn;

    @FXML
    private Label successLabel;

    @FXML
    private TableColumn<?, ?> typeColumn;

    @FXML
    private TableView<?> usersTable;

    @FXML
    void handleBack(ActionEvent event) {

    }

    @FXML
    void handleClearSelection(ActionEvent event) {

    }

    @FXML
    void handleGeneratePDF(ActionEvent event) {

    }

    @FXML
    void handlePreview(ActionEvent event) {

    }

    @FXML
    void handleSelectAllUsers(ActionEvent event) {

    }

}

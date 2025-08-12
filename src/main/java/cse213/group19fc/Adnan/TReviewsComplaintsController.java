package cse213.group19fc.Adnan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class TReviewsComplaintsController {

    @FXML
    private RadioButton allReviewsRadio;

    @FXML
    private Button applyFilterBtn;

    @FXML
    private RadioButton complaintsRadio;

    @FXML
    private RadioButton negativeReviewsRadio;

    @FXML
    private RadioButton positiveReviewsRadio;

    @FXML
    private TableColumn<?, ?> priorityColumn;

    @FXML
    private TableColumn<?, ?> ratingColumn;

    @FXML
    private TextArea responseNotesArea;

    @FXML
    private ComboBox<?> responseStatusCombo;

    @FXML
    private TableColumn<?, ?> reviewIdColumn;

    @FXML
    private ToggleGroup reviewTypeGroup;

    @FXML
    private TableView<?> reviewsTable;

    @FXML
    private Button saveNotesBtn;

    @FXML
    private TextArea selectedContentArea;

    @FXML
    private TextField selectedUserInfoField;

    @FXML
    private TableColumn<?, ?> statusColumn;

    @FXML
    private TableColumn<?, ?> timestampColumn;

    @FXML
    private TableColumn<?, ?> typeColumn;

    @FXML
    private Button updateStatusBtn;

    @FXML
    private TableColumn<?, ?> userIdColumn;

    @FXML
    private TableColumn<?, ?> usernameColumn;

    @FXML
    void handleApplyFilter(ActionEvent event) {

    }

    @FXML
    void handleSaveNotes(ActionEvent event) {

    }

    @FXML
    void handleUpdateStatus(ActionEvent event) {

    }

}

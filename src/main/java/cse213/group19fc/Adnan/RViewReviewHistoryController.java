package cse213.group19fc.Adnan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class RViewReviewHistoryController {

    @FXML
    private Button backBtn;

    @FXML
    private TableColumn<?, ?> dateCol;

    @FXML
    private Button filterBtn;

    @FXML
    private DatePicker fromDatePicker;

    @FXML
    private TableColumn<?, ?> ratingCol;

    @FXML
    private TextArea reviewDetailsArea;

    @FXML
    private TableView<?> reviewHistoryTable;

    @FXML
    private TableColumn<?, ?> reviewIdCol;

    @FXML
    private ComboBox<?> reviewTypeCombo;

    @FXML
    private TableColumn<?, ?> reviewerCol;

    @FXML
    private TableColumn<?, ?> statusCol;

    @FXML
    private TableColumn<?, ?> targetCol;

    @FXML
    private DatePicker toDatePicker;

    @FXML
    private TableColumn<?, ?> typeCol;

    @FXML
    private Button viewDetailBtn;

    @FXML
    void handleBack(ActionEvent event) {

    }

    @FXML
    void handleFilter(ActionEvent event) {

    }

    @FXML
    void handleViewDetail(ActionEvent event) {

    }

}

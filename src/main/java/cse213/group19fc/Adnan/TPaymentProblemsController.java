package cse213.group19fc.Adnan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class TPaymentProblemsController {

    @FXML
    private RadioButton allIssuesRadio;

    @FXML
    private TableColumn<?, ?> amountColumn;

    @FXML
    private Button checkTransactionBtn;

    @FXML
    private Button filterBtn;

    @FXML
    private RadioButton inProgressIssuesRadio;

    @FXML
    private ComboBox<?> investigationStatusCombo;

    @FXML
    private TextArea issueDescriptionArea;

    @FXML
    private TableColumn<?, ?> issueIdColumn;

    @FXML
    private ToggleGroup issueStatusGroup;

    @FXML
    private TableColumn<?, ?> issueTypeColumn;

    @FXML
    private TableView<?> paymentIssuesTable;

    @FXML
    private TextField paymentMethodField;

    @FXML
    private RadioButton pendingIssuesRadio;

    @FXML
    private Button refundBtn;

    @FXML
    private TextField resolutionNotesField;

    @FXML
    private Button resolvedBtn;

    @FXML
    private RadioButton resolvedIssuesRadio;

    @FXML
    private TextField selectedAmountField;

    @FXML
    private TextField selectedTransactionIdField;

    @FXML
    private TableColumn<?, ?> statusColumn;

    @FXML
    private TableColumn<?, ?> timestampColumn;

    @FXML
    private TableColumn<?, ?> transactionIdColumn;

    @FXML
    private TableColumn<?, ?> userIdColumn;

    @FXML
    private TableColumn<?, ?> usernameColumn;

    @FXML
    void handleCheckTransaction(ActionEvent event) {

    }

    @FXML
    void handleFilter(ActionEvent event) {

    }

    @FXML
    void handleMarkResolved(ActionEvent event) {

    }

    @FXML
    void handleRefund(ActionEvent event) {

    }

}

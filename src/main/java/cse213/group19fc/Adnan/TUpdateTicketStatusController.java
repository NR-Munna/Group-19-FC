package cse213.group19fc.Adnan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class TUpdateTicketStatusController {

    @FXML
    private TableColumn<?, ?> assignedToCol;

    @FXML
    private Button backBtn;

    @FXML
    private Button clearBtn;

    @FXML
    private TableColumn<?, ?> clientCol;

    @FXML
    private TableColumn<?, ?> priorityCol;

    @FXML
    private ComboBox<?> priorityComboBox;

    @FXML
    private TextArea resolutionDetailsArea;

    @FXML
    private TextField selectedTicketField;

    @FXML
    private TableColumn<?, ?> statusCol;

    @FXML
    private ComboBox<?> statusComboBox;

    @FXML
    private TableColumn<?, ?> subjectCol;

    @FXML
    private TableColumn<?, ?> ticketIdCol;

    @FXML
    private TableView<?> ticketsTable;

    @FXML
    private TextArea updateNotesArea;

    @FXML
    private Button updateStatusBtn;

    @FXML
    void handleBack(ActionEvent event) {

    }

    @FXML
    void handleClear(ActionEvent event) {

    }

    @FXML
    void handleUpdateStatus(ActionEvent event) {

    }

}

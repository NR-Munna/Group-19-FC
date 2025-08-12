package cse213.group19fc.Adnan;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class TChatSupportController {

    @FXML
    private Button acceptChatBtn;

    @FXML
    private TextArea chatHistoryArea;

    @FXML
    private TableView<?> chatRequestsTable;

    @FXML
    private TextField chatStatusField;

    @FXML
    private TextField currentUserField;

    @FXML
    private Button endChatBtn;

    @FXML
    private TableColumn<?, ?> priorityColumn;

    @FXML
    private TextArea replyTextArea;

    @FXML
    private TableColumn<?, ?> requestIdColumn;

    @FXML
    private TableColumn<?, ?> requestTimeColumn;

    @FXML
    private Button sendBtn;

    @FXML
    private TextField sessionIdField;

    @FXML
    private TableColumn<?, ?> userIdColumn;

    @FXML
    private TableColumn<?, ?> usernameColumn;

    @FXML
    void handleAcceptChat(ActionEvent event) {

    }

    @FXML
    void handleEndChat(ActionEvent event) {

    }

    @FXML
    void handleSendMessage(ActionEvent event) {

    }

}

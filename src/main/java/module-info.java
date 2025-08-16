module cse213.group19fc {
    requires javafx.controls;
    requires javafx.fxml;


    opens cse213.group19fc to javafx.fxml;
    exports cse213.group19fc;
    opens cse213.group19fc.Adnan to javafx.fxml;
    exports cse213.group19fc.Adnan;
    opens cse213.group19fc.Munna to javafx.fxml;
    exports cse213.group19fc.Munna;
    opens cse213.group19fc.Shawon to javafx.fxml;
    exports cse213.group19fc.Shawon;
    opens cse213.group19fc.Samira to javafx.fxml;
    exports cse213.group19fc.Samira;
}
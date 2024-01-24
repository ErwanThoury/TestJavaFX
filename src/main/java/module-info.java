module sio.democlasse {
    requires javafx.controls;
    requires javafx.fxml;


    opens sio.democlasse to javafx.fxml;
    exports sio.democlasse;
}
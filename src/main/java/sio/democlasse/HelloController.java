package sio.democlasse;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Label lblVitesse;
    @FXML
    private ImageView imgTest;

    @FXML
    public void clickAccelerer()
    {
        maMoto.accelerer(30);
        lblVitesse.setText(maMoto.litVitesse());
    }
    @FXML
    public void clickDecelerer()
    {
        maMoto.decelerer(30);
        lblVitesse.setText(maMoto.litVitesse());
    }
    Moto maMoto;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        maMoto = new Moto("XT600", "Bleu", 0);
        lblVitesse.setText(maMoto.litVitesse());
    }

    public void clickStop(MouseEvent mouseEvent) {
        maMoto.decelerer(130);
        lblVitesse.setText(maMoto.litVitesse());
    }
}
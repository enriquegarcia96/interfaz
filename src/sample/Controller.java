package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

public class Controller {

        public void mostrarMensajes(ActionEvent actionEvent){
            System.out.println("mostrando mensajes");
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                    "mostrando el mensaje");
            alert.show();
        }

}

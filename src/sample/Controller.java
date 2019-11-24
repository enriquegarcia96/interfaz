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

    public void mostrarMensajes2(ActionEvent actionEvent){
        System.out.println("mostrando mensajes");
        Alert alert2 = new Alert(Alert.AlertType.CONFIRMATION,
                "la vida perro");
        alert2.show();
    }

    public void mostrarMensajes22(ActionEvent actionEvent){
        System.out.println("mostrando mensajes");
        Alert alert22 = new Alert(Alert.AlertType.CONFIRMATION,
                "la vida perro");
        alert22.show();
    }



}

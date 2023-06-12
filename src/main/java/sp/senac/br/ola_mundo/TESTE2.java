package sp.senac.br.ola_mundo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class TESTE2 {
@FXML
private Label welcomeText;
@FXML
private TextField  textomensagem;
    public void batatinha()  throws IOException {
/*...*/
//Ler valor da textfield
welcomeText.setText(textomensagem.getText());
}}


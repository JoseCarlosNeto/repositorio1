module sp.senac.br.ola_mundo {
    requires javafx.controls;
    requires javafx.fxml;


    opens sp.senac.br.ola_mundo to javafx.fxml;
    exports sp.senac.br.ola_mundo;
}
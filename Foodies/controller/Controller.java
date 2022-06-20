package controller;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import java.awt.*;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Controller implements Initializable {

    @FXML
    private PasswordField Pass;

    @FXML
    private TextField Uname;

    @FXML
    private Pane iconp;

    @FXML
    private Button login;

    @FXML
    private Label loginfail;

    @FXML
    private Pane unameicon;

    @FXML
    void toMain(ActionEvent event) throws IOException {
        checkLogin();
    }

    private void changescenes(String path, Button btn) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(path));
        Parent root = loader.load();
        Stage window = (Stage) btn.getScene().getWindow();
        window.setScene(new Scene(root));

    }

    private void checkLogin() throws IOException {
        if (Uname.getText().toString().equals("A") && Pass.getText().toString().equals("1")) {
            loginfail.setText("Success!");
            changescenes("../FXML/main.fxml", login);

        }

        else if (Uname.getText().isEmpty() && Pass.getText().isEmpty()) {
            loginfail.setText("introduza as informacoes");
        }

        else {
            loginfail.setText("falhou username or password!");
        }
    }



    // Main
    @FXML
    private Button btnconta;

    @FXML
    private Button btnmenu;

    @FXML
    private Pane icons;

    @FXML
    private Pane logo;

    @FXML
    private Button behindlogo;

    @FXML
    private Pane mainbg;

    @FXML
    private TextField search;

    @FXML
    void toConta(ActionEvent event) throws IOException {
        changescenes("../FXML/conta.fxml", btnconta);

    }

    @FXML
    private Pane caravela;

    @FXML
    private Button btnTavs;

    @FXML
    private Button btncaravela;

    @FXML
    private Button btnelvis;

    @FXML
    private Button btnmindel;

    @FXML
    private Button btnpizza;

    @FXML
    private Button btnsabor;

    @FXML
    void toCaravela(MouseEvent event) throws IOException {
        changescenes("../FXML/caravela.fxml", btncaravela);

    }

    @FXML
    private Button toLogin;

    @FXML
    private Pane fav1;

    @FXML
    private Pane favimg1;

    @FXML
    void getOut(ActionEvent event) throws IOException {
        changescenes("../FXML/login.fxml", toLogin);

    }

    @FXML
    void dissapear(MouseEvent event) {
        fav1.setVisible(false);
        favimg1.setVisible(false);

    }

    @FXML
    private Button toDef;

    @FXML
    void goDef(ActionEvent event) throws IOException {
        changescenes("../FXML/definicoes.fxml", toDef);

    }

    @FXML
    void toElvis(MouseEvent event) throws IOException {
        changescenes("../FXML/elvis.fxml", btnelvis);

    }

    @FXML
    void toMindel(MouseEvent event) throws IOException {
        changescenes("../FXML/mindel.fxml", btnmindel);

    }

    @FXML
    void toPizza(MouseEvent event) throws IOException {
        changescenes("../FXML/pizza.fxml", btnpizza);

    }

    @FXML
    void toSabor(MouseEvent event) throws IOException {
        changescenes("../FXML/sabor.fxml", btnsabor);

    }

    @FXML
    void toTaverna(MouseEvent event) throws IOException {
        changescenes("../FXML/taverna.fxml", btnTavs);

    }

    // Definiçoes

    @FXML
    void goMain(MouseEvent event) throws IOException {
        changescenes("../FXML/main.fxml", behindlogo);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        
    }

    @FXML
    void openLinkFace(ActionEvent event) throws IOException, URISyntaxException {
        Desktop.getDesktop().browse(new URI("https://www.facebook.com/CaravelaEsplanada/"));

    }

    @FXML
    private Button menuOpen;


    @FXML
    void goToMenu(MouseEvent event) throws IOException {
        changescenes("../FXML/menuCaravela.fxml", menuOpen);
    }



    @FXML
    void procurar(MouseEvent event) throws IOException {  
        if(search.getText().equals("Caravela")){
        changescenes("../FXML/caravela.fxml", procurarbtn);
        }

    }


    @FXML
    private Button procurarbtn;

    
}

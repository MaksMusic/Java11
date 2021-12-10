package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    systema systema;
    int a;
    public String nam22;
    public String nam11;
    public double nam1;
    public double nam2;
    public char operand;
    public boolean nam_lvl;

    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    public TextField stoka;
    @FXML
    private Button one;
    @FXML
    private Button six;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button seven;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button eight;
    @FXML
    private Button nine;
    @FXML
    private Button zero;
    @FXML
    private Button plus;
    @FXML
    private Button minus;
    @FXML
    private Button multiply;
    @FXML
    private Button toShare;
    @FXML
    private Button equally;
    @FXML
    private Button delite;
    @FXML
    private Button C;
    @FXML
    private Button Ndouble;

    public Controller() {
        this.systema = new systema(this.nam1, this.nam2, this.operand);
        this.a = 0;
        this.nam22 = "0";
        this.nam11 = "0";
        this.nam_lvl = true;
        int [] nomer = {0,1,2,3,4,5,6,7,8,9};
    }

    @FXML
    void initialize() {
        stoka.setEditable(false); // сделать чтоб строка не редактировалась
        this.one.setOnAction((event) -> {
            this.stoka = this.systema.one(this.stoka);
        });
        this.two.setOnAction((actionEvent) -> {
            this.stoka = this.systema.two(this.stoka);
        });
        this.three.setOnAction((actionEvent) -> {
            this.stoka = this.systema.three(this.stoka);
        });
        this.four.setOnAction((actionEvent) -> {
            this.stoka = this.systema.four(this.stoka);
        });
        this.five.setOnAction((actionEvent) -> {
            this.stoka = this.systema.five(this.stoka);
        });
        this.six.setOnAction((actionEvent) -> {
            this.stoka = this.systema.six(this.stoka);
        });
        this.seven.setOnAction((actionEvent) -> {
            this.stoka = this.systema.seven(this.stoka);
        });
        this.eight.setOnAction((actionEvent) -> {
            this.stoka = this.systema.eight(this.stoka);
        });
        this.nine.setOnAction((actionEvent) -> {
            this.stoka = this.systema.nine(this.stoka);
        });
        this.zero.setOnAction((actionEvent) -> {
            this.stoka = this.systema.zero(this.stoka);
        });
        this.plus.setOnAction((actionEvent) -> {
            this.stoka = this.systema.plus(this.stoka);
        });
        this.minus.setOnAction((actionEvent) -> {
            this.stoka = this.systema.minus(this.stoka);
        });
        this.multiply.setOnAction((actionEvent) -> {
            this.stoka = this.systema.multiply(this.stoka);
        });
        this.toShare.setOnAction((actionEvent) -> {
            this.stoka = this.systema.toShare(this.stoka);
        });
        this.equally.setOnAction((actionEvent) -> {
            this.stoka = this.systema.ravno(this.stoka);
        });
        this.C.setOnAction((actionEvent) -> {
            this.stoka = this.systema.c(this.stoka);
        });
        this.delite.setOnAction((actionEvent) -> {
            this.stoka = this.systema.delite(this.stoka);
        });
        this.Ndouble.setOnAction(actionEvent -> {
            this.stoka = this.systema.Ndouble(this.stoka);
        });
    }
}

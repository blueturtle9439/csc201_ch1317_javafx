package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.*;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.show();

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(15, 15, 15, 15));

        Scene scene = new Scene(grid, 700, 425);
        primaryStage.setScene(scene);


        Text scenetitle = new Text("Please enter complex numbers");
        scenetitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(scenetitle, 0, 0, 2, 1);

        Label num1a = new Label("first complex number a:");
        grid.add(num1a, 0, 1);
        TextField num1ainput = new TextField();
        grid.add(num1ainput, 1, 1);

        Label num1b = new Label("first complex number b:");
        grid.add(num1b, 0, 2);
        TextField num1binput = new TextField();
        grid.add(num1binput, 1, 2);

        Label num2a = new Label("second complex number a:");
        grid.add(num2a, 0, 3);
        TextField num2ainput = new TextField();
        grid.add(num2ainput, 1, 3);

        Label num2b = new Label("second complex number b:");
        grid.add(num2b, 0, 4);
        TextField num2binput = new TextField();
        grid.add(num2binput, 1, 4);



        Button btn = new Button("calculate");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 5);

        final TextArea result = new TextArea();
        grid.add(result, 1, 6);


        btn.setOnAction(new EventHandler<ActionEvent>() {
            String answer = "";

            @Override
            public void handle(ActionEvent e) {

                Complex num1 = new Complex(Double.parseDouble(num1ainput.getText()), Double.parseDouble(num1binput.getText()));
                Complex num2 = new Complex(Double.parseDouble(num2ainput.getText()), Double.parseDouble(num2binput.getText()));

                answer += num1.toString() +" + "+num2.toString()+" = "+num1.add(num2)+"\n";
                answer += num1.toString() +" - "+num2.toString()+" = "+num1.subtract(num2)+"\n";
                answer += num1.toString() +" * "+num2.toString()+" = "+num1.multiply(num2)+"\n";
                answer += num1.toString() +" / "+num2.toString()+" = "+num1.divide(num2)+"\n";
                answer += "|"+num1.toString()+"|" +" = "+num1.abs()+"\n";

                result.setText(answer);
            }
        });
    }


}


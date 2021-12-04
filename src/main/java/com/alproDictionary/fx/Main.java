package com.alproDictionary.fx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage){
        Dictionary dictionary = new Dictionary();
        GridPane gp1 = new GridPane();
        gp1.setAlignment(Pos.CENTER);
        gp1.setHgap(10); gp1.setVgap(10);
        gp1.setPadding(new Insets(25,25,25,25));
        Scene scene = new Scene(gp1, 540, 330);

        Text inAppTitle = new Text("Mini-FX Dictionary!");
        inAppTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL,30));
        Text searchText = new Text("Search:");
        TextField searchBar = new TextField();
        Button go = new Button("Go!");
        Text translatedText = new Text(dictionary.indoArr[0]);
        translatedText.setFont(Font.font("Tahoma",FontWeight.NORMAL, FontPosture.ITALIC,18));
        TextArea definitionArea = new TextArea(dictionary.indoDef[0]);
        definitionArea.setWrapText(true);
        definitionArea.setEditable(false);

        HBox searchSet = new HBox(searchText,searchBar,go);
        searchSet.setSpacing(10);

        //objek,baris,kolom
        gp1.add(inAppTitle,0,0);
        gp1.add(searchSet,0,1);
        gp1.add(translatedText,0,3);
        gp1.add(definitionArea,0,4,4,4);

        stage.setTitle("Mini-FX Programming Terms Dictionary!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
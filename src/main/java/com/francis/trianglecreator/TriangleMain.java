package com.francis.trianglecreator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class TriangleMain extends Application {
    @Override
    public void start(Stage stage){
        Label sizeLabel = new Label("Enter triangle size 1-300 ");
        TextField sizeInput = new TextField();
        HBox root = new HBox(10);
        root.setAlignment(Pos.CENTER);
        Pane pane = new Pane();
        HBox inputBox = new HBox(10);
        Button drawButton = new Button("Create Triangle");
        drawButton.setOnAction(actionEvent -> drawTriangle(pane, sizeInput.getText()));
        inputBox.getChildren().addAll(sizeLabel, sizeInput, drawButton);
        inputBox.setPadding(new Insets(10));
        root.getChildren().addAll(inputBox, pane);
        Scene scene = new Scene(root, 800, 400);
        stage.setTitle("Triangle Creator");
        stage.setScene(scene);
        stage.show();
    }
    private void drawTriangle(Pane pane, String sizeText){
            pane.getChildren().clear();
            double size = Double.parseDouble((sizeText));
            double centerX = pane.getWidth() / 2;
            double centerY = pane.getHeight() / 2;
            double halfSize = size / Math.sqrt(3);
            double p1X = centerX;
            double p1Y = centerY - halfSize;
            double p2X = centerX + halfSize;
            double p2Y = centerY + halfSize;
            double p3X = centerX - halfSize;
            double p3Y = centerY + halfSize;
            Polygon triangle = new Polygon();
            triangle.getPoints().addAll(new Double[] {p1X, p1Y, p2X, p2Y, p3X, p3Y});
            pane.getChildren().addAll(triangle);
    }
    public static void main(String[] args){
        launch(args);
    }
}

package io.zipcoder.casino;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Display{


    public Parent createContent(){
        GridPane grid = createGrid();

        Text enterBanner = new Text("Welcome to the Casino Royale");
        enterBanner.setFont(Font.font ("Verdana", 40));


        Button btnEnter = new Button("Enter");
        btnEnter.setAlignment(Pos.CENTER);
        //btnEnter.setMaxWidth(Double.MAX_VALUE);

        grid.add(btnEnter, 0, 1);
        grid.add(enterBanner, 0,0);

        btnEnter.setOnAction(e -> {
            Main.casino.startCasinoGuiExperience();
        });

        return grid;
    }

    public GridPane createGrid(){
        GridPane grid = new GridPane();
        grid.setPrefSize(1000, 600);
        grid.setAlignment(Pos.CENTER);
        //additonal changes
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(15, 15, 15, 15));
        grid.setBackground(Background.EMPTY);
        String style = "-fx-background-color: rgba(67, 30, 30, 0.8);";
        grid.setStyle(style);

        ColumnConstraints colConstraint = new ColumnConstraints();
        colConstraint.setHalignment(HPos.CENTER);
        colConstraint.setPercentWidth(15);

        RowConstraints rowConstraints = new RowConstraints();
        rowConstraints.setValignment(VPos.CENTER);

        // add constraints for columns
        grid.getColumnConstraints().addAll(colConstraint, colConstraint, colConstraint,colConstraint,colConstraint);
        grid.setGridLinesVisible(true);


        RowConstraints row1 = new RowConstraints();
        row1.setPercentHeight(10);
        RowConstraints row2 = new RowConstraints();
        row2.setPercentHeight(10);
        RowConstraints row3 = new RowConstraints();
        row3.setPercentHeight(10);
        RowConstraints row4 = new RowConstraints();
        row4.setPercentHeight(10);
        RowConstraints row5 = new RowConstraints();
        row5.setPercentHeight(10);


        grid.getRowConstraints().addAll(row1,row2,row3,row4, row5);


        return grid;
    }

    public Stage setExitAction(Button buttonToExit){
        return (Stage) buttonToExit.getScene().getWindow();

    }

}

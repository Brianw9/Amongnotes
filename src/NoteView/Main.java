package NoteView;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.event.*;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("NotesView.fxml"));

        primaryStage.setOpacity(0.5);
        primaryStage.setAlwaysOnTop(true);
        primaryStage.setTitle("Among Notes");
        primaryStage.setScene(new Scene(root, 200, 350));
        primaryStage.setResizable(false);
        primaryStage.show();
    }



    public static void main(String[] args) { launch(args);
    }

}

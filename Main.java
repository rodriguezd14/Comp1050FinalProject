package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException 
	{
		Parent root = FXMLLoader.load(getClass().getResource("intro.fxml"));
		primaryStage.setTitle("Hangman Game");
		primaryStage.setScene(new Scene(root, 1000, 1000));
		primaryStage.show();
		
	}
	
	public static void main(String[] args) 
	{
		launch(args);
	}
}

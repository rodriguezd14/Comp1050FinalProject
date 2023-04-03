package javaFXDemo;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;

public class MyJavaFX extends Application 
{
	@Override
	public void start(Stage primaryStage)
	{
		primaryStage.setTitle("Hello World!");
		final Button btn = new Button();
		btn.setText("Click Me!");
		final StackPane root = new StackPane();
		root.getChildren().add(btn);
		primaryStage.setScene(new Scene(root, 300, 250));
		primaryStage.show();
		
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
}

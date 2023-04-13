package javaFXDemo;

import java.awt.Label;
import java.awt.TextField;
import java.security.PublicKey;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.Node;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.event.EventHandler;
    




public class GameBoard extends Application 
{
	public Group rootGroup = new Group();
	public char c;
	public Scene scene;
	KeyCode character = null;
	
	public static void main(String[] args)
	{
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Group rootGroup = new Group();
		scene = new Scene(rootGroup, 1750, 1000, Color.LIGHTSKYBLUE);
		Stage stage = new Stage();
		
		rootGroup.getChildren().add(addText());
		primaryStage.setScene(scene);
		primaryStage.show();
	}
			
	public Text addText()
	{
		Game game = new Game();
		Text text = new Text("Please Select a letter for a theme!");
		//text.setText(game.printPrompt());
		text.setX(50);
		text.setY(50);
		text.setFont(Font.font("Verdana", 25));
		return text;
	}
}

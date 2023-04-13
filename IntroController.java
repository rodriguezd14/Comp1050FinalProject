/*
 * The controller is responsible for controlling the input from the user
 * in the GUI. In this case this controller is being used for the menu where the user selects their theme
 * then passes the theme to the HangmanGame object
 */


package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class IntroController 
{
	private Stage stage;
	private Scene scene;
	private Parent rootParent;
	String theme;
	
	/*
	 * When the user selects a theme by clicking a button 
	 * they will be taken to the next scene
	 */
	public void cars(ActionEvent e) throws IOException 
	{
		theme = "c";
		rootParent = FXMLLoader.load(getClass().getResource("game.fxml"));
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(rootParent);
		stage.setScene(scene);
		stage.show();
	}
	public void food(ActionEvent e) throws IOException 
	{
		theme = "b";
		rootParent = FXMLLoader.load(getClass().getResource("game.fxml"));
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(rootParent);
		stage.setScene(scene);
		stage.show();
	}
	public void city(ActionEvent e) throws IOException 
	{
		theme = "c";
		rootParent = FXMLLoader.load(getClass().getResource("game.fxml"));
		stage = (Stage)((Node)e.getSource()).getScene().getWindow();
		scene = new Scene(rootParent);
		stage.setScene(scene);
		stage.show();
	}
	
	public String getTheme()
	{
		return theme;
	}
}

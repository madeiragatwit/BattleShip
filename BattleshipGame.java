import java.net.URL;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class BattleshipGame extends Application implements Initializable {
	@FXML
	TextField coordinates;
	@FXML
	Button button;
	@FXML
	Text result;
	@FXML
	GridPane p1Field;
	@FXML
	Pane a;
	@FXML
	Pane b;
	@FXML
	Pane c;
	@FXML
	Pane d;
	@FXML
	Pane e;
	@FXML
	Pane f;
	@FXML
	Pane g;
	@FXML
	Pane h;
	@FXML
	Pane i;
	@FXML
	Pane j;
	@FXML
	Pane One;
	@FXML
	Pane Two;
	@FXML
	Pane Three;
	@FXML
	Pane Four;
	@FXML
	Pane Five;
	@FXML
	Pane Six;
	@FXML
	Pane Seven;
	@FXML
	Pane Eight;
	@FXML
	Pane Nine;
	@FXML
	Pane Ten;
	@FXML
	Pane VOID;
	@FXML
	GridPane p2Field;
	@FXML
	Pane a1;
	@FXML
	Pane b1;
	@FXML
	Pane c1;
	@FXML
	Pane d1;
	@FXML
	Pane e1;
	@FXML
	Pane f1;
	@FXML
	Pane g1;
	@FXML
	Pane h1;
	@FXML
	Pane i1;
	@FXML
	Pane j1;
	@FXML
	Pane One1;
	@FXML
	Pane Two1;
	@FXML
	Pane Three1;
	@FXML
	Pane Four1;
	@FXML
	Pane Five1;
	@FXML
	Pane Six1;
	@FXML
	Pane Seven1;
	@FXML
	Pane Eight1;
	@FXML
	Pane Nine1;
	@FXML
	Pane Ten1;
	@FXML
	Pane VOID1;

	@Override
	public void start(Stage primaryStage) throws Exception {
		final FXMLLoader loader = new FXMLLoader(getClass().getResource("BattleShip.fxml"));
		final Pane p = loader.load();
		primaryStage.setScene(new Scene(p));
		primaryStage.show();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		p1Field.setStyle("-fx-background-color: BCD4E6");
		a.setStyle("-fx-background-color: gray");
		b.setStyle("-fx-background-color: gray");
		c.setStyle("-fx-background-color: gray");
		d.setStyle("-fx-background-color: gray");
		e.setStyle("-fx-background-color: gray");
		f.setStyle("-fx-background-color: gray");
		g.setStyle("-fx-background-color: gray");
		h.setStyle("-fx-background-color: gray");
		i.setStyle("-fx-background-color: gray");
		j.setStyle("-fx-background-color: gray");
		One.setStyle("-fx-background-color: gray");
		Two.setStyle("-fx-background-color: gray");
		Three.setStyle("-fx-background-color: gray");
		Four.setStyle("-fx-background-color: gray");
		Five.setStyle("-fx-background-color: gray");
		Six.setStyle("-fx-background-color: gray");
		Seven.setStyle("-fx-background-color: gray");
		Eight.setStyle("-fx-background-color: gray");
		Nine.setStyle("-fx-background-color: gray");
		Ten.setStyle("-fx-background-color: gray");
		VOID.setStyle("-fx-background-color: BLACK");
		p2Field.setStyle("-fx-background-color: BCD4E6");
		a1.setStyle("-fx-background-color: gray");
		b1.setStyle("-fx-background-color: gray");
		c1.setStyle("-fx-background-color: gray");
		d1.setStyle("-fx-background-color: gray");
		e1.setStyle("-fx-background-color: gray");
		f1.setStyle("-fx-background-color: gray");
		g1.setStyle("-fx-background-color: gray");
		h1.setStyle("-fx-background-color: gray");
		i1.setStyle("-fx-background-color: gray");
		j1.setStyle("-fx-background-color: gray");
		One1.setStyle("-fx-background-color: gray");
		Two1.setStyle("-fx-background-color: gray");
		Three1.setStyle("-fx-background-color: gray");
		Four1.setStyle("-fx-background-color: gray");
		Five1.setStyle("-fx-background-color: gray");
		Six1.setStyle("-fx-background-color: gray");
		Seven1.setStyle("-fx-background-color: gray");
		Eight1.setStyle("-fx-background-color: gray");
		Nine1.setStyle("-fx-background-color: gray");
		Ten1.setStyle("-fx-background-color: gray");
		VOID1.setStyle("-fx-background-color: BLACK");

		button.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				checkHit();
			}
		});
	}

	private void checkHit() {
		Random r = new Random();
		int n = r.nextInt(2);
		int x, y;

		if (coordinates.getText().length() != 5) {
			result.setText("Enter a coordinate in the correct form: (Number , Letter)");
			return;
		}

		Scanner s = new Scanner(coordinates.getText());

		try {
			x = s.nextInt();
		} catch (InputMismatchException e) {
			result.setText("Enter a coordinate in the correct form: (Number , Letter)");
			return;
		}

		s.next();
		y = getY(s.next());

		if (y == 0) {
			result.setText("Please Enter a Correct y coordinate (A-J)");
			return;
		}

		if (n == 0) {
			result.setText("You missed.");
			Pane pane = new Pane();
			pane.setStyle("-fx-background-color: red");
			p2Field.add(pane, x, y);
		} else {
			result.setText("You got a hit!");
			Pane pane = new Pane();
			pane.setStyle("-fx-background-color: #4B5320");
			p2Field.add(pane, x, y);
		}
	}

	private int getY(String letter) {
		if (letter.equals("a") || letter.equals("A")) {
			return 1;
		} else if (letter.equals("b") || letter.equals("B")) {
			return 2;
		} else if (letter.equals("c") || letter.equals("C")) {
			return 3;
		} else if (letter.equals("d") || letter.equals("D")) {
			return 4;
		} else if (letter.equals("e") || letter.equals("E")) {
			return 5;
		} else if (letter.equals("f") || letter.equals("F")) {
			return 6;
		} else if (letter.equals("g") || letter.equals("G")) {
			return 7;
		} else if (letter.equals("h") || letter.equals("H")) {
			return 8;
		} else if (letter.equals("i") || letter.equals("I")) {
			return 9;
		} else if (letter.equals("j") || letter.equals("J")) {
			return 10;
		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}

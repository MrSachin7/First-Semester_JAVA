import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class CalculatorGUI extends Application
{
  private VBox mainBox;
  private GridPane gridPane;

  private TextField topText;
  private Button buttonOne;
  private Button buttonTwo;
  private Button buttonThree;
  private Button buttonFour;
  private Button buttonFive;
  private Button buttonSix;
  private Button buttonSeven;
  private Button buttonEight;
  private Button buttonNine;
  private Button buttonSlash;
  private Button buttonMultiply;
  private Button buttonMinus;
  private Button buttonPlus;
  private Button buttonEqualsTo;
  private Button buttonDecimal;
  private Button buttonZero;
  private Scene scene;
  private MyActionListener listener;

  private double a;
  private double b;
  private char operator;



  public void start(Stage window)
  {
    listener = new MyActionListener();

    topText = new TextField();
    topText.setMaxWidth(225);

    buttonOne = new Button("1");
    buttonOne.setOnAction(listener);
    buttonOne.setPrefWidth(50);
    buttonOne.setPrefHeight(50);

    buttonTwo = new Button("2");
    buttonTwo.setOnAction(listener);
    buttonTwo.setPrefWidth(50);
    buttonTwo.setPrefHeight(50);

    buttonThree = new Button("3");
    buttonThree.setOnAction(listener);
    buttonThree.setPrefWidth(50);
    buttonThree.setPrefHeight(50);

    buttonFour = new Button("4");
    buttonFour.setOnAction(listener);
    buttonFour.setPrefWidth(50);
    buttonFour.setPrefHeight(50);

    buttonFive = new Button("5");
    buttonFive.setOnAction(listener);
    buttonFive.setPrefWidth(50);
    buttonFive.setPrefHeight(50);

    buttonSix = new Button("6");
    buttonSix.setOnAction(listener);
    buttonSix.setPrefWidth(50);
    buttonSix.setPrefHeight(50);

    buttonSeven = new Button("7");
    buttonSeven.setOnAction(listener);
    buttonSeven.setPrefWidth(50);
    buttonSeven.setPrefHeight(50);

    buttonEight = new Button("8");
    buttonEight.setOnAction(listener);
    buttonEight.setPrefWidth(50);
    buttonEight.setPrefHeight(50);

    buttonNine = new Button("9");
    buttonNine.setOnAction(listener);
    buttonNine.setPrefWidth(50);
    buttonNine.setPrefHeight(50);

    buttonSlash = new Button("/");
    buttonSlash.setOnAction(listener);
    buttonSlash.setPrefWidth(50);
    buttonSlash.setPrefHeight(50);

    buttonMinus = new Button("-");
    buttonMinus.setOnAction(listener);

    buttonMinus.setPrefWidth(50);
    buttonMinus.setPrefHeight(50);

    buttonMultiply = new Button("*");
    buttonMultiply.setOnAction(listener);
    buttonMultiply.setPrefWidth(50);
    buttonMultiply.setPrefHeight(50);

    buttonPlus = new Button("+");
    buttonPlus.setOnAction(listener);
    buttonPlus.setPrefWidth(50);
    buttonPlus.setPrefHeight(50);

    buttonEqualsTo = new Button("=");
    buttonEqualsTo.setOnAction(listener);
    buttonEqualsTo.setPrefWidth(50);
    buttonEqualsTo.setPrefHeight(50);

    buttonDecimal = new Button(".");
    buttonDecimal.setOnAction(listener);
    buttonDecimal.setPrefWidth(50);
    buttonDecimal.setPrefHeight(50);

    buttonZero = new Button("0");
    buttonZero.setOnAction(listener);
    buttonZero.setPrefWidth(50);
    buttonZero.setPrefHeight(50);

    gridPane = new GridPane();
    gridPane.addRow(0, buttonSeven, buttonEight, buttonNine, buttonSlash);
    gridPane.addRow(1, buttonFour, buttonFive, buttonSix, buttonMultiply);
    gridPane.addRow(3, buttonOne, buttonTwo, buttonThree, buttonMinus);
    gridPane.addRow(4, buttonZero, buttonDecimal, buttonEqualsTo, buttonPlus);
    gridPane.setHgap(5);
    gridPane.setVgap(5);

    mainBox = new VBox(5);
    mainBox.getChildren().addAll(topText, gridPane);

    scene = new Scene(mainBox, 220, 170);
    window.setScene(scene);
    window.setTitle("Calculator");
    window.show();
  }
  private class MyActionListener implements EventHandler<ActionEvent>
  {

   public void handle(ActionEvent actionEvent)
    {
      if (actionEvent.getSource()==buttonOne)
      {
        topText.appendText("1");
      }
      else if (actionEvent.getSource()==buttonTwo)
      {
        topText.appendText("2");
      }
      else if (actionEvent.getSource()==buttonThree)
      {
        topText.appendText("3");
      }
      else if (actionEvent.getSource()==buttonFour)
      {
        topText.appendText("4");
      }
      else if (actionEvent.getSource()==buttonFive)
      {
        topText.appendText("5");
      }
      else if (actionEvent.getSource()==buttonSix)
      {
        topText.appendText("6");
      }
      else if (actionEvent.getSource()==buttonSeven)
      {
        topText.appendText("7");
      }
      else if (actionEvent.getSource()==buttonEight)
      {
        topText.appendText("8");
      }

      else if (actionEvent.getSource()==buttonNine)
      {
        topText.appendText("2");
      }
      else if (actionEvent.getSource()==buttonZero)
      {
        topText.appendText("0");
      }
      else if (actionEvent.getSource()==buttonSlash)
      {
        a = (Double.parseDouble(topText.getText()));
        operator = '/';
        topText.setText("");
      }
      else if (actionEvent.getSource()==buttonPlus)
      {
         a = (Double.parseDouble(topText.getText()));
        operator = '+';
        topText.setText("");
      }
      else if (actionEvent.getSource()==buttonMinus)
      {
        a = (Double.parseDouble(topText.getText()));
        operator = '-';
        topText.setText("");
      }
      else if (actionEvent.getSource()==buttonMultiply)
      {
        a = (Double.parseDouble(topText.getText()));
        operator = '*';
        topText.setText("");
      }
      else if (actionEvent.getSource()==buttonDecimal)
      {
        topText.appendText(".");
      }
      else if (actionEvent.getSource()==buttonEqualsTo)
      {
       b = Double.parseDouble(topText.getText());
       if (operator=='+')
       {
         topText.setText(a+b+"");
       }
       else if (operator=='-')
        {
          topText.setText(a-b+"");
        }
        if (operator=='/')
        {
          topText.setText(a/b+"");
        }
        if (operator=='*')
        {
          topText.setText(a*b+"");
        }
      }
    }
  }
}

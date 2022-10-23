import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller
{

  @FXML private Button one;
  @FXML private Button two;
  @FXML private Button three;
  @FXML private Button four;
  @FXML private Button five;
  @FXML private Button six;
  @FXML private Button seven;
  @FXML private Button eight;
  @FXML private Button nine;
  @FXML private Button zero;
  @FXML private Button divide;
  @FXML private Button multiply;
  @FXML private Button plus;
  @FXML private Button minus;
  @FXML private Button decimal;
  @FXML private TextField topText;
  @FXML private Button equals;
  private double a;
  private char operator;
  private double b;

  public void handler(ActionEvent e)
  {
    if (e.getSource() == one)
    {
      topText.appendText("1");
    }
    if (e.getSource() == two)
    {
      topText.appendText("2");
    }
    if (e.getSource() == three)
    {
      topText.appendText("3");
    }
    if (e.getSource() == four)
    {
      topText.appendText("4");
    }
    if (e.getSource() == five)
    {
      topText.appendText("5");
    }
    if (e.getSource() == six)
    {
      topText.appendText("6");
    }
    if (e.getSource() == seven)
    {
      topText.appendText("7");
    }
    if (e.getSource() == eight)
    {
      topText.appendText("8");
    }
    if (e.getSource() == nine)
    {
      topText.appendText("9");
    }
    if (e.getSource() == zero)
    {
      topText.appendText("0");
    }
    if (e.getSource() == decimal)
    {
      topText.appendText(".");
    }
    if (e.getSource() == plus)
    {
      a = (Double.parseDouble(topText.getText()));
      operator = '+';
      topText.setText("");
    }
    if (e.getSource() == minus)
    {
      a = (Double.parseDouble(topText.getText()));
      operator = '-';
      topText.setText("");
    }
    if (e.getSource() == multiply)
    {
      a = (Double.parseDouble(topText.getText()));
      operator = '*';
      topText.setText("");
    }
    if (e.getSource() == divide)
    {
      a = (Double.parseDouble(topText.getText()));
      operator = '/';
      topText.setText("");
    }
    else if (e.getSource()==equals)
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

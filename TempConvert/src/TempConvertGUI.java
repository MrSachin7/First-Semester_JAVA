import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.paint.Color;
import javafx.geometry.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.text.DecimalFormat;

public class TempConvertGUI extends Application
{
  private Scene scene;

  private BorderPane mainPane;
  private VBox radioPane;
  private FlowPane inputPane;
  private FlowPane msgPane;

  private Button convertButton;
  private TextField inputField;
  private Label temperatureLabel;
  private Label msgLabel;

  private ToggleGroup radioGroup;
  private RadioButton c2f;
  private RadioButton f2c;

  private MyButtonListener buttonListener;

  private final Color BORDER_COLOR = Color.rgb(180, 210, 255);

  private DecimalFormat formatter;

  private TempConvert convert;

  public void start(Stage window)
  {
    window.setTitle("Temperature Converter");

    convert = new TempConvert();
    buttonListener = new MyButtonListener();

    formatter = new DecimalFormat("#0.0");

    radioGroup = new ToggleGroup();
    c2f = new RadioButton("\u00b0C to \u00b0F"); // \u00b0 = degree symbol
    f2c = new RadioButton("\u00b0F to \u00b0C");
    c2f.setSelected(true);
    c2f.setToggleGroup(radioGroup);
    f2c.setToggleGroup(radioGroup);

    radioPane = new VBox(10);
    radioPane.setPadding(new Insets(5, 5, 5, 5));
    radioPane.setBorder(new Border(new BorderStroke(BORDER_COLOR, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    radioPane.setPrefSize(100, 80);

    radioPane.getChildren().addAll(c2f, f2c);

    temperatureLabel = new Label("Temperature:");
    inputField = new TextField();
    inputField.setPrefWidth(80);
    convertButton = new Button("Convert");
    convertButton.setOnAction(buttonListener);

    inputPane = new FlowPane();
    inputPane.setAlignment(Pos.BASELINE_CENTER);
    inputPane.setHgap(5);
    inputPane.setVgap(5);
    inputPane.setPadding(new Insets(5, 0, 5, 0));
    inputPane.setBorder(new Border(new BorderStroke(BORDER_COLOR, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    inputPane.setPrefSize(200, 80);

    inputPane.getChildren().addAll(temperatureLabel, inputField, convertButton);

    msgLabel = new Label();

    msgPane = new FlowPane();
    msgPane.setAlignment(Pos.BASELINE_CENTER);
    msgPane.setBorder(new Border(new BorderStroke(BORDER_COLOR, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    msgPane.setPrefSize(300, 25);

    msgPane.getChildren().add(msgLabel);

    mainPane = new BorderPane();
    mainPane.setCenter(inputPane);
    mainPane.setRight(radioPane);
    mainPane.setBottom(msgPane);

    scene = new Scene(mainPane, 300, 105);

    window.setScene(scene);
    window.show();
  }

  private class MyButtonListener implements EventHandler<ActionEvent>
  {
    public void handle(ActionEvent e)
    {
      if(e.getSource() == convertButton)
      {
        //convert the entered text to a double
        double temp = Double.parseDouble(inputField.getText());

        double result = -1;

        if(c2f.isSelected())
        {
          result = convert.celsiusToFahrenheit(temp);
          msgLabel.setText(temp + "\u00b0C = " + formatter.format(result) + "\u00b0F");
        }
        else if(f2c.isSelected())
        {
          result = convert.fahrenheitToCelsius(temp);
          msgLabel.setText(temp + "\u00b0F = " + formatter.format(result) + "\u00b0C");
        }
      }
    }
  }
}

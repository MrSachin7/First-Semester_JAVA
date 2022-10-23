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

public class SimpleGUI1 extends Application
{
  private Scene scene;
  private HBox mainBox;
  private VBox firstBox;
  private VBox secondBox;
  private VBox thirdBox;
  private TextField textField;
  private CheckBox exitOnOK;
  private CheckBox exitOnCancel;
  private Button ok;
  private Button cancel;
  private Button clear;
  private Label x;
  private Label y;
  private TextField xField;
  private TextField yField;
  private GridPane xAndY;

  public void start(Stage window)
  {
    window.setTitle("Align");
    exitOnOK = new CheckBox("Exit on OK");
    exitOnCancel = new CheckBox("Exit on Cancel");
    firstBox = new VBox(5);
    firstBox.getChildren().addAll(exitOnOK, exitOnCancel);

    x = new Label("X: ");
    xField = new TextField();
    yField = new TextField();
    y = new Label("Y: ");
    xAndY = new GridPane();
    xAndY.addRow(0, x, xField);
    xAndY.addRow(1, y, yField);
    xAndY.setVgap(15);
    xAndY.setPadding(new Insets(10,5,10,5));

    ok = new Button("OK");
    ok.setPrefWidth(50);
    cancel = new Button("Button");
    cancel.setPrefWidth(50);
    clear = new Button("Clear ");
    clear.setPrefWidth(50);
    thirdBox = new VBox(5);
    thirdBox.getChildren().addAll(ok, cancel, clear);

    mainBox = new HBox(5);
    mainBox.getChildren().addAll(firstBox, xAndY, thirdBox);

    scene = new Scene(mainBox, 350, 170);
    window.setScene(scene);
    window.show();
  }
}

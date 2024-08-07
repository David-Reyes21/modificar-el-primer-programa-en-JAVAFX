import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Model model = new Model("Pablo David Reyes Rosas");
        View view = new View(primaryStage);
        Controller controller = new Controller(model, view);

        view.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

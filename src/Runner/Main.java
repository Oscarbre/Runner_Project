package Runner;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;




public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

             /** Création de la scène */
        primaryStage.setTitle("Runner Project - Oscar Chêne - 2G2TD1TP1");
        Group root = new Group();
        Pane pane = new Pane(root);
        GameScene theScene = new GameScene(pane, 1600, 400,true);
        primaryStage.setScene(theScene);
        // primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}

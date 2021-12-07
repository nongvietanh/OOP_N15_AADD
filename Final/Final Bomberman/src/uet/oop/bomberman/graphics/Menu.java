package uet.oop.bomberman.graphics;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import uet.oop.bomberman.entities.mob.enemy.Enemy;

import static uet.oop.bomberman.BombermanGame.*;


public class Menu {
    private static ImageView statusGame, shieldItem;
    public static Text timeText, levelText, pointText, lifeText, itemText, textSceen;

    public static void createMenu(Group root) {

        timeText = new Text("Time Left: ");
        timeText.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        timeText.setFill(Color.BLACK);
        timeText.setX(300);
        timeText.setY(30);

        levelText = new Text();
        levelText.setText("Level: " + level);
        levelText.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        levelText.setFill(Color.BLACK);
        levelText.setX(500);
        levelText.setY(30);

        lifeText = new Text();
        lifeText.setText("Lives: ");
        lifeText.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        lifeText.setFill(Color.BLACK);
        lifeText.setX(700);
        lifeText.setY(30);

        pointText = new Text();
        pointText.setText("Points: ");
        pointText.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        pointText.setFill(Color.BLACK);
        pointText.setX(950);
        pointText.setY(30);

        itemText = new Text();
        itemText.setText("Shield: ");
        itemText.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        itemText.setFill(Color.BLACK);
        itemText.setX(1230);
        itemText.setY(30);

        Image game = new Image("images/playGame.png");
        statusGame = new ImageView(game);
        statusGame.setX(-75);
        statusGame.setY(0);
        statusGame.setScaleX(0.5);
        statusGame.setScaleY(0.5);

        Image shield = new Image("images/shield2.png");
        shieldItem = new ImageView(shield);
        shieldItem.setX(1200);
        shieldItem.setY(6);
        shieldItem.setScaleX(0.5);
        shieldItem.setScaleY(0.5);

        Pane pane = new Pane();
        pane.getChildren().addAll(timeText, levelText, pointText,lifeText,itemText, statusGame, shieldItem);
        pane.setMinSize(Sprite.SCALED_SIZE * WIDTH, 50);
        pane.setMaxSize(Sprite.SCALED_SIZE * WIDTH, 480);
        pane.setStyle("-fx-background-color: orange");

        root.getChildren().add(pane);

        statusGame.setOnMouseClicked(event -> {
            isRun = !isRun;
        });

    }

    public static void updateMenu() {
        if (isRun) {
            Image playGame = new Image("images/playGame.png");
            statusGame.setImage(playGame);
        } else {
            Image pauseGame = new Image("images/pauseGame.png");
            statusGame.setImage(pauseGame);
        }
    }

    public static void GameOver(Group root) {
        textSceen = new Text();
        textSceen.setText("Game Over!");
        textSceen.setFont(Font.font("Arial", FontWeight.BOLD, 100));
        textSceen.setFill(Color.WHITE);
        textSceen.setX((Sprite.SCALED_SIZE * WIDTH / 2) - 300);
        textSceen.setY((Sprite.SCALED_SIZE * HEIGHT / 2) + 50);

        Pane pane = new Pane();
        pane.getChildren().addAll(textSceen);
        pane.setMinSize(Sprite.SCALED_SIZE * WIDTH, Sprite.SCALED_SIZE * HEIGHT + 100);
        pane.setMaxSize(Sprite.SCALED_SIZE * WIDTH, Sprite.SCALED_SIZE * HEIGHT + 100);
        pane.setStyle("-fx-background-color: #353535");
        root.getChildren().add(pane);
    }

    public static void YouWin(Group root) {
        textSceen = new Text();
        textSceen.setText("You Win!");
        textSceen.setFont(Font.font("Arial", FontWeight.BOLD, 100));
        textSceen.setFill(Color.WHITE);
        textSceen.setX((Sprite.SCALED_SIZE * WIDTH / 2) - 200);
        textSceen.setY((Sprite.SCALED_SIZE * HEIGHT / 2) + 50);

        Pane pane = new Pane();
        pane.getChildren().addAll(textSceen);
        pane.setMinSize(Sprite.SCALED_SIZE * WIDTH, Sprite.SCALED_SIZE * HEIGHT + 100);
        pane.setMaxSize(Sprite.SCALED_SIZE * WIDTH, Sprite.SCALED_SIZE * HEIGHT + 100);
        pane.setStyle("-fx-background-color: #353535");
        root.getChildren().add(pane);
    }
}

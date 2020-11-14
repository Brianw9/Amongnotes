package NoteView;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.awt.*;

public class PlayerModel {
    private String playerColor;
    private boolean isDead;
    private javafx.scene.image.Image aliveImageURL;
    private Image deadImageURL;
    private ImageView playerImageView;

    public PlayerModel(String playerColor, ImageView playerImageView, boolean isDead, String aliveImageURL, String deadImageURL) {
        this.playerColor = playerColor;
        this.playerImageView = playerImageView;
        this.isDead = isDead;
        this.aliveImageURL = new Image(aliveImageURL);
        this.deadImageURL = new Image(deadImageURL);

    }

    public ImageView getPlayerImageView() {
        return playerImageView;
    }

    public void setPlayerImageView( ImageView playerImageView) {
        this.playerImageView = playerImageView;
    }

    public String getPlayerColor() {
        return playerColor;
    }

    public void setPlayerColor(String playerColor) {
        this.playerColor = playerColor;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public Image getAliveImageURL() {
        return aliveImageURL;
    }

    public void setAliveImageURL(Image aliveImageURL) {
        this.aliveImageURL = aliveImageURL;
    }

    public Image getDeadImageURL() {
        return deadImageURL;
    }

    public void setDeadImageURL(Image deadImageURL) {
        this.deadImageURL = deadImageURL;
    }
}

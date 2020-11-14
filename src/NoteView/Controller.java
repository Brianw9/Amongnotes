package NoteView;

import javafx.event.ActionEvent;
import javafx.event.EventTarget;
import javafx.fxml.FXML;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Controller {


    @FXML
    private javafx.scene.layout.AnchorPane AnchorPane;

    @FXML
    private HBox suspiciousBox;

    @FXML
    private HBox undecidedBoxOne;

    @FXML
    private ImageView BluePlayerImage;

    @FXML
    private HBox clearedBox;

    @FXML
    private ImageView PurplePlayerImage;

    @FXML
    private ImageView GreenPlayerImage;

    @FXML
    private ImageView YellowPlayerImage;

    @FXML
    private HBox undecidedBoxFour;

    @FXML
    private ImageView LimePlayerImage;

    @FXML
    private HBox undecidedBoxThree;

    @FXML
    private MenuItem editNamesMenu;

    @FXML
    private MenuItem closeWindow;

    @FXML
    private ImageView RedPlayerImage;

    @FXML
    private ImageView OrangePlayerImage;

    @FXML
    private MenuItem resetMenu;

    @FXML
    private ImageView WhitePlayerImage;

    @FXML
    private ImageView CyanPlayerImage;

    @FXML
    private ImageView BrownPlayerImage;

    @FXML
    private HBox undecidedBoxTwo;

    @FXML
    private ImageView BlackPlayerImage;

    @FXML
    private ImageView PinkPlayerImage;


    PlayerModel YellowPlayerModel = new PlayerModel("Yellow", YellowPlayerImage, false, "resources/YellowCrewmate.png", "resources/YellowBody.png");
    PlayerModel WhitePlayerModel = new PlayerModel("White", WhitePlayerImage, false,"resources/WhiteCrewmate.png", "resources/WhiteBody.png");
    PlayerModel BluePlayerModel = new PlayerModel("Blue", BluePlayerImage, false, "resources/BlueCrewmate.png", "resources/BlueBody.png");
    PlayerModel RedPlayerModel = new PlayerModel("Red", RedPlayerImage, false, "resources/RedCrewmate.png","resources/RedBody.png");
    PlayerModel BlackPlayerModel = new PlayerModel("Black", BlackPlayerImage, false, "resources/BlackCrewmate.png", "resources/BlackBody.png");
    PlayerModel CyanPlayerModel = new PlayerModel("Cyan", CyanPlayerImage, false, "resources/CyanCrewmate.png", "resources/CyanBody.png");
    PlayerModel LimePlayerModel = new PlayerModel("Lime", LimePlayerImage, false, "resources/LimeCrewmate.png", "resources/LimeBody.png");
    PlayerModel BrownPlayerModel = new PlayerModel("Brown", BrownPlayerImage, false, "resources/BrownCrewmate.png", "resources/BrownBody.png");
    PlayerModel PurplePlayerModel = new PlayerModel("Purple", PurplePlayerImage, false, "resources/PurpleCrewmate.png","resources/PurpleBody.png");
    PlayerModel GreenPlayerModel = new PlayerModel("Green", GreenPlayerImage, false, "resources/GreenCrewmate.png","resources/GreenBody.png");
    PlayerModel PinkPlayerModel = new PlayerModel("Pink", PinkPlayerImage, false, "resources/PinkCrewmate.png", "resources/PinkBody.png");
    PlayerModel OrangePlayerModel = new PlayerModel("Orange", OrangePlayerImage, false, "resources/OrangeCrewmate.png", "resources/OrangeBody.png");

    ArrayList<PlayerModel> PlayerModels = new ArrayList<PlayerModel>();

    @FXML
    public void initialize(){
        for (int i = 0; i < PlayerModels.size(); i++){
            PlayerModels.get(i).setDead(false);
            PlayerModels.get(i).getPlayerImageView().setImage(PlayerModels.get(i).getAliveImageURL());
        }
        YellowPlayerModel.setPlayerImageView(YellowPlayerImage);
        WhitePlayerModel.setPlayerImageView(WhitePlayerImage);
        BluePlayerModel.setPlayerImageView(BluePlayerImage);
        RedPlayerModel.setPlayerImageView(RedPlayerImage);
        BlackPlayerModel.setPlayerImageView(BlackPlayerImage);
        CyanPlayerModel.setPlayerImageView(CyanPlayerImage);
        LimePlayerModel.setPlayerImageView(LimePlayerImage);
        BrownPlayerModel.setPlayerImageView(BrownPlayerImage);
        PurplePlayerModel.setPlayerImageView(PurplePlayerImage);
        GreenPlayerModel.setPlayerImageView(GreenPlayerImage);
        PinkPlayerModel.setPlayerImageView(PinkPlayerImage);
        OrangePlayerModel.setPlayerImageView(OrangePlayerImage);

        PlayerModels.add(YellowPlayerModel);
        PlayerModels.add(WhitePlayerModel);
        PlayerModels.add(BluePlayerModel);
        PlayerModels.add(RedPlayerModel);
        PlayerModels.add(BlackPlayerModel);
        PlayerModels.add(CyanPlayerModel);
        PlayerModels.add(LimePlayerModel);
        PlayerModels.add(BrownPlayerModel);
        PlayerModels.add(PurplePlayerModel);
        PlayerModels.add(GreenPlayerModel);
        PlayerModels.add(PinkPlayerModel);
        PlayerModels.add(OrangePlayerModel);


        System.out.println("Second Reset");

    }

    @FXML
    public void handleClose(){
        Stage stage = (Stage) AnchorPane.getScene().getWindow();
            stage.close();
    }




    @FXML
    public void handleMouseClick(MouseEvent e) {
        for (int i = 0; i < PlayerModels.size(); i++){
            if (e.getSource().toString().contains(PlayerModels.get(i).getPlayerColor())){
                PlayerModels.get(i).setDead(!PlayerModels.get(i).isDead());
                if (PlayerModels.get(i).isDead() == true){
                    PlayerModels.get(i).getPlayerImageView().setImage(PlayerModels.get(i).getDeadImageURL());
                } else {
                    PlayerModels.get(i).getPlayerImageView().setImage(PlayerModels.get(i).getAliveImageURL());
                }
            }
        }
    }

    @FXML
    public void handleMouseEnter() {
        Stage primaryStage = (Stage) AnchorPane.getScene().getWindow();
        primaryStage.setOpacity(1.0);
    }

    @FXML
    public void handleMouseExit() {
        Stage primaryStage = (Stage) AnchorPane.getScene().getWindow();
        primaryStage.setOpacity(0.25);
    }

}

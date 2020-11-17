package NoteView;

import javafx.event.ActionEvent;
import javafx.event.EventTarget;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;


public class Controller {

    public ImageView DraggedContent;

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


    private PlayerModel YellowPlayerModel = new PlayerModel("Yellow", YellowPlayerImage, false, "resources/YellowCrewmate.png", "resources/YellowBody.png");
    private PlayerModel WhitePlayerModel = new PlayerModel("White", WhitePlayerImage, false,"resources/WhiteCrewmate.png", "resources/WhiteBody.png");
    private PlayerModel BluePlayerModel = new PlayerModel("Blue", BluePlayerImage, false, "resources/BlueCrewmate.png", "resources/BlueBody.png");
    private PlayerModel RedPlayerModel = new PlayerModel("Red", RedPlayerImage, false, "resources/RedCrewmate.png","resources/RedBody.png");
    private PlayerModel BlackPlayerModel = new PlayerModel("Black", BlackPlayerImage, false, "resources/BlackCrewmate.png", "resources/BlackBody.png");
    private PlayerModel CyanPlayerModel = new PlayerModel("Cyan", CyanPlayerImage, false, "resources/CyanCrewmate.png", "resources/CyanBody.png");
    private PlayerModel LimePlayerModel = new PlayerModel("Lime", LimePlayerImage, false, "resources/LimeCrewmate.png", "resources/LimeBody.png");
    private PlayerModel BrownPlayerModel = new PlayerModel("Brown", BrownPlayerImage, false, "resources/BrownCrewmate.png", "resources/BrownBody.png");
    private PlayerModel PurplePlayerModel = new PlayerModel("Purple", PurplePlayerImage, false, "resources/PurpleCrewmate.png","resources/PurpleBody.png");
    private PlayerModel GreenPlayerModel = new PlayerModel("Green", GreenPlayerImage, false, "resources/GreenCrewmate.png","resources/GreenBody.png");
    private PlayerModel PinkPlayerModel = new PlayerModel("Pink", PinkPlayerImage, false, "resources/PinkCrewmate.png", "resources/PinkBody.png");
    private PlayerModel OrangePlayerModel = new PlayerModel("Orange", OrangePlayerImage, false, "resources/OrangeCrewmate.png", "resources/OrangeBody.png");

    private ArrayList<PlayerModel> PlayerModels = new ArrayList<PlayerModel>();

    private ArrayList<ImageView> ResetBoxOne = new ArrayList<>();
    private ArrayList<ImageView> ResetBoxTwo = new ArrayList<>();
    private ArrayList<ImageView> ResetBoxThree = new ArrayList<>();


    @FXML
    public void resetPlayers(){
        for (int i = 0; i < PlayerModels.size(); i++){
            PlayerModels.get(i).setDead(false);
            PlayerModels.get(i).getPlayerImageView().setImage(PlayerModels.get(i).getAliveImageURL());

        }

        for (int x = 0; x < ResetBoxOne.size(); x++){
            if (!undecidedBoxOne.getChildren().contains(ResetBoxOne.get(x))){
                undecidedBoxOne.getChildren().add(ResetBoxOne.get(x));
            }
        }
        for (int x = 0; x < ResetBoxTwo.size(); x++){
            if (!undecidedBoxTwo.getChildren().contains(ResetBoxTwo.get(x))){
                undecidedBoxTwo.getChildren().add(ResetBoxTwo.get(x));
            }
        }
        for (int x = 0; x < ResetBoxThree.size(); x++){
            if (!undecidedBoxThree.getChildren().contains(ResetBoxThree.get(x))){
                undecidedBoxThree.getChildren().add(ResetBoxThree.get(x));
            }
        }

    }

    @FXML
    public void initialize(){
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

        ResetBoxOne.add(YellowPlayerImage);
        ResetBoxOne.add(WhitePlayerImage);
        ResetBoxOne.add(BluePlayerImage);
        ResetBoxOne.add(RedPlayerImage);
        ResetBoxTwo.add(BlackPlayerImage);
        ResetBoxTwo.add(CyanPlayerImage);
        ResetBoxTwo.add(LimePlayerImage);
        ResetBoxTwo.add(BrownPlayerImage);
        ResetBoxThree.add(PurplePlayerImage);
        ResetBoxThree.add(GreenPlayerImage);
        ResetBoxThree.add(PinkPlayerImage);
        ResetBoxThree.add(OrangePlayerImage);

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
                if (PlayerModels.get(i).isDead()){
                    PlayerModels.get(i).getPlayerImageView().setImage(PlayerModels.get(i).getDeadImageURL());
                } else {
                    PlayerModels.get(i).getPlayerImageView().setImage(PlayerModels.get(i).getAliveImageURL());
                }
            }

        }

    }

    public ImageView getDraggedImage(){
        return DraggedContent;
    }

    public void setDraggedImage(ImageView playerImage){
        DraggedContent = playerImage;
    }

    @FXML
    public void handleMouseEnter() {
        Stage primaryStage = (Stage) AnchorPane.getScene().getWindow();
        primaryStage.setOpacity(1.0);
    }

    @FXML
    public void handleMouseExit() {
        Stage primaryStage = (Stage) AnchorPane.getScene().getWindow();
        primaryStage.setOpacity(0.2);
    }

    @FXML
    public void handleDragStart(MouseEvent e){
        for (int i = 0; i < PlayerModels.size(); i++) {
            if (e.getSource().toString().contains(PlayerModels.get(i).getPlayerColor())) {
                setDraggedImage(PlayerModels.get(i).getPlayerImageView());
                System.out.println(DraggedContent);
                ImageView currentImage = PlayerModels.get(i).getPlayerImageView();
                Dragboard dragged = currentImage.startDragAndDrop(TransferMode.ANY);
                ClipboardContent content = new ClipboardContent();
                content.putString(currentImage.getId());
                dragged.setContent(content);
                ImageView testImage = PlayerModels.get(i).getPlayerImageView();

                dragged.setDragView(testImage.snapshot(null, null), 25, 25);
            }
        }
    }

    @FXML
    public void handleDragOver(DragEvent e){
        e.acceptTransferModes(TransferMode.COPY);
    }



    @FXML
    public void handleDragStop(DragEvent e){
        Dragboard db = e.getDragboard();
//        if (db.hasImage()) {
//            e.setDropCompleted(true);
//        } else {
//            e.setDropCompleted(false);  //dont know if this is needed at all honestly
//        }
        System.out.println(e.getTarget());
        System.out.println(DraggedContent);
        System.out.println("test");
        for (int i = 0; i < PlayerModels.size(); i++) {
            if (e.getTarget() == suspiciousBox){
                 suspiciousBox.getChildren().add(DraggedContent);
            } else if (e.getTarget() == clearedBox){
                clearedBox.getChildren().add(DraggedContent);
            } else if (e.getTarget() == undecidedBoxOne){
                undecidedBoxOne.getChildren().add(DraggedContent);
            } else if (e.getTarget() == undecidedBoxTwo){
                undecidedBoxTwo.getChildren().add(DraggedContent);
            } else if (e.getTarget() == undecidedBoxFour){
                undecidedBoxThree.getChildren().add(DraggedContent);
            } else if (e.getTarget() == undecidedBoxFour){
                undecidedBoxFour.getChildren().add(DraggedContent);
            }
        }
    }
}

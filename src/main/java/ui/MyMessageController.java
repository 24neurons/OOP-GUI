package ui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import java.net.URL;
import java.util.*;
import javafx.scene.image.*;

public class MyMessageController implements Initializable {
    @FXML
    private TextArea input;

    @FXML
    private ImageView send;

    @FXML
    private ImageView bg;

    public void initialize(URL url, ResourceBundle resourceBundle) {  
        Image bgImage = new Image(App.class.getResourceAsStream("bg.jpg"));  
        bg.setImage(bgImage);
        bg.setFitHeight(760);
        bg.setFitWidth(650);
        bg.setPreserveRatio(false);
    }

}

package clase.vista;

import java.io.IOException;

import clase.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * The only controller for the whole application.
 *
 * @author ernesto
 */
public class MyControl {
	
	//not using yet
	@FXML
	private ImageView imageRaw;

	/**
     * Opens an stage to send the profile
     */
    
    public void showSendProfile() {
        try {
            // Load the fxml file and create a new stage for the popup.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("vista/MyView2.fxml"));
            AnchorPane page = (AnchorPane) loader.load();
            Stage sendStage = new Stage();
            sendStage.setTitle("View in GitHub");
            sendStage.setX(200);
            sendStage.setY(200);
            Scene scene = new Scene(page);
            sendStage.setScene(scene);
            
            sendStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * Method to handle the ImageView action in the Main stage 
     */
    
    @FXML
    private void OpenView() {
    	showSendProfile();
    }

    /**
     * Closes the application when clicked on Exit in the secondary stage
     */
    @FXML
    private void CloseView() {
   	        System.exit(0);
    }
}

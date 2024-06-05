package de.fallmerayer.slfserver.Controller;

import de.fallmerayer.slfserver.Manager.StageManager;
import de.fallmerayer.slfserver.SFLApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;

import java.io.IOException;
import java.util.ArrayList;


public class StartViewController {

    @FXML
    public Label IPLabel;
    @FXML
    public Label PortLabel;
    @FXML
    public ListView<String> ClientsListView;
    @FXML
    public ListView<HBox> TopicListView;

    public ArrayList<String> clients = new ArrayList<>();
    public ArrayList<String> selected_topics = new ArrayList<>();

    public void initialize() {
        TopicListView.getItems().add(new HBox(new Label("Tiere"), new CheckBox()));

        TopicListView.getItems().add(new HBox(new Label("Fluss"), new CheckBox()));

        TopicListView.getItems().add(new HBox(new Label("Beruf"), new CheckBox()));

        TopicListView.getItems().add(new HBox(new Label("Land"), new CheckBox()));

        TopicListView.getItems().add(new HBox(new Label("Stadt"), new CheckBox()));

        PortLabel.setText("1234");
    }

    public void createNewGame(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(SFLApplication.class.getResource("Controller/inGame-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        StageManager.stage.setTitle("Stadt Land Fluss Host Client");
        StageManager.stage.setScene(scene);
        StageManager.stage.show();

    }

    public void topicSelected(ActionEvent actionEvent) {
        while (selected_topics.size() < 5){ // Select up to 5 topics
            for (int i = 0; i < TopicListView.getItems().size(); i++) {
                if (TopicListView.getSelectionModel().isSelected(i)) {
                    System.out.println("Selected: " + TopicListView.getItems().get(i).getId());
                    selected_topics.add(TopicListView.getItems().get(i).getId());
                }
            }
        }

        // Send selected topics to server
    }
}

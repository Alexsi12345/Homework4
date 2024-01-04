package org.example.fx;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.util.List;
import org.example.Tree;

public class TreeController {
    @FXML
    private TableView<Tree> treeTableView;

    @FXML
    private TableColumn<Tree, Integer> idColumn;

    @FXML
    private TableColumn<Tree, Integer> parentIdColumn;

    private TreeService treeService;

    public void setTreeService(TreeService treeService) {
        this.treeService = treeService;
        updateTreeTable();
    }

    @FXML
    private void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        parentIdColumn.setCellValueFactory(new PropertyValueFactory<>("parentId"));
        updateTreeTable();
    }

    private void updateTreeTable() {
        List<Tree> trees = treeService.getAllTrees();
        treeTableView.getItems().setAll(trees);
    }

    // Другие методы и обработчики событий
}

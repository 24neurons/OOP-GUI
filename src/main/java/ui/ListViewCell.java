package ui;

import javafx.scene.control.ListCell;

public class ListViewCell extends ListCell<Contact> {
    @Override
    public void updateItem(Contact name, boolean empty)
    {
        super.updateItem(name, empty);
        if (name != null) {
            CustomCellView customCellView = new CustomCellView();
            customCellView.setName(name.getName());
            customCellView.setHastag(name.getHastag());
            customCellView.setAvatar(name.getImageFileName());


            setGraphic(customCellView.getHBoxRoot());
        }
    }
}

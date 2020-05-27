package nodes;

import javafx.scene.control.TableColumn;

//Here we contains day columns properties for table
//Здесь храним все свойства колонок дней для табеля

public class DayColumnModel extends TableColumn {
    public DayColumnModel(int day) {
        this.setId("day_" + day);
        this.setText(Integer.toString(day));
        this.setPrefWidth(25);
        this.setResizable(false);
        this.setSortable(false);
        this.setEditable(true);
    }
}

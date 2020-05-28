package nodes;

import javafx.scene.control.TableColumn;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Locale;

//Here we contains day columns properties for table
//Здесь храним все свойства колонок дней для табеля

public class ColumnModel extends TableColumn {
    private String date;
    private LocalDate localDate;

//конструктор для колонок дней
    public ColumnModel(int day) {
        this.setId("day_" + day);
        this.setText(Integer.toString(day));
        this.setPrefWidth(25);
        this.setResizable(false);
        this.setSortable(false);
        this.setEditable(true);
    }
//конструктор для текстовых колонок
    public ColumnModel(String name) {
        this.setText(name);
        this.setPrefWidth(75);
        this.setResizable(true);
        this.setSortable(true);
        this.setEditable(false);
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getStringDate() {
        return date;
    }

    public LocalDate stringToLocalDate(String stringDate) {
        LocalDate date = null;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");

            date = LocalDate.parse(stringDate,formatter.withLocale(Locale.CANADA));
        } catch (DateTimeParseException e) {
            e.printStackTrace();
        }


        return date;
    }

    public void setStringDate(String date) {
        this.date = date;
    }


}

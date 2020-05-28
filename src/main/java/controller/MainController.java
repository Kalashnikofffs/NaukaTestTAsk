package controller;

import Models.Employee;
import Models.RestDays;
import Services.TabMounsDayCounter;
import Services.database.Dao;
import Services.database.RDBHandler;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import nodes.ColumnModel;
import nodes.myDepartmentButton;

import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class MainController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private TabPane n2;

    @FXML
    private TabPane n1;

    @FXML
    private TableView<Employee> tableEmployees;

    @FXML
    private TableColumn<?, ?> secondName;

    @FXML
    private TableColumn<?, ?> firstName;

    @FXML
    private TableColumn<?, ?> thirdName;

    @FXML
    private TableColumn<?, ?> department;

    @FXML
    private MenuItem createNewDepartment;

    @FXML
    private MenuItem createNewEmployee;

    @FXML
    private MenuItem readme;


    private ObservableList<Employee> usersData = FXCollections.observableArrayList();
    private int currentYear = 2020;

    private ResultSet getResultSet () throws SQLException {
        PreparedStatement prs = null;
        prs = RDBHandler.getConnection().prepareStatement("SELECT*FROM Work_calendar");
        ResultSet resSet = prs.executeQuery();
        return resSet;
    }


    @FXML
    void initialize()  {
        ObservableList<Tab> tablist = n1.getTabs();
        int tabCount = 0;
        Dao dao = new Dao();
        List<RestDays> restDaysForColumns = new LinkedList<>();
        try {
            restDaysForColumns = dao.getRestDays();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        for (Tab tab : tablist) {
            tabCount++;
            TableView<ColumnModel> tableView = new TableView<>();
            tableView.setPrefSize(1508.0, 770.0);
            for (int i = -3; i <= TabMounsDayCounter.countDaysInMounth(tabCount , currentYear); i++) {
                if (i == -3) {
                    tableView.getColumns().add(new ColumnModel("ФИО"));
                }
                if (i == -2) {
                    tableView.getColumns().add(new ColumnModel("Департамент"));
                }
                if (i == -1) {
                    tableView.getColumns().add(new ColumnModel("Табель"));
                }
                if (i == 0) {
                    tableView.getColumns().add(new ColumnModel("Итог"));
                }
                if (i > 0) {
                    boolean columnIsRest = false;
                    ColumnModel model = new ColumnModel(i);

                    model.setStringDate(currentYear + "-" + tabCount + "-" + (i) + "'");
                    model.setStringDate(model.getStringDate().replace("'", " ").trim());
                    model.setLocalDate(model.stringToLocalDate(model.getStringDate()));

                    for (RestDays day: restDaysForColumns
                         ) {
                        if(day.getDate().getDayOfYear() == model.getLocalDate().getDayOfYear()){
                            columnIsRest = true;
                        }
                    }
                    if(columnIsRest) { model.setStyle("-fx-background-color: #FF0000");}
                    else {
                        model.setStyle("-fx-background-color: #00FF00");
                    }
                    tableView.getColumns().add(model);


                }

            }
            tab.setContent(tableView);
        }

        //Here draws the day columns using pre-created model (DayColumnModel)
//        for (int i = 1; i <= 31 ; i++) {


//            DayColumnModel dayColumnModel = new DayColumnModel(i);
//            tableEmployees.getColumns().add(dayColumnModel);
//            columnsSet.add(dayColumnModel);
//        }
        //And now we put them into a List for updating values
//        int i = 0;
//        for (DayColumnModel d : columnsSet) {
//            System.out.println(columnsSet.get(i).getText());
//            i++;
//        }

        initData();
        LinkedList<Button> buttonLinkedList = new LinkedList<>();
        buttonLinkedList.add(new myDepartmentButton("empty", 54));

        createNewDepartment.setOnAction(event -> {

            addDepartmentButton(buttonLinkedList, "Департамент хозяйственных стульев легкой промышленности.");
        });
    }

    private void initData() {
        usersData.add(new Employee(1, "Alex", "qwerty", "alex@mail.com"));
        usersData.add(new Employee(2, "Bob", "dsfsdfw", "bob@mail.com"));
        usersData.add(new Employee(3, "Jeck", "dsfdsfwe", "Jeck@mail.com"));
        usersData.add(new Employee(4, "Mike", "iueern", "mike@mail.com"));
        usersData.add(new Employee(5, "colin", "woeirn", "colin@mail.com"));


    }

    public void addDepartmentButton(LinkedList<Button> buttonLinkedList, String name) {


        buttonLinkedList.add(new myDepartmentButton(name,
                (int) buttonLinkedList.getLast().getLayoutY()));
        anchorPane.getChildren().add(buttonLinkedList.getLast());
    }
}
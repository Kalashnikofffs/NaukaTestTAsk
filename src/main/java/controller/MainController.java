package controller;

import Models.Employee;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import nodes.myDepartmentButton;

import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

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


    @FXML
    void initialize() {

        initData(); // Здесь ЭкакбыЭ обновляем базу данных .... Но позже надо будет решить  - необязаьельно обновлять базу все время и плодить куча обьектов сотрудников
        secondName.setCellValueFactory(new PropertyValueFactory<>("secondName"));
        tableEmployees.setItems(usersData);
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

    public void addDepartmentButton(LinkedList<Button> buttonLinkedList , String name) {


        buttonLinkedList.add(new myDepartmentButton(name,
                (int) buttonLinkedList.getLast().getLayoutY()));
        anchorPane.getChildren().add(buttonLinkedList.getLast());
    }
}
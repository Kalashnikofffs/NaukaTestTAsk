package Models;

public class Employee {
    private int id;
    private String SecondName;
    private String FirstName;
    private String ThirdName;
    private String Department;

    public Employee(int id, String secondName, String firstName, String department) {
        this.id = id;
        SecondName = secondName;
        FirstName = firstName;
        Department = department;
    }
    //TODO Override equals and hashcode...

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getThirdName() {
        return ThirdName;
    }

    public void setThirdName(String thirdName) {
        ThirdName = thirdName;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}

package uncc.api.uncc.api.Entity;

/**
 * Created by sivalingam on 2/10/2018.
 */
public class Employee extends User {
    private String employeeId;
    private String name;
    private Address address;


    public Employee(String uId, String password, String employeeId, String name, Address address) {
        super(uId, password);
        this.employeeId = employeeId;
        this.name = name;
        this.address = address;
    }

    public void setEmployeeId(String empId) {
        this.employeeId = empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}

package uncc.api.uncc.api.Entity;

/**
 * Created by sivalingam on 2/10/2018.
 */
public class Student extends User {

    private String studentId;
    private String name;
    private Address address;

    public Student(String uId, String password,String name, Address address) {
        super(uId, password);
        this.studentId = studentId;
        this.name = name;
        this.address = address;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}

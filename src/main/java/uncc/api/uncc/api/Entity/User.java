package uncc.api.uncc.api.Entity;


import javax.persistence.*;

/**
 * Created by sivalingam on 2/10/2018.
 */

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "user_id")
    private String uId;
    @Column(name = "password")
    private String password;

    public User(){
    }

    public User(String uId, String password) {
        this.uId = uId;
        this.password = password;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (!uId.equals(user.uId)) return false;
        return password.equals(user.password);

    }

    @Override
    public int hashCode() {
        int result = uId.hashCode();
        result = 31 * result + password.hashCode();
        return result;
    }
}

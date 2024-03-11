package onetomany.userLogIn;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import onetomany.Users.User;
@Entity
@Table(name = "userLogin")
public class userLogin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;



    String email;

    char type;

    String password;

    @Column(unique = true)
    private String userName;

    public userLogin(){

    }

    @OneToOne
    @JsonIgnore
    @JoinColumn
    User user;


    public userLogin(String userName, String email, char type, String password){
        this.email= email;
        this.userName= userName;
        this.password= password;
        this.type= type;
    }

    public void setId(int id){
        this.id= id;
    }
    public void setUser(User newUser){
        this.user= newUser;
    }
    public void setPassword(String newPassword){
        this.password= password;
    }

    public User getUser() {
        return user;
    }

    public char getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setType(char type) {
        this.type = type;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

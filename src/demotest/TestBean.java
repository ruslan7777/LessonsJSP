//package demotest;
//
///**
// * Created by RUSLAN77 on  18.01.2018 in Ukraine
// */
//
//import java.io.Serializable;
//
//public class TestBean implements Serializable {
//
//    private String msg = "null";
//
//    public String getMsg() {
//        return msg;
//    }
//
//    public void setMsg(String msg) {
//        this.msg = msg;
//    }
//}

package demotest;
//Model Layer!!!!!!!!!!
import java.io.Serializable;

public class TestBean implements Serializable{

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    private String email="null";
    private String password="null";


}

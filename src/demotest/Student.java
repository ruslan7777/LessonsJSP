package demotest;

import java.io.Serializable;

public class Student implements Serializable {
    private String name = "null";
    private int id = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
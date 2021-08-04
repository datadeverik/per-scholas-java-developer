package org.perscholas.lectures.w4d2.interfaces.example2;

public class teacher {
    private String name;
    private String email;
    public teacher(String name, String email) {
        super();
        this.name = name;
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


}
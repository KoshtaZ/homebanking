package model;

import java.util.Date;

public class Client {
    private Integer nif;
    private String password;
    private String name;
    private Date birthday;
    private Integer telephone;
    private Integer cellphone;
    private String email;
    private String profession;

    public Client(){

    }
    public Client(Integer nif, String password, String name, Date birthday, Integer telephone, Integer cellphone, String email, String profession){
        this.nif = nif;
        this.password = password;
        this.name = name;
        this.birthday = birthday;
        this.telephone = telephone;
        this.cellphone =cellphone;
        this.email = email;
        this.profession = profession;
    }

    public Integer getNif() {
        return nif;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }


    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public Integer getCellphone() {
        return cellphone;
    }

    public void setCellphone(Integer cellphone) {
        this.cellphone = cellphone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}

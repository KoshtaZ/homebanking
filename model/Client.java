package model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class Client {

    private Integer nif;
    private Integer password;
    private String name;
    private LocalDate birthday;
    private Integer telephone;
    private Integer cellphone;
    private String email;
    private String profession;

    public Client(){

    }
    public Client(Integer nif, Integer password, String name, LocalDate birthday, Integer telephone, Integer cellphone, String email, String profession){
        this.nif = nif;
        this.password = password;
        this.name = name;
        this.birthday = birthday;
        this.telephone = telephone;
        this.cellphone = cellphone;
        this.email = email;
        this.profession = profession;
    }

    public Integer getNif() {
        return nif;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
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

    @Override
    public String toString() {
        return "Client{" +
                "nif=" + nif +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", telephone=" + telephone +
                ", cellphone=" + cellphone +
                ", email='" + email + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}

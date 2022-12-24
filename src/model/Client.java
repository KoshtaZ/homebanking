package src.model;

import java.time.LocalDate;

public class Client {



    private Long id;
    private Integer nif;
    private Integer password;
    private String name;
    private LocalDate birthday;
    private Integer telephone;
    private Long cellphone;
    private String email;
    private String profession;

    public Client(){

    }
    public Client(Long id, Integer nif, Integer password, String name, LocalDate birthday, Integer telephone, Long cellphone, String email, String profession){
       this.id = id;
        this.nif = nif;
        this.password = password;
        this.name = name;
        this.birthday = birthday;
        this.telephone = telephone;
        this.cellphone = cellphone;
        this.email = email;
        this.profession = profession;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNif() {
        return nif;
    }

    public void setNif(Integer nif) {
        this.nif = nif;
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

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Integer getTelephone() {
        return telephone;
    }

    public void setTelephone(Integer telephone) {
        this.telephone = telephone;
    }

    public Long getCellphone() {
        return cellphone;
    }

    public void setCellphone(Long cellphone) {
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
                "id=" + id +
                ", nif=" + nif +
                ", password=" + password +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", telephone=" + telephone +
                ", cellphone=" + cellphone +
                ", email='" + email + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}

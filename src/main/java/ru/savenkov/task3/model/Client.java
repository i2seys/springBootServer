package ru.savenkov.task3.model;


import jakarta.persistence.*;
import org.hibernate.annotations.JdbcType;


import java.sql.Date;
import java.sql.Types;
import java.time.LocalDate;
import java.util.UUID;


@Entity
public class Client {
    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "surname")
    private String surname;
    @Column(name = "_name")
    private String name;
    @Column(name = "patronymic")
    private String patronymic;
    @Column(name = "sex")
    private Boolean sex;
    @Column(name = "birth_date")
    private LocalDate birthDate;
    @Column(name = "inn")
    private String inn;
    @Column(name = "passport_serial")
    private String passportSerial;
    @Column(name = "phone")
    private String phone;

    public Client() {
    }

    public Client(UUID id, String surname, String name, String patronymic, Boolean sex, LocalDate birthDate, String inn, String passportSerial, String phone) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.sex = sex;
        this.birthDate = birthDate;
        this.inn = inn;
        this.passportSerial = passportSerial;
        this.phone = phone;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public String getPassportSerial() {
        return passportSerial;
    }

    public void setPassportSerial(String passportSerial) {
        this.passportSerial = passportSerial;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

//    @Override
//    public String toString() {
//        final StringBuilder sb = new StringBuilder("Client{");
//        sb.append("id=").append(id);
//        sb.append(", surname='").append(surname).append('\'');
//        sb.append(", name='").append(name).append('\'');
//        sb.append(", patronymic='").append(patronymic).append('\'');
//        sb.append(", sex=").append(sex);
//        sb.append(", birthDate=").append(birthDate);
//        sb.append(", inn='").append(inn).append('\'');
//        sb.append(", passportSerial='").append(passportSerial).append('\'');
//        sb.append(", phone='").append(phone).append('\'');
//        sb.append('}');
//        return sb.toString();
//    }
}

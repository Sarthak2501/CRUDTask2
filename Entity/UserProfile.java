package com.example.demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.UUID;


@Entity
@Table
public class UserProfile {

    @Id
    private UUID userID;
    private String firstName;
    private String secondName;
    private String email;
    private String password;
    private Long contantNumber;
    private String userBio;
    private LocalDate dob;
    private String presentAddress;
    private String permanentAddress;
    private String Gender;
    private String Hobbies;

    @Transient
    private int age;


    public UserProfile() {
        super();
    }

    public UserProfile(UUID userID, String firstName,
                       String secondName, String email,
                       String password, Long contantNumber,
                       String userBio, LocalDate dob,
                       String presentAddress,
                       String permanentAddress, String gender,
                       String hobbies) {
        this.userID = userID;
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.password = password;
        this.contantNumber = contantNumber;
        this.userBio = userBio;
        this.dob = dob;
        this.presentAddress = presentAddress;
        this.permanentAddress = permanentAddress;
        Gender = gender;
        Hobbies = hobbies;
    }

    public UUID getUserID() {
        return userID;
    }

    public void setUserID(UUID userID) {
        this.userID = userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

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

    public Long getContantNumber() {
        return contantNumber;
    }

    public void setContantNumber(Long contantNumber) {
        this.contantNumber = contantNumber;
    }

    public String getUserBio() {
        return userBio;
    }

    public void setUserBio(String userBio) {
        this.userBio = userBio;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getHobbies() {
        return Hobbies;
    }

    public void setHobbies(String hobbies) {
        Hobbies = hobbies;
    }

    public int getAge() {
        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserProfile{" +
                "userID=" + userID +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", contantNumber=" + contantNumber +
                ", userBio='" + userBio + '\'' +
                ", dob=" + dob +
                ", presentAddress='" + presentAddress + '\'' +
                ", permanentAddress='" + permanentAddress + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Hobbies='" + Hobbies + '\'' +
                ", age=" + age +
                '}';
    }
}

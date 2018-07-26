package com.cast.recruit.model;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created By GuuBohan.
 * On 2018/7/15
 */

@Entity
public class User {
    @Id
    @NotNull
    @Size(min = 9, max = 9)
//    @Pattern(regex =)
    private String studentID;
    @NotNull
    private String studentName;
//    @Size(min = 6, max = 20)
//    private String password;
    @NotNull
    private String studentSex;
    @NotNull
//    @Length(min = 11, max = 11)
    private Long phoneNumber;
    private String intention_1;
    private String intention_2;

    public User(){
    }

    public User(String studentID, String studentName, String studentSex, Long phoneNumber, String intention_1,String intention_2){
        this.studentID = studentID;
//        this.password = password;
        this.studentName =studentName;
        this.studentSex =studentSex;
        this.phoneNumber = phoneNumber;
        this.intention_1 = intention_1;
        this.intention_2 = intention_2;
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public String getIntention_1() {
        return intention_1;
    }

    public void setIntention_1(String intention_1) {
        this.intention_1 = intention_1;
    }

    public String getIntention_2() {
        return intention_2;
    }

    public void setIntention_2(String intention_2) {
        this.intention_2 = intention_2;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

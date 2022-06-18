package com.example.hibernateonetoonemapping.Entity;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name="user_profile")
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="PhoneNumber")
    private String phoneNumber;
    @Column(name="Address")
    private String address;
    @Column(name="Gen")
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @Column(name="date_of_birth")
    private LocalDate dateOfBirth;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "userProfile")
    private User user;

    public UserProfile()
    {

    }

    public UserProfile(long id, String phoneNumber, String address, Gender gender, LocalDate dateOfBirth) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}

package com.example.springapi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document("user")
public class User
{
    @Id
    private String _id;
    @Field(name = "firstName")
    private String firstName;
    @Field(name = "lastName")
    private String lastName;
    @Field(name = "job")
    private String job;
    @Field(name = "company")
    private String company;

    public User(String _id, String firstName, String lastName, String job, String company)
    {
        this._id = _id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.job = job;
        this.company = company;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

}

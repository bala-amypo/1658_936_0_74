package com.example.demo.entity;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class StudentEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private integer id;
    private string username;
    private string email;
    private string password;
    private Date created;
    public Date getCreated(){
        return created;
    }


public void setCreated(Date created){
    this.created=created;
}
public integer getId(){
    return id;
}
public void setId(Integer id){
    this.id=id;
}
public String getName(){
    return name;
}

public void setName(String name){
    this.name=name;
}
public String getEmail(){
    return email;
}
public void setEmail(String email){
    this.email=email;

}
public String getPassword(){
    return password;
}
public void setPassword(String password){
    this.password=password;
}
public sampleEntity(Integer id,String name,String email,String password){
    this.id=id;
    this.name=name;
    this.email=email;
    this.password;
}
public sampleEntity(){

}

}
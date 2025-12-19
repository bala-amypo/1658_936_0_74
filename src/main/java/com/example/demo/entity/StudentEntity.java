package com.example.demo.entity;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Prepersist;
@Prepersist
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String password;
    private Date created;
@PrePersist
public void Oncreate(
{
LocalDateTime now=new LocalDateTime();
this.createdat=now;
this.up

}
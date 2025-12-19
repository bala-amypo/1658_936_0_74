package com.example.demo.entity;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.Prepersist;
import jakarta.persistence.PreUpdate;

@PreUpdate
@Prepersist
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimestampEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private LocalDateTime createAt;
    private LocalDateTime updateAt;

@PrePersist

public void Oncreate()
{
    LocalDateTime now=LocalDateTime().now();

this.createdAt=now;
this.updatedAt=now;

}
@PreUpdate
public void Onupdate(){
        LocalDateTime now=LocalDateTime().now();

this.updateAt=now;    
    }
}
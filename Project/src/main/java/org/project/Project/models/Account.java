package org.project.Project.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Account {
   @Id
   @GeneratedValue(strategy= GenerationType.SEQUENCE)
   private long id;

   private String email;

   private String password;

   private String fullName;

   private String phone;

   @OneToMany(mappedBy = "account")
   private List<Post> posts;

   
}

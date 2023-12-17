package com.example.my_crud_boot.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "FIRST_NAME")
    @Size(min = 2, max = 50, message = "Name should be between 2 and 5 characters")
    @NotEmpty(message = "User Name cannot be empty.")
    private String firstName;

    @Column(name = "LAST_NAME")
    @Size(min = 2, max = 50, message = "Last Name should be between 2 and 5 characters")
    @NotEmpty(message = "User LastName cannot be empty.")
    private String lastName;

    @Email(message = "Email should be valid")
    @NotEmpty(message = "User email cannot be empty.")
    @Column(name = "EMAIL")
    private String email;


    @Column(name = "USERNAME")
    @Size(min = 2, max = 50, message = "Username should be between 2 and 5 characters")
    @NotEmpty(message = "User name cannot be empty.")
    private String userName;

    public String getNamedLink() {
        return "Link to " + this.firstName + "'s page";
    }

}

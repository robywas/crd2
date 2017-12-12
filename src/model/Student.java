package model;

import javax.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;


}

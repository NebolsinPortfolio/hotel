package ru.relex.practice.model;

import javax.persistence.Entity;
import javax.persistence.*;

/**
 * электронные адрса для рассылки
 */

@Entity
@Table(name = "EMAIL")
public class Email {
    private int id;
    private String email;

    @Id
    @SequenceGenerator(name = "emailIdSeq", sequenceName = "EMAIL_ID_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emailIdSeq")
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "EMAIL_ADDRESS")
    public String getEmail() { return email; }

    public void setEmail(String email) {this.email = email; }
}
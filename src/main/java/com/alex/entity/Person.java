package com.alex.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name = "Person")
public class Person implements Serializable {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "created")
    private Long created = System.currentTimeMillis();

    @Column(name = "username")
    private String username;

    @Column(name = "address")
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "remark")
    private String remark;
}

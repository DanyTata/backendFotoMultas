package com.example.fotomulta.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity(name="fotomultas_usuarios")

public class Users {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private  String name;
    private  String lastName;
    private String cel;
    private String addres;
    private String city;
}

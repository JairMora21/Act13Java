/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.entity;

import com.example.demo.dto.PersonaDTO;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

/**
 *
 * @author jajimenez
 */
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column()
    private String nombre;
    @Column()
    private String apellido;
    @Column()
    private int edad;
    @Column()
    private char sexo;
    @Column()
    private float estatura;
    @Column()
    private float peso;
    @Column()
    private float IMC;
    @Column()
    private String fecha;

    public Persona() {

    }

    /*
    public Persona(PersonaDTO personaDTO) {
        this.nombre = personaDTO.getNombre();
        this.apellido = personaDTO.getApellido();

    }*/

    public Persona(PersonaDTO personaDTO) {
        this.nombre = personaDTO.getNombre();
        this.apellido = personaDTO.getApellido();
        this.edad = personaDTO.getEdad();
        this.sexo = personaDTO.getSexo();
        this.estatura = personaDTO.getEstatura();
        this.peso = personaDTO.getPeso();
        this.IMC = personaDTO.getIMC();
        this.fecha = personaDTO.getFecha();
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getIMC() {
        return IMC;
    }

    public void setIMC(float IMC) {
        this.IMC = IMC;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}

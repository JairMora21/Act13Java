/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.dto;

import lombok.Data;

import javax.persistence.Column;

/**
 *
 * @author jajimenez
 */
@Data
public class PersonaDTO {

    private Integer id;
    private String nombre;
    private String apellido;
    private Integer edad;
    private Character sexo;
    private Float estatura;
    private Float peso;
    private Float IMC;
    private String fecha;

}

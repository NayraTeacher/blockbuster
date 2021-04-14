/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.models;

/**
 *
 * @author Nayra
 */
public class Actor {
    private String nombre;
    private String nacionalidad;
    private char sexo;
    
    public Actor(){}
    
    public Actor(String nombre, String nacionalidad, char sexo){
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.sexo = sexo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad the nacionalidad to set
     */
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Actor{nombre=").append(nombre);
        sb.append(", nacionalidad=").append(nacionalidad);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}

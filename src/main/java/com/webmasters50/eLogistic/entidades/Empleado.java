package com.webmasters50.eLogistic.entidades;

public class Empleado {

    //Atributos
    private String nombre;
    private String correo;
    private String empresa;
    private String rol;

    //se adiciona un nuevo atributo de la clase empresa para crear la relacion de entidad

    private Empresa empresas;

    //Constructor


    public Empleado(String nombre, String correo, String empresa, String rol, Empresa empresas) {
        this.nombre = nombre;
        this.correo = correo;
        this.empresa = empresa;
        this.rol = rol;
        this.empresas = empresas;
    }

    //Getters and Setters


    public Empresa getEmpresas() {
        return empresas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getRol() {
        return rol;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void setEmpresas(Empresa empresas) {
        this.empresas = empresas;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", empresa='" + empresa + '\'' +
                ", rol='" + rol + '\'' +
                ", empresas=" + empresas +
                '}';
    }
}
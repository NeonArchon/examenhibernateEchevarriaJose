package org.example.entities;


import java.io.Serializable;
@Entity
public class Empresa implements Serializable {

    @column(nullable = false)
    private String id_empleado;
    private String nombre;
    private String email;
    private String departamento;

    public Empresa(){}

    public Empresa(String id_empleado, String nombre, String email, String departamento) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.email = email;
        this.departamento = departamento;
    }

    public String getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}

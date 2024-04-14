/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session03.entidades;

/**
 *
 * @author Estudiante
 */
public class PersonaDatosContacto {
    
    private String telefono;
    private String direccion;
    private String correo;

    public PersonaDatosContacto(String telefono, String direccion, String correo) {
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}

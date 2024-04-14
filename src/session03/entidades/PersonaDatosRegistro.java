/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session03.entidades;

/**
 *
 * @author Estudiante
 */
public class PersonaDatosRegistro {
    private String usuario;
    private String contraseña;
    private String email;

    public PersonaDatosRegistro(String usuario, String contraseña, String email) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getEmail() {
        return email;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}

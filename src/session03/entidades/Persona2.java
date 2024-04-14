/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package session03.entidades;

/**
 *
 * @author Estudiante
 */
public class Persona2 {
    
    private PersonaDatosBasicos dataB;
    private PersonaDatosContacto dataC;
    private PersonaDatosRegistro dataR;

    public Persona2(PersonaDatosBasicos dataB, PersonaDatosContacto dataC, PersonaDatosRegistro dataR) {
        this.dataB = dataB;
        this.dataC = dataC;
        this.dataR = dataR;
    }

    public PersonaDatosBasicos getDataB() {
        return dataB;
    }

    public PersonaDatosContacto getDataC() {
        return dataC;
    }

    public PersonaDatosRegistro getDataR() {
        return dataR;
    }

    public void setDataB(PersonaDatosBasicos dataB) {
        this.dataB = dataB;
    }

    public void setDataC(PersonaDatosContacto dataC) {
        this.dataC = dataC;
    }

    public void setDataR(PersonaDatosRegistro dataR) {
        this.dataR = dataR;
    }
    
}

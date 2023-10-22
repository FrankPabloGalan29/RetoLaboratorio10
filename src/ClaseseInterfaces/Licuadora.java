/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseseInterfaces;

/**
 *
 * @author Frank
 */
public class Licuadora implements Electrodomestico {
    private String nombreLicuadora;
    private String velocidadLicuadora;
    private String voltajeLicuadora;
    private String modeloLicuadora;

    public Licuadora(String nombreLicuadora, String velocidadLicuadora, String voltajeLicuadora, String modeloLicuadora) {
        this.nombreLicuadora = nombreLicuadora;
        this.velocidadLicuadora = velocidadLicuadora;
        this.voltajeLicuadora = voltajeLicuadora;
        this.modeloLicuadora = modeloLicuadora;
    }

    public String getNombreLicuadora() {
        return nombreLicuadora;
    }

    public void setNombreLicuadora(String nombreLicuadora) {
        this.nombreLicuadora = nombreLicuadora;
    }

    public String getVelocidadLicuadora() {
        return velocidadLicuadora;
    }

    public void setVelocidadLicuadora(String velocidadLicuadora) {
        this.velocidadLicuadora = velocidadLicuadora;
    }

    public String getVoltajeLicuadora() {
        return voltajeLicuadora;
    }

    public void setVoltajeLicuadora(String voltajeLicuadora) {
        this.voltajeLicuadora = voltajeLicuadora;
    }

    public String getModeloLicuadora() {
        return modeloLicuadora;
    }

    public void setModeloLicuadora(String modeloLicuadora) {
        this.modeloLicuadora = modeloLicuadora;
    }

    @Override
    public String mostrarElec() {
        return "Licuadora - Nombre: " + getNombreLicuadora();
    }

    @Override
    public void agregarLista() {
        RetoLaboratorio10.listaelectro.add(this);
    }
}


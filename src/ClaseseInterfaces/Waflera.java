/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseseInterfaces;

/**
 *
 * @author Frank
 */
public class Waflera implements Electrodomestico {
    private String nombreWaflera;
    private String marcaWaflera;
    private String tipoWaflera;

    public Waflera(String nombreWaflera, String marcaWaflera, String tipoWaflera) {
        this.nombreWaflera = nombreWaflera;
        this.marcaWaflera = marcaWaflera;
        this.tipoWaflera = tipoWaflera;
    }

    public String getNombreWaflera() {
        return nombreWaflera;
    }

    public void setNombreWaflera(String nombreWaflera) {
        this.nombreWaflera = nombreWaflera;
    }

    public String getMarcaWaflera() {
        return marcaWaflera;
    }

    public void setMarcaWaflera(String marcaWaflera) {
        this.marcaWaflera = marcaWaflera;
    }

    public String getTipoWaflera() {
        return tipoWaflera;
    }

    public void setTipoWaflera(String tipoWaflera) {
        this.tipoWaflera = tipoWaflera;
    }

    @Override
    public String mostrarElec() {
        return "Waflera - Nombre: " + getNombreWaflera();
    }

    @Override
    public void agregarLista() {
        RetoLaboratorio10.listaelectro.add(this);
    }
}



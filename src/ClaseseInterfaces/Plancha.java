/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseseInterfaces;

import ClaseseInterfaces.RetoLaboratorio10;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Frank
 */
public class Plancha implements Electrodomestico{
    
    private String nombrePlancha;
    private String temperPlancha;
    private String vaporPlancha;

    public Plancha(String nombrePlancha, String temperPlancha, String vaporPlancha) {
        this.nombrePlancha = nombrePlancha;
        this.temperPlancha = temperPlancha;
        this.vaporPlancha = vaporPlancha;
    }

    public String getNombrePlancha() {
        return nombrePlancha;
    }

    public void setNombrePlancha(String nombrePlancha) {
        this.nombrePlancha = nombrePlancha;
    }

    public String getTemperPlancha() {
        return temperPlancha;
    }

    public void setTemperPlancha(String temperPlancha) {
        this.temperPlancha = temperPlancha;
    }

    public String getVaporPlancha() {
        return vaporPlancha;
    }

    public void setVaporPlancha(String vaporPlancha) {
        this.vaporPlancha = vaporPlancha;
    }
    @Override
    public String mostrarElec() {
        return "Plancha - Nombre : "+getNombrePlancha();
    }

    @Override
    public void agregarLista() {
        RetoLaboratorio10.listaelectro.add(this);
    }
}

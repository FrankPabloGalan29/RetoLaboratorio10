/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ClaseseInterfaces;

import Pantallas.RegistroElectrodomestico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Frank
 */
public class RetoLaboratorio10 {

    public static List<String> aVapor = new ArrayList<>();
    public static List<String> tipoWaflera = new ArrayList<>();
    public static List<Electrodomestico> listaelectro = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Agregamos elementos a las listas
        aVapor.add("TRUE");
        aVapor.add("FALSE");
        tipoWaflera.add("INDUSTRIAL");
        tipoWaflera.add("HOGAR");
        tipoWaflera.add("LUJO");
        RegistroElectrodomestico elec = new RegistroElectrodomestico();
        elec.setLocationRelativeTo(null);
        elec.setVisible(true);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author User
 */
public class Logica {
    public String VResistencia;
    
    public void CResistencia4(String CBanda1 ,String CBanda2, String Multiplicador){
        double Resistencia=0;
        Resistencia = (Double.parseDouble(CBanda1.concat(CBanda2)))* Double.parseDouble(Multiplicador);
        RDatos(Resistencia);
    }
    
    public void CResistencia(String CBanda1,String CBanda2, String CBanda3,String Multiplicador){
        double Resistencia=0;
        Resistencia = (Double.parseDouble(CBanda1.concat(CBanda2).concat(CBanda3)))* Double.parseDouble(Multiplicador);
        RDatos(Resistencia); 
    }
    

    public void RDatos(double Resistencia){
        if(Resistencia < 1000){
           VResistencia = String.valueOf(Resistencia + "Ω");
        }
        else if(Resistencia >= 1000 && Resistencia < 1000000){
            Resistencia /= 1000;
            VResistencia = String.valueOf(Resistencia + "KΩ");
        }else if(Resistencia >= 1000000 && Resistencia < 1000000000){
            Resistencia /= 1000000;
            VResistencia = String.valueOf(Resistencia + "MΩ");
        }else if(Resistencia >=1000000000){
            Resistencia /= 1000000000;
            VResistencia = String.valueOf(Resistencia + "GΩ");
        }
    }
    
    
    
}

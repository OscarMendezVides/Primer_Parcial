/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialprogra;

import java.awt.Color;

/**
 *
 * @author cocav
 */
public class Avion {
    int id_tipo_aereo;
    String Marca;
    String Modelo;
    String MarcaNeumaticos;
    Color Color;
    int DiaCompra;
    int MesCompra;
    int AnyoCompra;
    
    public Avion(){
    Marca ="";
    Modelo = "";
    MarcaNeumaticos = "";
   }

    public Avion(int id_tipo_aereo, String Marca, String Modelo, String MarcaNeumaticos, Color Color, int DiaCompra, int MesCompra, int AnyoCompra) {
        this.id_tipo_aereo = id_tipo_aereo;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.MarcaNeumaticos = MarcaNeumaticos;
        this.Color = Color;
        this.DiaCompra = DiaCompra;
        this.MesCompra = MesCompra;
        this.AnyoCompra = AnyoCompra;
    }

   

   
    
}

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
public class Automovil {
    int id_tipo_terrestre;
    String Marca;
    String Modelo;
    String MarcaNeumaticos;
    Color Color;
    int DiaCompra;
    int MesCompra;
    int AnyoCompra;
    
    public Automovil(){
    Marca ="";
    Modelo = "";
    MarcaNeumaticos = "";
   }

    public Automovil(int id_tipo_terrestre, String Marca, String Modelo, String MarcaNeumaticos, Color Color, int DiaCompra, int MesCompra, int AnyoCompra) {
        this.id_tipo_terrestre = id_tipo_terrestre;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.MarcaNeumaticos = MarcaNeumaticos;
        this.Color = Color;
        this.DiaCompra = DiaCompra;
        this.MesCompra = MesCompra;
        this.AnyoCompra = AnyoCompra;
    }

    

   
    
    
}

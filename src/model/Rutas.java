package model;

import java.awt.Point;

/** 
 * @author milver flores <mfflowg@gmail.com>
 */
public class Rutas {
    private Point puntoXY;
    private String nombre;
    public Rutas(int x,int y,String nomb){
        puntoXY=new Point(x, y);
        nombre=nomb;
    }
    public Point getPointXY(){
        return this.puntoXY;
    }
    public String getNombre(){
        return this.nombre;
    }
}

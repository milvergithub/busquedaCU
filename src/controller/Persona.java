package controller;

import actores.Actor;
import actores.Moved;
import java.awt.Point;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Rutas;
import world.StageM;

/** 
 * @author milver flores <mfflowg@gmail.com>
 */
public class Persona extends Actor implements Runnable{
    private Moved moved;
    private ArrayList<Point> puntos;
    private ArrayList<Rutas> rutaLineal;
    public Persona(StageM s) {
        super(s);
    }
    public Persona(StageM s,ArrayList<Rutas> rl){
        super(s);
        super.setImagen("img/persona.png");
        moved=new Moved();
        puntos=new ArrayList<Point>();
        rutaLineal=rl;
        generarRuta();
        super.setBounds(puntos.get(0).x, puntos.get(0).y, 20, 30);
    }
    private void generarRuta(){
        for (int i = 0; i < rutaLineal.size()-1; i++) {
            addLista(rutaLineal.get(i).getPointXY(),rutaLineal.get(i+1).getPointXY());
        }
    }
    private void addLista(Point pi,Point pf){
        ArrayList<Point>puntosObt=moved.getPointsDiagonal(pi.x, pi.y, pf.x, pf.y);
        for (int i = 0; i < puntosObt.size(); i++) {
            puntos.add(puntosObt.get(i));
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < puntos.size(); i++) {
            this.setLocation(puntos.get(i));
            dormir();
        }
    }
    private void dormir(){
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
        }
    }
}

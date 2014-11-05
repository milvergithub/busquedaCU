package model;

import java.util.HashMap;
import java.util.Map;
/** 
 * @author magios <magios@gmail.com>
 */
public class MapaModel {
    private Map<String,String[]>vecinos;
    //MAPA de rutas vecinas
    private String [] bloque_central={"departamento_biologia","departamento_quimica","departamento_fisica","edificio_electro"};
    private String [] departamento_quimica={"departamento_biologia","bloque_central"};
    private String [] departamento_biologia={"edificio_electro","departamento_quimica","bloque_central","planta_procesos_industriales","laboratorio_mecanica","edificio_cad_cam"};
    private String [] edificio_electro={"departamento_biologia","bloque_central","edificio_cad_cam"};
    private String [] departamento_fisica={"bloque_central"};
    private String [] edificio_cad_cam={"edificio_electro","departamento_biologia","laboratorio_mecanica"};
    private String [] laboratorio_mecanica={"edificio_cad_cam","departamento_biologia"};
    private String [] biblioteca={"departamento_industrial","fiscom"};
    private String [] departamento_industrial={"biblioteca"};
    private String [] fiscom={"biblioteca","planta_procesos_industriales"};
    private String [] planta_procesos_industriales={"departamento_biologia","fiscom"};
    
    public MapaModel(){
        vecinos=new HashMap<String,String[]>();
        cargarVecinos();
    }
    private void cargarVecinos(){
        vecinos.put("bloque_central", bloque_central);
        vecinos.put("departamento_quimica", departamento_quimica);
        vecinos.put("departamento_biologia", departamento_biologia);
        vecinos.put("edificio_electro", edificio_electro);
        vecinos.put("departamento_fisica", departamento_fisica);
        vecinos.put("edificio_cad_cam", edificio_cad_cam);
        vecinos.put("laboratorio_mecanica", laboratorio_mecanica);
        vecinos.put("biblioteca", biblioteca);
        vecinos.put("departamento_industrial", departamento_industrial);
        vecinos.put("fiscom", fiscom);
        vecinos.put("planta_procesos_industriales", planta_procesos_industriales);
    }
    public String[] getVecinos(String nodo){
        return vecinos.get(nodo);
    }
}













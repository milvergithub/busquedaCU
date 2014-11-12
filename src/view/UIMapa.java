package view;

import controller.Persona;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.MapaModel;
import model.Nodo;
import model.Rutas;
import world.StageM;
/**
 * @author milver flores <mfflowg@gmail.com>
 */
public class UIMapa extends javax.swing.JFrame {
    
    private Map<String,JLabel>puntos;
    private MapaModel mapamodelo;
    private Nodo nodos;
    private int costoRuta;
    private String nodoAnterior;
    private ArrayList<String> nodosAnteriores;
    private ArrayList<Rutas> rutaToPaint;
    public UIMapa() {
        nodoAnterior="kkkkk";
        nodosAnteriores=new ArrayList<String>();
        rutaToPaint=new ArrayList<Rutas>();
        mapamodelo=new MapaModel();
        puntos=new HashMap<String,JLabel>();
        initComponents();
        setSize(1000, 650);
        cargarPuntos();
    }
    public void cargarPuntos(){
        puntos.put("bloque_central", bloque_central);
        puntos.put("departamento_biologia", departamento_biologia);
        puntos.put("departamento_quimica", departamento_quimica);
        puntos.put("departamento_fisica", departamento_fisica);
        puntos.put("edificio_electro", edificio_electro);
        puntos.put("edificio_cad_cam", edificio_cad_cam);
        puntos.put("laboratorio_mecanica", laboratorio_mecanica);
        puntos.put("biblioteca", biblioteca);
        puntos.put("departamento_industrial", departamento_industrial);
        puntos.put("fiscom", fiscom);
        puntos.put("planta_procesos_industriales", planta_procesos_industriales);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new panelMapa();
        departamento_quimica = new javax.swing.JLabel();
        bloque_central = new javax.swing.JLabel();
        departamento_fisica = new javax.swing.JLabel();
        departamento_biologia = new javax.swing.JLabel();
        edificio_electro = new javax.swing.JLabel();
        departamento_industrial = new javax.swing.JLabel();
        biblioteca = new javax.swing.JLabel();
        laboratorio_mecanica = new javax.swing.JLabel();
        edificio_cad_cam = new javax.swing.JLabel();
        fiscom = new javax.swing.JLabel();
        planta_procesos_industriales = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        jcbInicio = new javax.swing.JComboBox();
        jcbFinal = new javax.swing.JComboBox();
        btnMostrarMapa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        detalleAT = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        detalleCosto = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        departamento_quimica.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        departamento_quimica.setForeground(new java.awt.Color(255, 4, 4));
        departamento_quimica.setText("*");

        bloque_central.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        bloque_central.setForeground(new java.awt.Color(255, 4, 4));
        bloque_central.setText("*");

        departamento_fisica.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        departamento_fisica.setForeground(new java.awt.Color(255, 4, 4));
        departamento_fisica.setText("*");

        departamento_biologia.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        departamento_biologia.setForeground(new java.awt.Color(255, 4, 4));
        departamento_biologia.setText("*");

        edificio_electro.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        edificio_electro.setForeground(new java.awt.Color(255, 4, 4));
        edificio_electro.setText("*");

        departamento_industrial.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        departamento_industrial.setForeground(new java.awt.Color(255, 4, 4));
        departamento_industrial.setText("*");

        biblioteca.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        biblioteca.setForeground(new java.awt.Color(255, 4, 4));
        biblioteca.setText("*");

        laboratorio_mecanica.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        laboratorio_mecanica.setForeground(new java.awt.Color(255, 4, 4));
        laboratorio_mecanica.setText("*");

        edificio_cad_cam.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        edificio_cad_cam.setForeground(new java.awt.Color(255, 4, 4));
        edificio_cad_cam.setText("*");

        fiscom.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        fiscom.setForeground(new java.awt.Color(255, 4, 4));
        fiscom.setText("*");

        planta_procesos_industriales.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        planta_procesos_industriales.setForeground(new java.awt.Color(255, 4, 4));
        planta_procesos_industriales.setText("*");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(departamento_fisica)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(biblioteca)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(edificio_cad_cam)
                                .addGap(59, 59, 59)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(planta_procesos_industriales)
                                    .addComponent(laboratorio_mecanica))
                                .addGap(271, 271, 271))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(edificio_electro)
                                .addGap(148, 148, 148))))))
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(departamento_biologia))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(departamento_quimica)
                        .addGap(101, 101, 101)
                        .addComponent(bloque_central)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(departamento_industrial)
                        .addGap(318, 318, 318))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(fiscom)
                        .addGap(375, 375, 375))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(388, 388, 388)
                .addComponent(departamento_fisica, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(edificio_cad_cam, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(departamento_quimica, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bloque_central, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(departamento_biologia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(edificio_electro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(planta_procesos_industriales, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(laboratorio_mecanica, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(fiscom, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(departamento_industrial, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(biblioteca, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );

        btnIniciar.setText("iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        jcbInicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "bloque_central", "departamento_quimica", "departamento_biologia", "edificio_electro", "departamento_fisica", "edificio_cad_cam", "laboratorio_mecanica", "biblioteca", "departamento_industrial", "fiscom", "planta_procesos_industriales" }));

        jcbFinal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "bloque_central", "departamento_quimica", "departamento_biologia", "edificio_electro", "departamento_fisica", "edificio_cad_cam", "laboratorio_mecanica", "biblioteca", "departamento_industrial", "fiscom", "planta_procesos_industriales" }));

        btnMostrarMapa.setText("mostrar");
        btnMostrarMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarMapaActionPerformed(evt);
            }
        });

        detalleAT.setColumns(20);
        detalleAT.setRows(5);
        jScrollPane1.setViewportView(detalleAT);

        detalleCosto.setColumns(20);
        detalleCosto.setRows(5);
        jScrollPane2.setViewportView(detalleCosto);

        jLabel1.setText("costo busqueda");

        jLabel2.setText("nodo inicial");

        jLabel3.setText("nodos recorridos");

        jLabel4.setText("nodo final");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcbFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMostrarMapa, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addComponent(jLabel4))
                        .addGap(0, 53, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(817, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(65, 65, 65)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIniciar)
                            .addComponent(btnMostrarMapa)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(252, 252, 252)
                    .addComponent(jLabel3)
                    .addContainerGap(360, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        
        costoRuta=0;//iniciamos el costo de la ruta que es 0
        nodoAnterior="kkkkk"; // el nodo anterior que recorrimos al inicio no hay nada asi que colocamos lo que sea
        rutaToPaint=new ArrayList<Rutas>();//en esta lista agregamos las rutas que recorremos
        nodosAnteriores=new ArrayList<String>();//los nodos anteriores que recorrimos como raices
        //busca la ruta mas corta entre los posibles rutas la menor
        buscarRutaCorta(String.valueOf(jcbInicio.getSelectedItem()), String.valueOf(jcbFinal.getSelectedItem()));
        //aniadimos en area de testo el detalle
        aniadirDetalle();
        //creamos el objeto que se movera
        Persona p=new Persona((StageM)panel, rutaToPaint);
        //agregamos al escenario
        panel.add(p);
        //creamos e iniciamos
        Thread hilo=new Thread(p);
        hilo.start();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnMostrarMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarMapaActionPerformed
        mapaImg m=new mapaImg();
        m.setVisible(true);
    }//GEN-LAST:event_btnMostrarMapaActionPerformed
    //imprimi todo el detalle
    private void aniadirDetalle(){
        String detalle="";
        int distancia=0;
        int pasos=0;
        for (int i = 0; i < rutaToPaint.size()-1; i++) {
            detalle=detalle+"raiz=> "+rutaToPaint.get(i).getNombre()+"\n";
            distancia=distancia+getDistancia(rutaToPaint.get(i).getPointXY().x, rutaToPaint.get(i).getPointXY().y, rutaToPaint.get(i+1).getPointXY().x, rutaToPaint.get(i+1).getPointXY().y);
            pasos=i;
        }
        detalle=detalle+"raiz=> "+rutaToPaint.get(pasos+1).getNombre()+"\n";
        detalleAT.setText(detalle);
        detalleCosto.setText("Costo : "+pasos+"\n"+"Costo Distancia : "+distancia);
    }
    private void buscarRutaCorta(String origen,String destino){
        nodosAnteriores.add("kkkkk");
        //mientras no estemos en el destino y que el raiz tenga vecinos donde ir
        //menos de los que venimos o ya pasamos por alguno esos son descartados
        while (!(origen.equals(destino))&&!(vecinosPorRecorrer(origen).length==0)) {            
            System.out.println("raiz => "+origen);
            //agregamos coordenadas X Y en la lista
            rutaToPaint.add(new Rutas(puntos.get(origen).getX(), puntos.get(origen).getY(), origen));
            String vecinos[]=vecinosPorRecorrer(origen);
            System.out.println("tamanio : "+vecinos.length);
            nodoAnterior=origen;
            nodosAnteriores.add(origen);
            origen=mejorVecino(origen,vecinos);   
        }
        if (origen==destino) {
            System.out.println("raiz => "+destino);
            rutaToPaint.add(new Rutas(puntos.get(destino).getX(), puntos.get(destino).getY(), destino));
        }
    }
    //este metodo obtiene el mejor vecino
    private String mejorVecino(String origen,String[] vecinos){
        int [] distancias=new int[vecinos.length];
        for (int i = 0; i < vecinos.length; i++) {
            distancias[i]=getDistancia(puntos.get(origen).getX(), puntos.get(vecinos[i]).getX(), puntos.get(origen).getY(), puntos.get(vecinos[i]).getY());
        }
        int pos=rutaMasCorta(distancias);
        return vecinos[pos];
    }
    //obtiene la ruta mas corta
    private int rutaMasCorta(int dist[]){
        int posx=0;
        for (int i = 1; i < dist.length; i++) {
            if (dist[i]<=dist[posx]) {
                posx=i;
            }
        }
        return posx;
    }
    //distancia entre dos puntos en px
    private int getDistancia(int xi,int yi,int xf,int yf){
        return (int)Math.hypot(xf-xi, yf-yi);
    }
    private String[] vecinosPorRecorrer(String nodo){
        String[] vecinos=mapamodelo.getVecinos(nodo);
        ArrayList<String> nuevosVecinos=new ArrayList<>();
        for (int i = 0; i < vecinos.length; i++) {
            if (estaInNodes(vecinos[i])) {
                
            }else{
                nuevosVecinos.add(vecinos[i]);
            }
        }
        String nuevos[]=new String[nuevosVecinos.size()];
        for (int i = 0; i < nuevosVecinos.size(); i++) {
            nuevos[i]=nuevosVecinos.get(i);
        }
        return nuevos;
    }
    private boolean estaInNodes(String nodo){
        boolean res=false;
        for (int i = 0; i < nodosAnteriores.size(); i++) {
            if (nodosAnteriores.get(i).equals(nodo)) {
                res=true;
            }
        }
        return res;
    }
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UIMapa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(UIMapa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(UIMapa.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(UIMapa.class.getName()).log(Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIMapa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel biblioteca;
    private javax.swing.JLabel bloque_central;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnMostrarMapa;
    private javax.swing.JLabel departamento_biologia;
    private javax.swing.JLabel departamento_fisica;
    private javax.swing.JLabel departamento_industrial;
    private javax.swing.JLabel departamento_quimica;
    private javax.swing.JTextArea detalleAT;
    private javax.swing.JTextArea detalleCosto;
    private javax.swing.JLabel edificio_cad_cam;
    private javax.swing.JLabel edificio_electro;
    private javax.swing.JLabel fiscom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox jcbFinal;
    private javax.swing.JComboBox jcbInicio;
    private javax.swing.JLabel laboratorio_mecanica;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel planta_procesos_industriales;
    // End of variables declaration//GEN-END:variables
}

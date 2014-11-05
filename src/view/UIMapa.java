package view;

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
        setSize(900, 650);
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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edificio_electro)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(edificio_cad_cam)
                                .addGap(59, 59, 59)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(planta_procesos_industriales)
                                    .addComponent(laboratorio_mecanica))))
                        .addGap(271, 271, 271))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcbInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jcbFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar)
                    .addComponent(jcbInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        costoRuta=0;
        nodoAnterior="kkkkk";
        rutaToPaint=new ArrayList<Rutas>();
        nodosAnteriores=new ArrayList<String>();
        buscarRutaCorta(String.valueOf(jcbInicio.getSelectedItem()), String.valueOf(jcbFinal.getSelectedItem()));
    }//GEN-LAST:event_btnIniciarActionPerformed
    private void buscarRutaCorta(String origen,String destino){
        nodosAnteriores.add("kkkkk");
        while (!(origen.equals(destino))&&!(vecinosPorRecorrer(origen).length==0)) {            
            System.out.println("raiz => "+origen);
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
    private String mejorVecino(String origen,String[] vecinos){
        int [] distancias=new int[vecinos.length];
        for (int i = 0; i < vecinos.length; i++) {
            distancias[i]=getDistancia(puntos.get(origen).getX(), puntos.get(vecinos[i]).getX(), puntos.get(origen).getY(), puntos.get(vecinos[i]).getY());
        }
        int pos=rutaMasCorta(distancias);
        return vecinos[pos];
    }
    private int rutaMasCorta(int dist[]){
        int posx=0;
        for (int i = 1; i < dist.length; i++) {
            if (dist[i]<=dist[posx]) {
                posx=i;
            }
        }
        return posx;
    }
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
    private javax.swing.JLabel departamento_biologia;
    private javax.swing.JLabel departamento_fisica;
    private javax.swing.JLabel departamento_industrial;
    private javax.swing.JLabel departamento_quimica;
    private javax.swing.JLabel edificio_cad_cam;
    private javax.swing.JLabel edificio_electro;
    private javax.swing.JLabel fiscom;
    private javax.swing.JComboBox jcbFinal;
    private javax.swing.JComboBox jcbInicio;
    private javax.swing.JLabel laboratorio_mecanica;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel planta_procesos_industriales;
    // End of variables declaration//GEN-END:variables
}

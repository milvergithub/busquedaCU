/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * 
 * @author milver flore <mfflowg@gmail.com>
 */
public class panelMapaImg extends JPanel{
    
    public panelMapaImg(){
        
    }
    public void paintComponent(Graphics grafico) {
        ImageIcon Img = new ImageIcon(getClass().getResource("img/mapapuntos.png"));
        Graphics2D g2d=(Graphics2D)grafico;
        g2d.drawImage(Img.getImage(), 0, 0, getWidth(), getHeight(), null);
    }
}

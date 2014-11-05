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
import world.StageM;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class panelMapa extends StageM{
    public panelMapa(){
        
    }
    public void paintComponent(Graphics grafico) {
        ImageIcon Img = new ImageIcon(getClass().getResource("img/mapa.png"));
        Graphics2D g2d=(Graphics2D)grafico;
        g2d.drawImage(Img.getImage(), 0, 0, getWidth(), getHeight(), null);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package racerallycar;

import javax.swing.JFrame;

/**
 *
 * @author Luiz Alves
 */
public class GerenciaJanelas extends JFrame{
    
    public GerenciaJanelas(){
        
        this.setTitle("Race Rally Car");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }
    
}

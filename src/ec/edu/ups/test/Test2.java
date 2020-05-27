/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.test;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

/**
 *
 * @author Paul Idrovo
 */
public class Test2 {
    
    public static void main(String[] args) {        
        
        Frame miVentana = new Frame();
        miVentana.setSize(600,400);
        miVentana.setTitle("MENU USUARIO");
        miVentana.setLocation(0, 0);
        miVentana.setVisible(true);
        miVentana.setLocationRelativeTo(null);
        
        GridLayout Matriz = new GridLayout(5, 1);
        FlowLayout OpcionesMenu = new FlowLayout();
        BorderLayout latout = new BorderLayout();
        
        Panel miPanelPrincipal = new Panel(latout);
        Panel panelCentral = new Panel(Matriz);
        
        Panel panelVacio = new Panel(OpcionesMenu);
        Panel panelVacio1 = new Panel(OpcionesMenu);
        Panel panelVacio2 = new Panel(OpcionesMenu);
        Panel panelVacio3 = new Panel(OpcionesMenu);
        
        panelVacio.setBackground(Color.BLACK);
        panelVacio1.setBackground(Color.BLACK);
        panelVacio2.setBackground(Color.BLACK);
        panelVacio3.setBackground(Color.BLACK);
        
        
        
        
        
        Button bt1 = new Button("Agregar Telefono");
        Button bt2 = new Button("Editar Telefono");
        Button bt3 = new Button("Eliminar Telefono");
        Button bt4 = new Button("Buscar Telefono");
        Button bt5 = new Button("Cerrar Sesion");
        
        panelCentral.add(bt1);
        panelCentral.add(bt2);
        panelCentral.add(bt3);
        panelCentral.add(bt4);
        panelCentral.add(bt5);
        
        
        miPanelPrincipal.add(panelCentral,BorderLayout.CENTER);
        miPanelPrincipal.add(panelVacio,BorderLayout.NORTH);
        miPanelPrincipal.add(panelVacio1,BorderLayout.SOUTH);
        miPanelPrincipal.add(panelVacio2,BorderLayout.WEST);
        miPanelPrincipal.add(panelVacio3,BorderLayout.EAST);
        
        miVentana.add(miPanelPrincipal);

    }
}

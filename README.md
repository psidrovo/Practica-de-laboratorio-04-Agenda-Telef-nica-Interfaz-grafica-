# Practica-de-laboratorio-04-Agenda-Telef-nica-Interfaz-grafica-

PRÁCTICA DE LABORATORIO 4.

CARRERA: COMPUTACION.

ASIGNATURA: PROGRAMACION ORIENTADA A OBJETOS.

# TÍTULO PRÁCTICA: Desarrollo de una aplicación informática utilizando ventanas, contenedores y componentes gráficos de Java basados en prototipos.

# OBJETIVO ALCANZADO:
  •	Crear una ventana con referencia a la practica anterior usando las técnicas de modelado de objetos.
# ACTIVIDADES DESARROLLADAS
  1. Diseñar un prototipo de la aplicación Agenda Telefónica.
  2. Crear un repositorio en GitHub con el nombre “Práctica de laboratorio 04: Agenda Telefónica (Interfaz gráfica)”
  3. Desarrollar una Interfaz Gráfica de Usuario en Java para gestionar una agenda telefónica según los
  requerimientos planteados en las instrucciones de la práctica.
  4. Implementar el README del repositorio del proyecto con la misma información del informe de la práctica (incluidas las imágenes y     versiones de las herramientas)

# RESULTADO(S) OBTENIDO(S):
  a)	Resultados Actividad 1 
  
      Link Imagen: https://drive.google.com/file/d/1vgYBh4mrkySqnFYXqZrgPFjhTHQ2E4rN/view?usp=sharing

  b)	Resultados Actividad 2

      Link Repositorio GitHub:
      https://github.com/psidrovo/Practica-de-laboratorio-04-Agenda-Telef-nica-Interfaz-grafica-.git

  c)	Resultados Actividad 3 y 4

  - Clases
  
   -> Test2


package ec.edu.ups.test;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

    /**
     * Clase Principal. 
     * 
     * Esta clase ejcutara nuestra ventana con sus botones y paneles.
     *  
     * @author Paul Idrovo
     */
    public class Test2 {

        public static void main(String[] args) {    

            //CREA VENTANA
            Frame miVentana = new Frame();
            miVentana.setSize(600,400);
            miVentana.setTitle("MENU USUARIO");
            miVentana.setLocation(0, 0);
            miVentana.setVisible(true);
            miVentana.setLocationRelativeTo(null);

            //CREAMOS UN GRID
            GridLayout Matriz = new GridLayout(5, 1);
            FlowLayout OpcionesMenu = new FlowLayout();
            BorderLayout latout = new BorderLayout();

            Panel miPanelPrincipal = new Panel(latout);

            //EL PANEL CENTRAL TENDRA NUESTRO GRID PARA LOS BOTONES
            Panel panelCentral = new Panel(Matriz);

            //PANELES VACIOS CON COLOR NEGRO PARA EL MARCO
            Panel panelVacio = new Panel(OpcionesMenu);
            Panel panelVacio1 = new Panel(OpcionesMenu);
            Panel panelVacio2 = new Panel(OpcionesMenu);
            Panel panelVacio3 = new Panel(OpcionesMenu);

            panelVacio.setBackground(Color.BLACK);
            panelVacio1.setBackground(Color.BLACK);
            panelVacio2.setBackground(Color.BLACK);
            panelVacio3.setBackground(Color.BLACK);

            //BOTONES PARA NUESTRO GRID
            Button bt1 = new Button("Agregar Telefono");
            Button bt2 = new Button("Editar Telefono");
            Button bt3 = new Button("Eliminar Telefono");
            Button bt4 = new Button("Buscar Telefono");
            Button bt5 = new Button("Cerrar Sesion");

            //AGREGAR BOTONES
            panelCentral.add(bt1);
            panelCentral.add(bt2);
            panelCentral.add(bt3);
            panelCentral.add(bt4);
            panelCentral.add(bt5);

            //AGREGAR PANELES
            miPanelPrincipal.add(panelCentral,BorderLayout.CENTER);
            miPanelPrincipal.add(panelVacio,BorderLayout.NORTH);
            miPanelPrincipal.add(panelVacio1,BorderLayout.SOUTH);
            miPanelPrincipal.add(panelVacio2,BorderLayout.WEST);
            miPanelPrincipal.add(panelVacio3,BorderLayout.EAST);

            miVentana.add(miPanelPrincipal);

        }
    }


# CONCLUSIONES:
Esta práctica nos ayuda a entender cómo funciona el IU de Java, de como crear botones paneles, y como interactúan con ellos, es una buena introducción para el inicio del desarrollo de la Interfaz, conocer lo mas básico para ir con bases a lo mas complejo.

# RECOMENDACIONES:
Esta practica no tuvo mayor inconveniente, me pareció muy agradable y fácil de entender con la materia presentada en clases, además de muy buena explicación sobre el Usuario final y como debemos desarrollar nuestras aplicaciones.

Nombre de estudiante: Paul Sebastian Idrovo Berrezueta




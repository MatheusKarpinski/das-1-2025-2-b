package br.univille;

import javax.swing.JButton;
import javax.swing.JFrame;

public class janelinha extends JFrame {

    private JButton botaozinho;
    private Controlador controlador;
    public janelinha() {
        String titulo = "Janelinha";
        setTitle(titulo);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        controlador = new Controlador();

        botaozinho = new JButton(" Me Clica ");
        botaozinho.addActionListener(controlador);
        botaozinho.addMouseMotionListener(controlador);
        add(botaozinho);
        setVisible(true);
    }
    public static void main(String[] args) {
        new janelinha();
    }
    
}
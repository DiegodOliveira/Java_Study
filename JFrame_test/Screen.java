package JFrame_test;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;

public class Screen extends JFrame{
    public Screen(){

        setTitle("Teste");// É usado para dar um título a interface gráfica
        setVisible(true); // Define a interface como visível ao usuário
        setSize(800,500); // Define o tamanho da interface
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Deixa a interface capaz de ser fechada e parar o programa
        setResizable(false);// Impede a interface de ser diminuída
        setLocationRelativeTo(null);// Faz com que a interface apareça no meio da tela

        setLayout(null);

        JButton button = new JButton("Clique aqui");
        //button.setText("Clique aqui"); Coloca um texto no botão
        add(button);
        button.setBounds(100,200,250,70);
        button.setFont(new Font("Helvetica", Font.BOLD, 40));
        button.setForeground(new Color(237, 241, 238));
        button.setBackground(new Color(10,9,10));

        JButton Exit = new JButton("Sair");
        //button.setText("Clique aqui"); Coloca um texto no botão
        add(Exit);
        Exit.setBounds(0,0,250,70);
        Exit.setFont(new Font("Helvetica", Font.ITALIC, 40));
        Exit.setForeground(new Color(237, 241, 238));
        Exit.setBackground(new Color(253, 0, 82));
    }
}

package tictactoe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TicTacToe extends JPanel implements ActionListener {

    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel buttom_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttom = new JButton[9];

    boolean player1_turn;

    public TicTacToe() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.getContentPane().setBackground(null);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textfield.setBackground(Color.black);
        textfield.setForeground(Color.GREEN);
        textfield.setFont(new Font("Ink Free", Font.BOLD, 70));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic tac toe");
        textfield.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 800, 100);

        buttom_panel.setLayout(new GridLayout(3, 3));
        buttom_panel.setBackground(new Color(150, 150, 150));

        for (int i = 0; i < 9; i++) {
            buttom[i] = new JButton();
            buttom_panel.add(buttom[i]);
            buttom[i].setFont(new Font("MV Boil", Font.BOLD, 120));
            buttom[i].setFocusable(false);
            buttom[i].addActionListener(this);
        }

        title_panel.add(textfield);
        frame.add(title_panel, BorderLayout.NORTH);
        frame.add(buttom_panel);

        firstTurn();

    }

    public static void main(String[] args) {
        TicTacToe mainGame = new TicTacToe();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

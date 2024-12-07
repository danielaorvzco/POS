 /**
 * Programación Orientada a Objetos
 * Actividad 00: Interfaz Grafica
 * Alumno: Daniela Orozco Ledesma
 * Fecha: 21/11/2024
 **/

package mx.udg.cucea.danielapoo.danielapoo.interfazGrafica;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora extends JFrame implements ActionListener{
    //Inicializar variables
    private JLabel labelNum1, labelNum2, labelOperacion, signo, labelResultado;
    private JTextField textBox1, textBox2;
    private JButton btnSumar, btnRestar, btnMul, btnDiv;
    
    public Calculadora(){    
        //JFrame
        setTitle("Calculadora");
        setMinimumSize(new Dimension(240, 250));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //JPanel
        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        getContentPane().add(panel1);
        
        //Linea 1 == TEXTO1
        labelNum1 = new JLabel("Numero 1");
        labelNum1.setBounds(10, 10, 100, 30);
        panel1.add(labelNum1);
        
        textBox1 = new JTextField();
        textBox1.setBounds(75, 10, 50, 30);
        textBox1.setHorizontalAlignment(SwingConstants.RIGHT);
        panel1.add(textBox1);
        
        //Linea2 == SIGNO "+"
        labelOperacion = new JLabel("");
        labelOperacion.setBounds(95, 30, 100, 30);
        labelOperacion.setForeground(Color.orange);
        panel1.add(labelOperacion);
        
        
        //Linea 3 == TEXTO2
        labelNum2 = new JLabel("Numero 2");
        labelNum2.setBounds(10, 50, 100, 30);
        panel1.add(labelNum2);
        
        textBox2 = new JTextField();
        textBox2.setBounds(75, 50, 50, 30);
        textBox2.setHorizontalAlignment(SwingConstants.RIGHT);
        panel1.add(textBox2);
        
        //Linea 4 == SIGNO "="
        signo = new JLabel("=");
        signo.setBounds(130, 30, 10, 30);
        panel1.add(signo);
        
        //Linea 5 == RESULTADO
        Font myFont = new Font("Helvetica", Font.PLAIN, 20);
        labelResultado = new JLabel("");
        labelResultado.setFont(myFont);
        labelResultado.setBounds(150, 10, 80, 70);
        labelResultado.setHorizontalAlignment(SwingConstants.CENTER);
        labelResultado.setForeground(Color.white);
        labelResultado.setOpaque(true);
        labelResultado.setBackground(Color.black);
        panel1.add(labelResultado);
        
        //Botones
        btnSumar = new JButton("+");
        btnSumar.setBounds(40, 90, 41, 41);
        btnSumar.addActionListener(this);
        panel1.add(btnSumar);
        
        btnRestar = new JButton("-");
        btnRestar.setBounds(80, 90, 41, 41);
        btnRestar.addActionListener(this);
        panel1.add(btnRestar);
        
        btnMul = new JButton("x");
        btnMul.setBounds(120, 90, 41, 41);
        btnMul.addActionListener(this);
        panel1.add(btnMul);
        
        btnDiv = new JButton("÷");
        btnDiv.setBounds(160, 90, 41, 41);
        btnDiv.addActionListener(this);
        panel1.add(btnDiv);
    }
    
    public static void main(String[] args){
        Calculadora ventana01 = new Calculadora();
        ventana01.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Obtener valores obtenidos por TEXTBOX
        double num1 = Double.parseDouble(textBox1.getText());
        double num2 = Double.parseDouble(textBox2.getText());
        double resultado = 0;
        String operacion = "";
        
        JButton source = (JButton) e.getSource();
        //JOptionPane.showMessageDialog(null,"Valor que capturo: " +  source.getText());
        
        switch(source.getText()){
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "x":
                resultado = num1 * num2;
                break;
            case "÷":
                resultado = num1 / num2;
                break;
        }
        
        //Asignar resultado
        labelOperacion.setText(source.getText());
        labelResultado.setText(String.valueOf(resultado));
    }
}

import javax.swing.*;
import java.awt.event.*;

public class FormsTextField extends JFrame implements ActionListener {
	private JButton boton1, boton2;
	private JLabel label1;
	private JTextField textField1;

	public FormsTextField() {
		setLayout(null);

		label1 = new JLabel("Usuario1:::");
		label1.setBounds(10,10,100,30);
		add(label1);

		boton1 = new JButton("Aceptar");
		boton1.setBounds(100,80,100,30);
		add(boton1);
		boton1.addActionListener(this);

		boton2 = new JButton("Salir");
		boton2.setBounds(10,80,100,30);
		add(boton2);
		boton2.addActionListener(this);

		textField1 = new JTextField();
		textField1.setBounds(100,10,100,30);
		add(textField1);
	}

	public void actionPerformed(ActionEvent e){
		if( e.getSource()==boton1 ){
			String texto = textField1.getText();
			setTitle(texto);
		}

		if( e.getSource()==boton2 ) {
			System.exit(0);
		}
	}

	public static void main(String args[]){
		FormsTextField formulario1 = new FormsTextField();
		formulario1.setBounds(0,0,420,200);
		formulario1.setVisible(true);
		formulario1.setResizable(false);
		formulario1.setLocationRelativeTo(null);
	}
}
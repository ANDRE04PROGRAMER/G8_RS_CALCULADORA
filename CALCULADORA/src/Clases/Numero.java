package Clases;

import javax.swing.JOptionPane;

public class Numero {
	double numero1,numero2;

	public Numero(double numero1, double numero2) {
		
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}
	
	public double sumar() {
		return numero1 +numero2;
	}

	public double resta() {
		return numero1 - numero2;
	}
	
	public double multiplicacion () {
		return numero1 *numero2;
	}
	public double division() {
	    if (numero2 == 0) {
	        JOptionPane.showMessageDialog(null, "No se puede dividir entre 0");
	        return 0;
	    }
	    return (double) numero1 / numero2;
	}
}


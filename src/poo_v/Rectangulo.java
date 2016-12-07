package poo_v;

import javax.swing.JOptionPane;

public class Rectangulo {

    private int largo, ancho;

    public Rectangulo() {
        int largo;
        String texto1 = JOptionPane.showInputDialog("Escriba el largo");
        largo = Integer.parseInt(texto1);
        int ancho;
        String texto2 = JOptionPane.showInputDialog("Escriba el ancho");
        ancho = Integer.parseInt(texto2);
        this.largo = largo;
        this.ancho = ancho;
    }
    
    public boolean esAlargado(){
        boolean flag=false;
        if(this.largo>=(this.ancho*2)){
            flag=true;
        }
        return flag;
    }
     public void dibuja() {

        for (int aux2 = this.ancho; aux2 > 0; aux2--) {
            for (int aux = this.largo; aux > 0; aux--) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    

}

package poo_v;

public class POO_V {

    public static void main(String[] args) {
//        int aux = 10;
//        Hipoteca hipoteca1 = new Hipoteca(6000, 3.5, aux);
//        System.out.print("CAPITAL: " + hipoteca1.getCapital() + "\tREDITO: " + hipoteca1.getRedito() + "%\n");
//
//        System.out.println("Tiempo\tCuota");
//        for (; aux <= 20; aux++) {
//            hipoteca1.setTiempo(aux);
//            System.out.print(hipoteca1.getTiempo() + "\t" + hipoteca1.couta() + "\n");
//        }
        
//        Usuario miusu= new Usuario("Juan", "Fernadez", "942845787");
//        System.out.println(miusu.esDeCantabria());
//        String email=miusu.generaMail();
//        System.out.println(email);
//        System.out.println(miusu.contieneLetra("z"));
//        Rectangulo mirec = new Rectangulo();
//        mirec.dibuja();
//        System.out.println(mirec.esAlargado());
       
        Reloj mirej= new Reloj(23, 59, 25);
        mirej.horamas();
        System.out.println(mirej);
        mirej.horamenos();
        System.out.println(mirej);
        System.out.println(mirej.mostrar12());
        
    }
    
    

}

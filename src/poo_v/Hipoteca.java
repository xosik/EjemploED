package poo_v;

public class Hipoteca {
    
    private int capital;
    private double redito;
    private int tiempo;

    public Hipoteca(int capital, double redito, int tiempo) {
        this.capital = capital;
        this.redito = redito;
        this.tiempo = tiempo;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public double getRedito() {
        return redito;
    }

    public void setRedito(double redito) {
        this.redito = redito;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }
   
   public double couta(){
       return (capital*redito*tiempo)/100;
   }

    @Override
    public String toString() {
        return "Hipoteca{" + "capital=" + capital + ", redito=" + redito + ", tiempo=" + tiempo + '}';
    }
    
    
    
}

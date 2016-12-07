/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_v;

/**
 *
 * @author DAW101
 */
public class Reloj {
     private int hora, minutos, segundos;

    public Reloj() {
    }

    public Reloj(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public boolean horavalida() {
        boolean flag = false;
        if (this.hora < 24 && this.hora >= 0 && this.minutos < 60 && this.minutos >= 0 && this.segundos < 60 && this.segundos >= 0) {
            flag = true;
        }
        return flag;
    }

    public void horamas() {
        if (this.segundos + 1 == 60) {
            if (this.minutos + 1 == 60) {
                if (this.hora + 1 == 24) {
                    this.hora = 0;
                    this.segundos = 0;
                    this.minutos = 0;
                } else {
                    this.hora += 1;
                    this.segundos = 0;
                    this.minutos = 0;
                }
            } else {
                this.minutos += 1;
                this.segundos = 0;
            }

        } else {
            this.segundos += 1;
        }
    }

    public void horamenos() {
        if (this.segundos - 1 < 0) {
            if (this.minutos - 1 < 0) {
                if (this.hora - 1 < 0) {
                    this.hora = 23;
                    this.segundos = 59;
                    this.minutos = 59;
                } else {
                    this.hora -= 1;
                    this.segundos = 59;
                    this.minutos = 59;
                }
            } else {
                this.minutos -= 1;
                this.segundos = 59;
            }

        } else {
            this.segundos -= 1;
        }
    }

    public String toString() {
        return "Reloj{" + "hora=" + hora + ", minutos=" + minutos + ", segundos=" + segundos + '}';
    }

    public String mostrar12() {
        int aux=this.hora;
        if(this.hora>12){
           aux=this.hora-12;
        }
        return "Reloj{"+ aux + ":" + minutos + ":" + segundos + "}";
    }
}

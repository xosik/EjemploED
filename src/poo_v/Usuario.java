package poo_v;

public class Usuario {

    private String Nombre, Apellido, Telefono;

    public Usuario(String Nombre, String Apellido, String Telefono) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public boolean esDeCantabria() {
        boolean flag = false;
        //if(this.Telefono.substring(0, 3).compareToIgnoreCase("942")==0){
        if (this.Telefono.startsWith("942")) {
            flag = true;
        }
        return flag;
    }

    public String generaMail() {
        return this.Nombre + "_" + this.Apellido + this.Telefono.substring(this.Telefono.length()) + "@javamail.com";
    }

    public int contieneLetra(String letra) {
    int contador = 0;
        int aux2 = this.Apellido.indexOf(letra, 0);
        if (aux2 != -1) {
            contador = 1;
            for (int aux = 0; this.Apellido.length() > aux; aux++) {
                int aux3 = this.Apellido.indexOf(letra, aux);
                if (aux3 != -1) {
                    if (aux2 != aux3) {
                        contador++;
                        aux2 = aux3;
                    }
                }

            }

        }
        return contador;
    }
}

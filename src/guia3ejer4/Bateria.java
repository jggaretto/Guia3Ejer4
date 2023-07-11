
package guia3ejer4;


class Bateria {

    private int carga;

    public Bateria(int carga) {
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void cargar() {
        setCarga(1000);
    }
    
}

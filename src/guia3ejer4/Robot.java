
package guia3ejer4;


    public class Robot {
    private int energia;
    private Bateria bateria;
    private boolean estaDormido;

    public Robot() {
        energia = 1000;
        bateria = new Bateria(1000);
        estaDormido = false;
    }
 public void dormir() {
        estaDormido = true;
        System.out.println("El robot está dormido");

       /*if (estaDormido) {
            System.out.println("El robot ya está dormido");
            return;
        }
        estaDormido = true;
        System.out.println("El robot está dormido");
       */
    }
    public void avanzar(int cantidad) {
        if (estaDormido) {
            System.out.println("El robot está dormido, no puede avanzar");
        }else if (energia >= cantidad / 100 * 10) {
            energia -= cantidad / 100 * 10;
            System.out.println("Avanzando " + cantidad + " pasos");
        }else{
            System.out.println("La batería está baja, recargue para avanzar");
        }
    }

    public void retroceder(int cantidad) {
        if (estaDormido) {
            System.out.println("El robot está dormido, no puede retroceder");
        }else if (energia >= cantidad / 100 * 10) {
            energia -= cantidad / 100 * 10;
            System.out.println("Retrocediendo " + cantidad + " pasos");
        } else {
            System.out.println("La batería está baja, recargue para retroceder");
        }
        
    }

     public void despertar() {
        estaDormido = false;
        System.out.println("El robot está despierto");
    
     /*if (!estaDormido) {
            System.out.println("El robot ya está despierto");
            return;
        }
        estaDormido = false;
   
       System.out.println("El robot está despierto");
        */
    }

    public void recargar() {
       /* bateria.cargar();
        energia = bateria.getCarga();
        System.out.println("Batería recargada");
    */
       if (estaDormido) {
            System.out.println("El robot está dormido, no se puede recargar");
            return;
        }
        bateria.cargar();
        energia = bateria.getCarga();
        System.out.println("Batería recargada");
    }

    public boolean bateriaLLena() {
        return bateria.getCarga() == 1000;
    }

    public boolean bateriaVacia() {
        return bateria.getCarga() == 0;
    }

    public int energiaActual() {
        return energia;
    }
}

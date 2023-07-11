

package guia3ejer4;

import java.util.Scanner;

public class Hombre {
    /*public void jugarConRobot(Robot robot) {
        Scanner leer = new Scanner(System.in);
        int pasos;
        do {
            System.out.println("Ingrese la cantidad de pasos a avanzar o retroceder (0 para terminar): ");
            pasos = leer.nextInt();
            if (pasos > 0) {
                robot.avanzar(pasos);
            } else if (pasos < 0) {
                robot.retroceder(-pasos);
            }
        } while (pasos != 0);
        robot.dormir();
        System.out.println("Energía actual del robot: " + robot.energiaActual());
    }
*/
    public void jugarConRobot(Robot robot) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Ingrese una opción (1 para avanzar, 2 para retroceder, 3 para dormir, 4 para despertar, 5 para recargar, 0 para terminar): ");
            opcion = leer.nextInt();
            if(opcion > 5 || opcion < 0){
                System.out.println("La opcion ingresada no es valida");
            }else{
            switch(opcion) {
                case 1:
                    int pasosAvanzar;
                    System.out.println("Ingrese la cantidad de pasos a avanzar: ");
                    pasosAvanzar = leer.nextInt();
                    robot.avanzar(pasosAvanzar);
                    break;
                case 2:
                    int pasosRetroceder;
                    System.out.println("Ingrese la cantidad de pasos a retroceder: ");
                    pasosRetroceder = leer.nextInt();
                    robot.retroceder(pasosRetroceder);
                    break;
                case 3:
                    robot.dormir();
                    System.out.println("Energía actual del robot: " + robot.energiaActual());
                    break;
                case 4:
                    robot.despertar();
                    break;
                case 5:
                    robot.recargar();
                    break;
            } 
            }
        } while(opcion != 0);
            System.out.println("Energía actual del robot: " + robot.energiaActual());
            System.out.println("El robot ahora va a jugar con el segundo hombre");
  }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int viajeros=0, opt;
        float v1=0,v2=0,v3=0,v4=0,v5=0, viaje=0, aporte, media=0, restante=0;
        boolean uno=false, dos=false, fin = false;

        do {
            System.out.println("\n1.- Introducir aporte de los viajeros");
            System.out.println("2.- Calcular reparto de gastos");
            System.out.println("3.- Mostrar el reparto entre los viajeros");
            System.out.println("4.- Salir");
            opt = Integer.parseInt(s.nextLine());

            switch (opt) {
                case 1:
                    for (int i=1; i<=5; i++ ) {
                        System.out.println("Cuánto ha aportado el viajero " + i);
                        aporte = Float.parseFloat(s.nextLine());
                        if (aporte>-1) {
                            switch (i) {
                                case 1:
                                    v1=aporte;
                                    break;
                                case 2:
                                    v2=aporte;
                                    break;
                                case 3:
                                    v3=aporte;
                                    break;
                                case 4:
                                    v4=aporte;
                                    break;
                                case 5:
                                    v5=aporte;
                                    break;
                            }
                            viajeros++;
                            viaje += aporte;
                        } else {
                            switch (i) {
                                case 1:
                                    v1=-1;
                                    break;
                                case 2:
                                    v2=-1;
                                    break;
                                case 3:
                                    v3=-1;
                                    break;
                                case 4:
                                    v4=-1;
                                    break;
                                case 5:
                                    v5=-1;
                                    break;
                            }
                        }
                    }

                    System.out.println("El viaje vale " + viaje + "€");
                    System.out.println("Hay " + viajeros + " Viajeros");
                    uno= true;
                    break;

                case 2:
                    if (!uno) break;
                    media = viaje/viajeros;
                    System.out.printf("Cada uno de los viajeros debería aportar %.2f€\n",media);
                    dos = true;
                    break;

                case 3:
                    if (uno && dos) {
                        if (v1>-1) {
                            restante = v1-media;
                            if (restante>=0) System.out.println("El viajero 1 que aportó " + v1 + "€ se le devolverán " + restante + "€");
                            if (restante<0) System.out.println("El viajero 1 que aportó " + v1 + "€ tendrá que aportar " + -restante + "€");
                        }

                        if (v2>-1) {
                            restante = v2-media;
                            if (restante>=0) System.out.println("El viajero 2 que aportó " + v2 + "€ se le devolverán " + restante + "€");
                            if (restante<0) System.out.println("El viajero 2 que aportó " + v2 + "€ tendrá que aportar " + -restante + "€");
                        }

                        if (v3>-1) {
                            restante = v3-media;
                            if (restante>=0) System.out.println("El viajero 3 que aportó " + v3 + "€ se le devolverán " + restante + "€");
                            if (restante<0) System.out.println("El viajero 3 que aportó " + v3 + "€ tendrá que aportar " + -restante + "€");
                        }

                        if (v4>-1) {
                            restante = v4-media;
                            if (restante>=0) System.out.println("El viajero 4 que aportó " + v4 + "€ se le devolverán " + restante + "€");
                            if (restante<0) System.out.println("El viajero 4 que aportó " + v4 + "€ tendrá que aportar " + -restante + "€");
                        }
                        if (v5>-1) {
                            restante = v5-media;
                            if (restante>=0) System.out.println("El viajero 5 que aportó " + v5 + "€ se le devolverán " + restante + "€");
                            if (restante<0) System.out.println("El viajero 5 que aportó " + v5 + "€ tendrá que aportar " + -restante + "€");
                        }
                        break;
                    } else {
                        break;
                    }

                case 4:
                    fin = true;
                    break;

            }
        } while (!fin);

        System.out.println("Has apagado el sistema");
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int viajeros=0, opt;
        float v1=0,v2=0,v3=0,v4=0,v5=0, viaje=0, aporte, media=0, restante;
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
                                case 1 -> v1 = aporte;
                                case 2 -> v2 = aporte;
                                case 3 -> v3 = aporte;
                                case 4 -> v4 = aporte;
                                case 5 -> v5 = aporte;
                            }
                            viajeros++;
                            viaje += aporte;
                        } else
                            switch (i) {
                            case 1 -> v1 = -1;
                            case 2 -> v2 = -1;
                            case 3 -> v3 = -1;
                            case 4 -> v4 = -1;
                            case 5 -> v5 = -1;
                        }
                    }

                    System.out.println("El viaje vale " + viaje + "€");
                    System.out.println("Hay " + viajeros + " Viajeros");
                    uno= true;
                    break;

                case 2:
                    if (!uno) {
                        System.out.println("Tienes que completar el apartado 1 y 2 para poder acceder a este primero");
                        break;
                    }
                    media = viaje/viajeros;
                    System.out.printf("Cada uno de los viajeros debería aportar %.2f€\n",media);
                    dos = true;
                    break;

                case 3:
                    if (uno && dos) {
                        if (v1>-1) {
                            restante = v1-media;
                            if (restante>=0) System.out.printf("El viajero 1 que aportó  %.2f€ se le devolverán %.2f€\n", v1, restante);
                            if (restante<0) System.out.printf("El viajero 1 que aportó %.2f€ tendrá que aportar %.2f€\n", v1, -restante);
                        }

                        if (v2>-1) {
                            restante = v2-media;
                            if (restante>=0) System.out.printf("El viajero 2 que aportó %.2f€ tendrá que aportar %.2f€\n", v2, restante);
                            if (restante<0) System.out.printf("El viajero 2 que aportó %.2f€ tendrá que aportar %.2f€\n", v2, -restante);
                        }

                        if (v3>-1) {
                            restante = v3-media;
                            if (restante>=0) System.out.printf("El viajero 3 que aportó %.2f€ tendrá que aportar %.2f€\n", v3, restante);
                            if (restante<0) System.out.printf("El viajero 3 que aportó %.2f€ tendrá que aportar %.2f€\n", v3, -restante);
                        }

                        if (v4>-1) {
                            restante = v4-media;
                            if (restante>=0) System.out.printf("El viajero 4 que aportó %.2f€ tendrá que aportar %.2f€\n", v4, restante);
                            if (restante<0) System.out.printf("El viajero 4 que aportó %.2f€ tendrá que aportar %.2f€\n", v4, -restante);
                        }
                        if (v5>-1) {
                            restante = v5-media;
                            if (restante>=0) System.out.printf("El viajero 5 que aportó %.2f€ tendrá que aportar %.2f€\n", v5, restante);
                            if (restante<0) System.out.printf("El viajero 5 que aportó %.2f€ tendrá que aportar %.2f€\n", v5, -restante);
                        }
                        break;
                    } else {
                        System.out.println("Tienes que completar el apartado 1 y 2 para poder acceder a este primero");
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
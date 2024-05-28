import java.util.ArrayList;
import java.util.Scanner;

public class Repaso {

    private static String nombre;
    private static String apellidos;
    private static String dni;
    private static void rellenarNombre() {
        Scanner readerN = new Scanner(System.in);
        System.out.println("Por favor escriba el nombre");
        nombre = readerN.nextLine();
    }

    private static void rellenarApellidos() {
        Scanner readerN = new Scanner(System.in);
        System.out.println("Por favor escriba los apellidos");
        apellidos = readerN.nextLine();
    }

    private static void rellenarDni() {
        Scanner readerN = new Scanner(System.in);
        System.out.println("Por favor escriba los apellidos");
        dni = readerN.next();

        if(dni.length()!=9){
            System.out.println("El DNI no es válido");
        } else if (!Character.isLetter(dni.charAt(dni.length()-1))){
            System.out.println("El DNI no es válido");
        }
    }


    public static void main (String[] args){

        boolean valido = true;
        int suma2 = 30;
        int opcion = 0;


        //IF
        if (valido){
            System.out.println("Es verdadero");
        }
        else {
            System.out.println("Es falso");
        }

        if (!valido){
            System.out.println("Es falso");
        }
        else {
            System.out.println("Es verdadero");
        }

        //WHILE
        while (suma2 < 20){
            suma2 += 2;
            //suma2 = suma2 +2;
        }
        System.out.println(suma2); //30

        //DO..WHILE
        do {
            suma2 += 2;
        } while(suma2 < 20);
        System.out.println(suma2); //32

        //SWITCH
            switch (opcion){
            case 1: rellenarNombre();
                    break;
            case 2: rellenarApellidos();
                    break;
            case 3: rellenarDni();
            default: System.out.println("Opcion no valida");
                    break;
        }

        //FOR o FOREACH
        String[] palabras = new String[4]; //0..3

        palabras[0]="hola";
        palabras[1]="mundo";
        palabras[2]="adios";
        palabras[3]="mundo";

        for(int i=0;i<2;i++){
            System.out.println(palabras[i]);
        }

        for (String palabra: palabras) {
            System.out.println(palabra);
        }

        //FOR o FOREACH con ArrayList
        ArrayList<String> palabrasArray = new ArrayList<>(); //0..3

        palabrasArray.add("Hola");
        palabrasArray.add("mundo");
        palabrasArray.add("adiós");
        palabrasArray.add("mundo");
        palabrasArray.add("otra");
        palabrasArray.add("palabra");

        for(int i=0;i<palabrasArray.size();i++){
            System.out.println(palabrasArray.get(i));
        }

        for (String palabra: palabrasArray) {
            System.out.println(palabra);
        }

        //FOR o FOREACH con ArrayList Coche
        ArrayList<Coche> cochesArray = new ArrayList<>(); //0..3

        Coche coche1 = new Coche("Renault","Clio");
        cochesArray.add(coche1);
        Coche coche2 = new Coche("Fiat","500");
        cochesArray.add(coche2);
        Coche coche3 = new Coche("Citroen","saxo");
        cochesArray.add(coche3);

        for(int i=0;i<cochesArray.size();i++){
           // Coche auxcoche = cochesArray.get(i);
           // auxcoche.toString();
            System.out.println(cochesArray.get(i).toString());
        }

        for (Coche cocheaux: cochesArray) {
            System.out.println(cocheaux.toString());
        }



    }


}

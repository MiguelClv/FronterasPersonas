package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 54167208T on 21/02/2017.
 */
public class Control {

    public static void runControl(){
        List<Persona> Lista = new ArrayList<>();
        int option;

        Scanner scanner = new Scanner(System.in);

        String menu=("CONTROL DE FRONTERA:" +
                "\n1.- Paso de frontera" +
                "\n2.- Mostrar todas las personas" +
                "\n3.- Busqueda por nombre" +
                "\n4.- Busqueda por DNI" +
                "\n5.- Salir");

        System.out.println(menu);

        do{
        option = scanner.nextInt();
        switch(option) {
            case 1:
                scanner.nextLine();
                System.out.println("***Agregar persona*** \nNombre: ");
                String nom = scanner.nextLine();
                String dni;
                while ( true){
                    System.out.println("DNI: ");
                    dni = scanner.nextLine();
                    boolean resultado = Persona.checkDni(dni);
                    if (resultado){
                        break;
                    }else {
                        System.out.println("DNI invalido");
                    }
                }
                Lista.add(new Persona(nom, dni));
                System.out.println(menu);
                break;

            case 2:
                System.out.println(Lista.toString());
                break;

            case 3:
                scanner.nextLine();
                System.out.println("Nombre para buscar");
                String busqnom = scanner.nextLine();
                for(Persona nombre : Lista){
                    if (nombre.getNombre().equals(busqnom)){
                        System.out.println(nombre);
                    }
                } break;

            case 4:
                scanner.nextLine();
                System.out.println("DNI para buscar");
                String busqdni = scanner.nextLine();
                for(Persona personaActual : Lista){
                    if (personaActual.getDNI().equals(busqdni)){
                        System.out.println(personaActual);
                    }
                }
                break;
            case 5:
                System.out.println("See you!");
                break;

            default:
                System.out.println("****Opcion incorrecta! ****\nIngrese una opcion");
                option=scanner.nextInt();
        }
        }while (option!=5);
    }
}

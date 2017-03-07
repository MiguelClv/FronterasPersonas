package com.company;

/**
 * Created by 54167208T on 21/02/2017.
 */
public class Persona {
    private String nombre;
    private String DNI;

    Persona(String nombre, String DNI){
        this.nombre=nombre;
        this.DNI=DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public static boolean checkDni(String DNI){
        try {

            if (DNI.length() != 9) {
                System.out.println("El DNI no tiene nueve carácteres.");
                return false;
            }

            char lletra = DNI.charAt(8);
            if (!Character.isLetter(lletra)) {
                System.out.println("El último carácter del DNI no es una letra.");
                return false;
            }

            String numsStr = DNI.substring(0, 8);
            int nums = Integer.parseInt(numsStr);
            System.out.println("El DNI es correcto.");
            return true;
        } catch (NumberFormatException nfe){
            System.out.println("Los 8 primeros carácteres del DNI no representan un número. ");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", DNI='" + DNI + '\'' +
                '}';
    }
}

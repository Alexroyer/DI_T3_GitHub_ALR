/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alejandro
 */
public class EJ4_T3_Introspeccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        Persona antonio = new Persona("Antonio");
        System.out.println(antonio.getNombre());
        Empleado ana = new Empleado("Ana", 35000);
        System.out.println(ana.getNombre());
        System.out.println(ana.getSalario()); 
        //System.out.println(antonio.getClass());
        /*Class cl1 =antonio.getClass(); 
        System.out.println(cl1.getName());*/ 
        String nombreClase = "Persona";
        Class cl1;
        try {
            cl1 = Class.forName(nombreClase);
            System.out.println(cl1.getName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EJ4_T3_Introspeccion.class.getName()).log(Level.SEVERE, null, ex);
        }
        nombreClase = "Empleado";
        try {
            cl1 = Class.forName(nombreClase);
            System.out.println(cl1.getName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EJ4_T3_Introspeccion.class.getName()).log(Level.SEVERE, null, ex);
        }
        

        System.out.print("\nUSO DEL METODO GET CONSTRUCTORS (). \nIntroduce el nombre de la clase");
        Constructor arrayConstructores[] ;
        Scanner scanner = new Scanner(System.in);
        Class claseEjemplo;
        claseEjemplo = Class.forName("Persona");
        arrayConstructores = claseEjemplo.getDeclaredConstructors();
        
        for(int i = 0; i < arrayConstructores.length ; i++){
            
            System.out.println("\n"+ arrayConstructores[i]);
        }
       
        System.out.print("\n\nUSO DEL METODO GET FIELDS");        
        
        Field arrayFields[] = claseEjemplo.getDeclaredFields();
        for(int i = 0; i < arrayFields.length ; i++){
            System.out.println("\n"+ arrayFields[i]);
        }
        
    }
}
    
    class Persona {

        private String nombre;

        public Persona(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return nombre;
        }
    }

    class Empleado extends Persona {

        private double salario;

        public Empleado(String nombre, double salario) {
            super(nombre);
            this.salario = salario;
        }

        public void setIncentivo(double incentivo) {
            salario = salario + incentivo;
        }

        public String getSalario() {
            return "El salario es: " + salario;
        }
    }    
      


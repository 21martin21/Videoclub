/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mafs
 */
public class Navegacion {
    
    Scanner teclado = new Scanner(System.in);
    private static Cliente Cseleccionada;
    private static Pelicula Pseleccionada;
    
    public boolean mainMenuPeliculas(){
        String[] opciones = {"Crear pelicula", "Listar peliculas", "Seleccionar pelicula", "Buscar pelicula", "Salir"};
        int opcion = this.presentar(opciones);
        
        if (opcion == 0){
            //tiene que 
            
            System.out.println("Introduzca titulo de la pelicula: ");
            String titulo = teclado.nextLine();
            System.out.println("Introduzca genero de la pelicula: ");
            String genero = teclado.nextLine();
            System.out.println("Introduzca año de la pelicula: ");
            String año = teclado.nextLine();
            Pelicula nueva = Acciones.createpelicula(titulo, genero, año);
                   
        }
        
        if (opcion == 1){
            //tiene que 
            System.out.println(Acciones.getAllpeliculas());
        }
        
        if (opcion == 2){
            System.out.println("Introduzca la pelicula a buscar: ");
            String pelicula = teclado.next();
            
            System.out.println("Seleccione una pelicula: ");
            ArrayList<Pelicula> peliculas = Acciones.searchpelicula(pelicula);
            String[] peliculaStr = new String[peliculas.size()];
            int pos = 0;
            for(Pelicula peliculaActual : peliculas){
                peliculaStr[pos++] = peliculaActual.getTitulo() + " --> "+peliculaActual.getTitulo();
            }
            
            Pseleccionada = peliculas.get(this.presentar(peliculaStr));
            
            //do{
                
           // }while(this.subMenu());
            
        }
        
        if (opcion == 3){
            System.out.println("Introduzca la pelicula a buscar: ");
            String pelicula = teclado.next();
            Acciones.searchpelicula(pelicula);
            System.out.println(Acciones.searchcliente(pelicula));
        }
        
        return opcion != opciones.length-1;
    }
    
    
    
    
    private int presentar(String[] opciones){
        System.out.println("Elija una opción");
        int seleccionado;
        for (int i=0;i < opciones.length;i++)
            System.out.println(i+1+". "+opciones[i]);
        
        
        /*esperar numero*/
        do{
           seleccionado = teclado.nextInt();
               
        }while(1 > seleccionado  || opciones.length < seleccionado);
        
        return seleccionado-1;
    }
    
    
}

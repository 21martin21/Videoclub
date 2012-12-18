/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;

import java.util.ArrayList;

/**
 *
 * @author Mafs
 */
public class Acciones {
    
    private static ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    
    static public Pelicula createpelicula(String titulo, String genero, String año){
        Pelicula nueva = new Pelicula();
        nueva.setTitulo(titulo);
        nueva.setGenero(genero);
        nueva.setAño(año);
        peliculas.add(nueva);     
        return nueva;
    }
    static public Cliente createcliente(String dni, String nombre){
        Cliente nueva = new Cliente();
        nueva.setDni(dni);
        nueva.setNombre(nombre);
        clientes.add(nueva);   
        return nueva;
    }
    
    
    static public ArrayList<Pelicula> searchpelicula (String termino){
        ArrayList<Pelicula> result = new ArrayList<Pelicula>();
        
        for(Pelicula peliculaActual : peliculas){
            if (peliculaActual.getId().toLowerCase().contains(termino.toLowerCase())){
                result.add(peliculaActual);
                continue;
            }
            
            if(peliculaActual.getTitulo().toLowerCase().contains(termino.toLowerCase())){
                result.add(peliculaActual);
            }
                    
        }
        
        return result;
        
    }
    
    static public ArrayList<Cliente> searchcliente (String termino){
        ArrayList<Cliente> result = new ArrayList<Cliente>();
        
        for(Cliente clienteActual : clientes){
            if (clienteActual.getDni().toLowerCase().contains(termino.toLowerCase())){
                result.add(clienteActual);
                continue;
            }
            
            if(clienteActual.getNombre().toLowerCase().contains(termino.toLowerCase())){
                result.add(clienteActual);
            }
                    
        }
        
        return result;
        
    }
    
    static public boolean borrarpelicula(Pelicula actual){
        return peliculas.remove(actual);
    }
    
    static public boolean borrarcliente(Cliente actual){
        return clientes.remove(actual);
    }
    
    static public ArrayList<Pelicula> getAllpeliculas(){
        return peliculas;
    }
    
    static public ArrayList<Cliente> getAllclientes(){
        return clientes;
    }
    
    
}

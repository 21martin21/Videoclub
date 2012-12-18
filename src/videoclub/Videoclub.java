/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package videoclub;
import java.util.*;
/**
 *
 * @author Mafs
 */
public class Videoclub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Navegacion nav = new Navegacion();
        do{
            
        }while(nav.mainMenuPeliculas());
        
        System.out.println(Acciones.getAllclientes());
        System.out.println(Acciones.getAllpeliculas());
    }
}

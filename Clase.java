import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Collections;
/**
 * Write a description of class clase here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clase
{
    // instance variables - replace the example below with your own
    private ArrayList<String> listaAlumnos;
    private DecimalFormat formateador;// formateador.format(numPareja);
    private int id;
    private ArrayList<String> parejas;

    /**
     * Constructor for objects of class clase
     */
    public Clase()
    {
        formateador = new DecimalFormat("0000");
        listaAlumnos = new ArrayList<>();
        parejas = new ArrayList<>();
        listaAlumnos.add("Adeva Tranche, Adrián");
        listaAlumnos.add("Aller González, Francisco Javier");
        listaAlumnos.add("Álvarez Prieto, Noelia");
        listaAlumnos.add("Barrionuevo Pérez, Manuel");
        listaAlumnos.add("Bóveda del Río, José Antonio");
        listaAlumnos.add("de la Viuda Crespo, Ignacio");
        listaAlumnos.add("Encina Maestro, David");
        listaAlumnos.add("Felix Nañez, Kevin");
        listaAlumnos.add("Fernández Diez, Daniel");
        listaAlumnos.add("Fernández González, Javier");
        listaAlumnos.add("Fernández Rincón, Jesús");
        listaAlumnos.add("Fuentes Álvarez, Francisco José");
        listaAlumnos.add("García Juárez, David");
        listaAlumnos.add("García Serrano, Rubén");
        listaAlumnos.add("González Álvarez, David");
        listaAlumnos.add("López Beltrán, Víctor");
        listaAlumnos.add("Lora García, Sandra");
        listaAlumnos.add("Melcón Diez, Víctor");
        listaAlumnos.add("Menéndez Pouso, Francisco José");
        listaAlumnos.add("Pérez Bayón, Álvaro");
        listaAlumnos.add("Pradera San José, Daniel");
        listaAlumnos.add("Prieto Mediavilla, Gabriel");
        listaAlumnos.add("Robles González, Miguel Ángel");
        listaAlumnos.add("Sánchez Manzano, Adán");
        listaAlumnos.add("Serrano García, Verónica");
        listaAlumnos.add("Tascón González, Anibal");
        
    }

    /**
     * metodo para desordenar lista
     */
    public void desordenar(){
        Collections.shuffle(listaAlumnos);
    }

    /**
     * imprime por pantalla lista
     */
    public void impr()
    {
        System.out.println(listaAlumnos);
    }
    /**
     * empareja a los alumnos por dos o tres si el grupo es impar
     */
    public void emparejar()
    {
        desordenar();
        int indiceAlumno = 0;
        int numeroPareja =1;
        
        
        if (listaAlumnos.size() % 2 !=0)
        {
            parejas.add(listaAlumnos.get(indiceAlumno)+listaAlumnos.get(indiceAlumno++)+listaAlumnos.get(indiceAlumno+2));
            System.out.println("Pareja numero "+ formateador.format(numeroPareja)+parejas.get(numeroPareja));
            indiceAlumno =  indiceAlumno +3;
          
        }
        while(indiceAlumno<listaAlumnos.size())
        {
            parejas.add(listaAlumnos.get(indiceAlumno)+listaAlumnos.get(indiceAlumno++));
            System.out.println("Pareja numero "+ formateador.format(numeroPareja)+parejas.get(numeroPareja));
            indiceAlumno = indiceAlumno+2;
        }
       
        
    }

}

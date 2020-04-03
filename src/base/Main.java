package base;

/**
 * @author Daniel Migales Puertas
 */
//Realiza una araña web que a partir de una url obtenga de una pagina web los diferentes enlaces.
//Descargaremos la información que se encuentre en la web, url+texto, y la almacenaremos en una base de datos. 
//Cuando nos encontremos con un url+texto incrementaremos un contador.
//Dada la pagina web anterior, nuestra base de datos resultante será:
//      www.marca.com     Deportes 	+1
//      www.as.com        Deportes	+1
//      www.elpais.es     Noticias 	+2
//Nuestro programa mostrarà de manera ordenada las webs mas entrelazadas.
//si la araña pasa por la web de marca, debe de obviar las inserciones de marca en la base de datos.
//Solo almacenará las url externas a su web
//      www.as.com          Deportes	+1
//      www.elpais.es       Noticias 	+2
//

public class Main {
    
    //Metodo principal
    public static void main(String[] args) throws ClassNotFoundException {
        
        Menu menu = new Menu();
        menu.menuPrincipal();
    }
}

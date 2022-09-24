public class Main {
    public static void main(String[] args) {

        /* Primera parte: guardando la funcion en una variable y dandole valores */
        int resultado = suma(2, 5, 7);

        System.out.println(resultado);// verificando si la funcion suma() se imprime en consola

        /* definiendo un objeto miCoche dentro de la clase Main */
        /* se genera el nuevo objeto mi coche a partir de las propiedades iniciales de la clase Coche */
        Coche miCoche = new Coche();


        /* agregando una puerta nueva aprovechando el uso de la funcion-metodo AgregarPuerta()*/
        miCoche.AgregarPuerta();

        /* imprimiendo en consola para verificar que la funcion-metodo funciono */
        System.out.println(miCoche.puertas);


    }


    /*Primera parte:  definiendo la funcion para sumar 3 parametros */
    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

}


    /*SEGUNDA PARTE*/

    /*Creando la clase coche fuera de la clase Main*/

class Coche {
    public int puertas = 2; //definiendo propiedades, inicializando el coche con un minimo de 2 puertas

    /*definiendo funcion-metodo que agregue nuevas puertas al coche*/
    public void AgregarPuerta() {
        this.puertas++;
    }
}





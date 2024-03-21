public class Main {
    public static void main(String[] args) {
        String str01 = "Agustin";
        String str02 = "Agustin";
        System.out.println(str01 == str02);
        /*
        * TRUE.
        * IMPORTANTE: El operador == compara si es la MISMA POSICIÓN EN MEMORIA.
        * Java al crear el string se fija en la lista de strings de la string pool y
        * si encuentra una coincidencia apunta hacia el mismo lugar en memoria.
        * Esto lo hace más rápido y eficiente.
        * El valor de ambas variables está en el STRING POOL DEL HEAP SPACE de la memoria y
        * apuntan a un solo lugar.
        */

        String str03 = new String("Agustin");
        System.out.println(str01 == str03);
        /*
        * FALSE. Porque al crear el String con NEW. Es un objeto que no está en el
        * STRING de la memoria. Está en el HEAP pero no en el STRING POOL.
        */

        System.out.println(str01.equals(str03));
        /*
         * TRUE.
         * IMPORTANTE:
         * El METODO EQUALS compara CONTENIDO independientemente de donde este ubicado
         * en memoria ese String.
         */
    }
}
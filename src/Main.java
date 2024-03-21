public class Main {
    public static void main(String[] args) {
        String str01 = "Agustin";
        String str02 = "Agustin";
        System.out.println(str01 == str02);
        /*
        * TRUE.
        * IMPORTANTE: El operador == compara SI ESTÁN EN LA MISMA POSICIÓN EN MEMORIA.
        * Java al crear el string se fija en la lista de strings de la string pool y
        * si encuentra una coincidencia apunta hacia el mismo lugar en memoria.
        * Esto lo hace más rápido y eficiente.
        * El valor de ambas variables está en el STRING POOL DEL HEAP SPACE de la memoria y
        * apuntan a un solo lugar.
        */

        String str03 = new String("Agustin");
        System.out.println(str01 == str03);
        /*
        * FALSE.
        * Porque al crear el String con NEW. Es un objeto que no está en el
        * STRING de la memoria. Está en el HEAP pero no en el STRING POOL.
        */

        System.out.println(str01.equals(str03));
        /*
         * TRUE.
         * IMPORTANTE:
         * El MÉTODO EQUALS compara CONTENIDO independientemente de donde este ubicado
         * en memoria ese String.
         */

        String str04 = new String("Hola");
        String str05 = "Hola";
        System.out.println(str04==str05);
        // FALSE.
        str04 = str05.intern();
        System.out.println(str04 == str05);
        /*
        * TRUE.
        * Cuando el MÉTODO INTERN es llamado, se busca en el STRING POOL y si
        * coincide con otro valor lo apunta. Si no lo consigue lo pone como una
        * cadena más en la lista.
        */

    }
}
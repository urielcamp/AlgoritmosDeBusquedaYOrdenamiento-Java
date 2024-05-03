//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        //Ejercicio 1
        //Algoritmo de ordenamiento burbuja


        int [] arr = {12, 32, 45, 3, 47, 75, 49, 463, 2};



        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j]> arr[j+1]){
                    int aux = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = aux;
                }
            }
        }

        for (int x: arr){
            System.out.print(x + ", ");
        }


        //Ejercicio 2
        //Algoritmo de ordenamiento por seleccion

        int [] arraySort = {21, 2, 23, 445, 64, 33, 65, 26, 66};

        for(int i = 0; i < arraySort.length - 1; i++ ){
            int minIndex = i;
            for (int k = i + 1; k < arraySort.length; k++){
                if(arraySort[k] < arraySort[minIndex]){
                    minIndex = k;

                }
            }
            int aux = arraySort[minIndex];
            arraySort[minIndex] = arraySort[i];
            arraySort[i] = aux;
        }
        System.out.println();

        for (int a: arraySort){
            System.out.print(a + ", ");
        }

        System.out.println();


        //Ejercicio 3
        //Algoritmo de busqueda binaria

        int [] arrBi = {123,2342,31,42,5,63,75};


        Arrays.sort(arrBi);
        int[] arrBinaria = Arrays.copyOf(arrBi, arrBi.length);

        int valorBuscado = 31;
        int derecha = arrBinaria.length - 1;
        int izquierda = 0;


        while (izquierda <= derecha){
            int medio = (izquierda + derecha)/2;
            if (valorBuscado == arrBinaria[medio]){
                System.out.println("el valor buscado esta en la posicion: " + medio);
                break;
            }

            if (valorBuscado> arrBinaria[medio]){
                izquierda = medio + 1;
            }else {
                derecha = medio - 1;
            }

        }
        System.out.println();

        //Ejercicio 4
        //Ordenamiento por Inserción (Insertion Sort)

        int [] arrSort = {12, 23, 42, 3, 2, 41, 53, 98, 65};

        for (int i = 0; i < arrSort.length - 1; i++){
            int minIndex = i;
            for (int l = i + 1; l < arrSort.length; l++ ){
                if (arrSort[l]< arrSort[minIndex]){
                    minIndex=l;
                }
            }
            int aux = arrSort[minIndex];
            arrSort[minIndex] = arrSort[i];
            arrSort[i] = aux;
        }

        for (int y: arrSort){
            System.out.print(y + ", ");
        }





    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //Ejercicio 1
        //Algoritmo de ordenamiento burbuja


        int [] arr = {12, 3, 45, 32, 47, 75, 49, 463, 2};



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
            System.out.print(x + " , ");
        }
    }
}
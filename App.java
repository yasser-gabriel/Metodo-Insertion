
 public class App {
    
    public static void insertionSort(int[] arr) {
        //Planteamiento de Método insertionSort
        int n=arr.length;
        for (int i = 1; i < n; i++) {
            int key =arr[i]; //Seleccionamos el elemento a insertar en su posicion correcta
            int j=i - 1;
            //Movemos los elementos mayores que key a una posición adelantes de su posición
            //actual
            while (j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key; //Insertamos key en su posición correcta        
        }
    }

    public static void main(String[] args) {
        //Implementación  (Parte 2) - Método main
        System.out.println("Hello, World!, metodo de ordenamiento por inserción");
        
        int[] arr={12,11,13,5,6};

        System.out.println("Arreglo Original: ");
        for(int num:arr){
            System.out.print(num+" ");
        }

        System.out.println();

        System.out.println("====================================");
        insertionSort(arr); // Llamada al metodo de ordenamiento por insercion

        System.out.println("Arreglo ordenado: ");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}

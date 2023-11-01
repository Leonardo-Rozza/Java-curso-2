package ProgramacionGenerica;

public class MetodosGenericos {
    public static void main(String[] args) {
        String nombrePersonas[] = {"Leo", "Lucys", "Mimi", "Marisol","Gatorade"};

        System.out.println(ExaminaArrays.contarArray(nombrePersonas));
        System.out.println(ExaminaArrays.devuelveMenor(nombrePersonas));

    }
}


class ExaminaArrays{
    public static <T> String contarArray(T[] array){
        return "El numero de elementos en el array es de " + array.length;
    }

    public static <T extends Comparable> T devuelveMenor(T[] arr){
        T objetoMenor = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (objetoMenor.compareTo(arr[i]) > 0){
                objetoMenor = arr[i];
            }
        }

        return objetoMenor;
    }
}

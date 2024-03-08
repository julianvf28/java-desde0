public class Estructuras{

    public static void main(String[] args) {

        float matematicas = 9;
        float biologia = 6;
        float quimica = 1;
        float promedio = 0;

        promedio = (matematicas + biologia + quimica) / 3;

        if ( promedio >= 6 ){
            System.out.println("El promedio del alumno es "+promedio);
            System.out.println("Aprobado");
        }
        else
        {
            System.out.println("El promedio del alumno es "+promedio);
            System.out.println("Reprobado");
        }



    }
}
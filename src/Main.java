import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        
        int[] array = new int[10];

        System.out.print("array = { ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("}");

        Strange[] array1 = new Strange[10];
        System.out.print("array1 = { ");
        for (Strange i : array1) {
            System.out.print(i + " ");
        }
        System.out.println("}");
        System.out.println();

        Strange[] array2 = new Strange[]{
                new Strange("камень бесконечности", 1),
                new Strange("плащ левитации", 2),
                new Strange("посох живого трибунала", 3),
                new Strange("кольцо астрала", 4),
                new Strange("шар агамотто", 5),
                null,
                new Strange("жезл ватумба", 6),
                null,
                null,
                null
                };
        System.out.println("array2 = { ");
        for (Strange i : array2) {
            System.out.println(i + " ");
        }
        System.out.println("}");

    }
}
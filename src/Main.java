public class Main {
    public static void main(String[] args) {
        
        int[] array = new int[10];

        System.out.print("{ ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("}");

        Strange[] array1 = new Strange[10];
        System.out.print("{ ");
        for (Strange i : array1) {
            System.out.print(i + " ");
        }
        System.out.println("}");

    }
}
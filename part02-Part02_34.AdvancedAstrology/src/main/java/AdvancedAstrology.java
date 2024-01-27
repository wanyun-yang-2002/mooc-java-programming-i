
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i=0; i<number; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i=0; i<number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        for (int i=1; i<=size; i++) {
            printSpaces(size-i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        for (int i=0; i<height; i++) {
            for (int k=0; k<height-i-1; k++){
                System.out.print(" ");
            }
            for (int j=0; j<i*2+1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int j=0; j<2; j++) {
            for (int i = 0; i<height-2; i++) {
                System.out.print(" ");
            }
            System.out.println("***");
        }
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        printTriangle(1);
        System.out.println("---");
        printTriangle(3);
        System.out.println("---");
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
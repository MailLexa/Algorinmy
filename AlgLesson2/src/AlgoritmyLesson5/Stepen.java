package AlgoritmyLesson5;
// Задача 1.
public class Stepen {

    private static int numberOut;

     public static void main(String[] args) {
        System.out.println(step(3,3));
    }
    private static int step(int number, int degree){

        if (degree==0)
            return 1;
        return number*step(number,degree-1);
    }
}

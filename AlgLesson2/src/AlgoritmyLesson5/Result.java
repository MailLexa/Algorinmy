package AlgoritmyLesson5;

public class Result {
    public int number;
    public boolean check;
    Result(int number, boolean check){
        this.number = number;
        this.check = check;

    }
    public void print (){
        System.out.println("Номер "+ number+ ", " + check);
    }
}

package АлгоритмыLesson3;
//2. Создать программу, которая переворачивает вводимые строки (читает справа налево).

public class Task3 {
    String text;
    String name = "";
    String  textout ="";
        Task3(String text){
        this.text=text;
    }

    public void revolutionText(){



        for (int i=text.length()-1;i>=0;i--){

            name=text.substring(i,i+1);
            textout+=name;

        }


    }
    public void print(){

        System.out.println(textout);
    }
}

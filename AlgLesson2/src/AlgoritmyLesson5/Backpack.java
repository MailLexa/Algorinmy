package AlgoritmyLesson5;
//2. Написать программу «Задача о рюкзаке» с помощью рекурсии.
public class Backpack {
    double massa=20;
    double mas = massa;


    double [][] predmet ={{1,3,40},{2,5,30},{3,6,10},{4,7,9},{5,8,2},{6,1,2},{7,8,4},{8,15,20},{9,3,17}};//название, вес, цена
    double [][] predmet2 = new double [predmet.length][3];
    int b=0;
    double [][] c=new double[100][2];//
    Backpack(){

    }

    public static void main(String[] args) {
        Backpack backpack = new Backpack();
        backpack.mas();//считаем цену за 1 еденицу массы
        backpack.print(); //выводим массив
        System.out.println("Macca"+backpack.sum());//выводим свободное место в рюкзаке, ложим в рюкзак товары у которых цена за 1 еденицу массы больше
        backpack.print1();// выводим название товаров которые положены в рюкзак
    }
    public double sum(){
        for (int i=0;i<predmet.length;i++){

            if(c[b][0]<predmet2[i][0]& predmet[b][1]<=mas & predmet2[i][0]>0 & mas>=0){
                c[b][0]=predmet[b][0];

               // mas=
            }
            if (i==predmet2.length-1){
                predmet2[b][0]=0;
                if (mas-predmet[b][1]>=0){
                    mas = mas - predmet[b][1];
                }
            }

        }

        b++;
        if (b==predmet.length)
            return mas;
        return sum();




    }
    public void mas(){
        System.out.println(predmet.length);
        for (int i=0; i<predmet.length;i++){
            for(int b=0;b<1;b++){
                predmet2[i][b] = predmet[i][2]/predmet[i][1];
            }

        }

    }
    public void print(){
        for (int i=0; i<predmet2.length;i++){
            System.out.println(predmet2[i][0]);
        }


    }

    public void print1(){
        for (int i=0; i<predmet.length;i++){
            if (((int)c[i][0])-1>=0)
               System.out.println(predmet[((int)c[i][0])-1][0]);
        }


    }
}

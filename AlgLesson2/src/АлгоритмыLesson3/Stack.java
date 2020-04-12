package АлгоритмыLesson3;
//1 Задание стек
public class Stack {

    int top=-1;
    int size;
    char []mas;

     Stack(int size){
         this.size = size;
        mas =new char[size];

    }

    public void add (char name){

        ++top;
        mas[top]=name;

    }


    public char  receive(){
         top--;
         return mas[top+1];

    }
    public char receiveTurn(){
         int b=0;
         for(int i=0;i<mas.length;i++){
             b=i;
             if(mas[i]==0){

             }else break;

         }
        if(mas[b]==0){
            return mas[b];
        }
        else{
            return mas[b];
        }

    }

    public void delete(){
        for(int i=0;i<mas.length;i++){
            if(mas[i]==0){

            }else {
                mas[i]=0;
                break;
            }

        }
    }


    public Boolean prov (){
         return (top == -1);
    }

    }

class Check{
    String input;
    public Check(String input){
        this.input=input;
    }
    public void check(){
        Stack br = new Stack(input.length());
        char ch,chr;
        for (int i=0;i<input.length();i++){
            ch = input.charAt(i);
            switch(ch){
                case '(':
                case '[':
                case '{':
                    br.add(ch);
                    break;
                case ')':
                case '}':
                case ']':
                    if (!br.prov()){
                        chr=br.receive();
                        if ((ch==')' & chr!='(') || (ch==']' & chr!='[') || (ch=='}'& chr!='{')){
                            System.out.println("Error "+i+ch);
                            break;
                        }
                    }else System.out.println("Error"+i+ch );

            }
        }
        if(br.top>-1){
            for(int b=0;b<=br.top;b++){
                if (br.mas[b]!=0)
                System.out.println("Error"+br.mas[b]);
            }
        }
    }


}

class Vypolnit{
    public static void main(String[] args) {
        Check check = new Check( "На траве( сидит ) крот [ dfdfdf] dfdfdffgpp { dfdf } dff {{");
        check.check();
        Turn turn = new Turn("На траве( сидит ) крот [ dfdfdf] dfdfdffgpp { dfdf } dff {{");
        turn.text();
        Task3 task3 = new Task3("123457890");
        task3.revolutionText();
        task3.print();

    }

        }


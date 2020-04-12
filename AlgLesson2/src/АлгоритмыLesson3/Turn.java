package АлгоритмыLesson3;
// 2 Задание очередь
public class Turn {
    String text;
    Turn(String text){
        this.text=text;
    }
    public void text (){
        Stack br=new Stack(text.length());
        char ch,chr;
        for (int i=0;i<text.length();i++){
            ch = text.charAt(i);
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
                        chr=br.receiveTurn();
                        if ((ch==')' & chr!='(') || (ch==']' & chr!='[') || (ch=='}'& chr!='{')){
                            System.out.println("Error "+i+ch);
                            break;
                        }else br.delete();
                    }

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

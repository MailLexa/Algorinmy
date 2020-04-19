package AlgoritmyLesson5;

import java.io.EOFException;
import java.io.IOException;

//Задание 3
class MyArr{
    private int[] arr;
    private int size;

    public MyArr(int size) {
        this.size = 0;
        this.arr = new int[size];
    }

    public Result binaryFind(int search) {
        return recBinaryFind(search, 0, size-1);
    }

    private Result recBinaryFind(int searchKey, int low, int high) {
        int curIn;
        curIn = (low + high ) / 2;


            if (arr[curIn] == searchKey) {

                return new Result(curIn, true);
            } else if (low > high) {
                try {
                throw new ArithmeticException("Поис не дал результатов");
                }catch (ArithmeticException e) {
                    System.err.println(e);
                    return new Result(-1, false);
                }

            } else {
                if (arr[curIn] < searchKey)
                    return recBinaryFind(searchKey, curIn + 1, high);
                else
                    return recBinaryFind(searchKey, low, curIn - 1);
            }

    }


    public void insert(int value){
        int i;
        for(i=0;i<this.size;i++){
            if (this.arr[i]>value)
                break;
        }
        for(int j=this.size;j>i;j--){
            this.arr[j] = this.arr[j-1];
        }
        this.arr[i] = value;
        this.size++;
    }

}




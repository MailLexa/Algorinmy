package АлгоритмыLesson3;

public class Dek {
    int size;
    int head;
    int tail; 
    int[] data;

    Dek(int size)
    {
        data = new int[this.size = size];
    }
    int PushBack(int value) //добавление в конец очереди
    {
        if (++tail == size)
            tail = 0;
        data[tail] = value;
        return data[tail];
    }

    int PopBack() //выборка с конца очереди
    {
        int ret = data[tail];
        if (--tail < 0)
            tail = size - 1;
        return ret;
    }

    void PushFront(int value) //добавление в начало очереди
    {
        data[head] = value;
        if (--head < 0)
            head = size - 1;
    }

    int PopFront() // выборка с начала очереди
    {
        if (++head == size)
            head = 0;
        return data[head];
    }

}

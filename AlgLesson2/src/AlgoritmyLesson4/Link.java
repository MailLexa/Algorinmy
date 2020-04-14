package AlgoritmyLesson4;


import java.util.Objects;









class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + this.age;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final People other = (People) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Name: "+this.name+", age: "+this.age;
    }
}


class StackList{
    private LinkedList1 list;
    public StackList(){
        list = new LinkedList1();
    }

    public void push(String name, int age){
        list.insert(name, age);
    }

    public String pop(){
        return list.delete();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void display(){
        list.display();
    }

}



class LinkStackApp {


    public static void main(String[] args) {
        StackList sl = new StackList();
        sl.push("Artem", 30);
        sl.push("Viktor", 20);
        sl.push("Sergey", 10);
        sl.display();
        while (!sl.isEmpty()) {
            System.out.println("Элемент "+ sl.pop()+" удален из стека");
        }
    }
}


class LinkedList1{
    public Link first;
    public Link last;

    public LinkedList1(){
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insert(String name, int age){
        Link newLink = new Link(name, age);
        if (this.isEmpty())
            first = newLink;
        else
            last.next = newLink;
        last = newLink;
    }

    public String delete(){
        Link temp = first;
        if (first.next == null)
            last = null;
        first = first.next;
        return temp.name;

    }

    public void display(){
        Link current = first;
        while(current != null){
            current.display();
            current = current.next;
        }
    }
}



class Queue{
    private LinkedList1 queue;

    public Queue(){
        queue = new LinkedList1();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public void insert(String name, int age){
        queue.insert(name, age);
    }

    public String delete(){
        return queue.delete();
    }

    public void display(){
        queue.display();
    }

}



class LinkQueueApp {


    public static void main(String[] args) {
        Queue q = new Queue();
        q.insert("Artem", 30);
        q.insert("Viktor", 20);
        q.insert("Sergey", 10);
        q.display();
        while (!q.isEmpty()) {
            System.out.println("Элемент "+ q.delete()+" удален из стека");
        }
    }

}



class Link{
    public String name;
    public int age;

    public Link next;

    public Link(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("Name: "+this.name+", age: "+this.age);
    }
}

class LinkedList{
    private Link first;


    public LinkedList(){
        first = null;

    }

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }

    public LinkInterator getIterator(){
        return new LinkInterator(this);
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void display(){
        Link current = first;
        while(current != null){
            current.display();
            current = current.next;
        }
    }
}


class LinkInterator{
    private Link current;
    private Link previous;
    private LinkedList list;

    public LinkInterator(LinkedList list){
        this.list = list;
        this.reset();
    }

    public void reset(){
        current = list.getFirst();
        previous = null;
    }

    public boolean atEnd(){
        return (current.next == null);
    }

    public void nextLink(){
        previous = current;
        current = current.next;
    }

    public Link getCurrent(){
        return current;
    }

    public void insertAfter(String name, int age){
        Link newLink = new Link(name, age);
        if (list.isEmpty()){
            list.setFirst(newLink);
            current = newLink;
        } else {
            newLink.next = current.next;
            current.next = newLink;
            nextLink();
        }
    }

    public void insertBefore(String name, int age){
        Link newLink = new Link(name, age);
        if(previous == null){
            newLink.next = list.getFirst();
            list.setFirst(newLink);
            reset();
        }
        else{
            newLink.next = previous.next;
            previous.next = newLink;
            current = newLink;
        }
    }

    public String deleteCurrent(){
        String name = current.name;
        if (previous == null){
            list.setFirst(current.next);
            reset();
        } else {
            previous.next = current.next;
            if (atEnd()){
                reset();
            } else {
                current = current.next;
            }
        }

        return name;
    }

}

class LinkIteratorApp {


    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        LinkInterator itr = new LinkInterator(list);

        itr.insertAfter("Artem", 20);
        itr.insertBefore("Sergey", 10);

        list.display();
        itr.reset();
        System.out.println(itr.atEnd());
        itr.nextLink();
        System.out.println(itr.atEnd());
        itr.getCurrent().display();
        itr.deleteCurrent();
        itr.getCurrent().display();


    }

}



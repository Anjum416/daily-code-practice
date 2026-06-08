package Linkeddlist;

public class LList {
    private Node head;
    private Node tail;
    private int size;

    void addFirst(int value){
        Node node=new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;

    }
    void addLast(int value)
    {
        if(tail==null){
            addFirst(value);
            return;

        }
        Node node =new Node(value);
        tail.next=node ;
        tail=node;
        size++;
    }

    void insert(int index,int value){
        if(index==0){
            addFirst(value);
            return;
        }
        if(index==size){
            addLast(value);
            return;
        }
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        Node node=new Node(value,temp.next);
        temp.next=node;
        size++;
    }
    int deleteFirst(){
        if(size==0){
            return -1;
        }
        int val=head.value;
        head=head.next;
        size--;
        if(size == 0){
            tail = null;
        }
        return val;
    }
    int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev=get(index-1);
        int val=prev.next.next.value;
        prev.next=prev.next.next;
        size--;
        return val;
    }
    Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;

        }
        return temp;
    }
    int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        int val=tail.value;
        Node secondlast=get(size -2);
        tail=secondlast;
        tail.next=null;
        size--;
        return val;

    }


    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value +" --> ");
            temp=temp.next;
        }
        System.out.print("null");
    }
    private class Node{


        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int  value,Node next){
            this.value=value;
            this.next=next;
        }
    }

    public static void main(String args[]) {
        LList ll=new LList();
        ll.addFirst(60);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.addFirst(40);
        ll.addFirst(50);
        ll.addLast(10);
        ll.insert(2,56);
        ll.display();
        System.out.println(ll.size);
        System.out.println(ll.deleteFirst());
        System.out.println(ll.deleteLast());
        LList ll1 = ll;
        System.out.println();
        ll1.display();
        System.out.println(ll.deleteFirst());
        System.out.println();
        ll.display();
        ll.delete(3);
        System.out.println();
        ll.display();
    }

}

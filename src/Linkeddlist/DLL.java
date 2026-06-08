package Linkeddlist;

public class DLL {


        private Node head;
        public void insertFirst(int val) {
            Node node = new Node(val);

            node.next = head;
            node.prev = null;

            if (head != null) {
                head.prev = node;
            }

            head = node;
        }
        public void insertLast(int val) {

            Node node = new Node(val);
            Node temp = head;

            node.next = null;
            if (head == null) {
                node.prev = null;
                head = node;
                return;
            }

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = node;
            node.prev = temp;
        }
        public void display() {

            Node node = head;
            Node last = null;

            while (node != null) {
                System.out.print(node.val + " -> ");
                last = node;
                node = node.next;
            }

            System.out.println("END");

            System.out.print("Reverse: ");

            while (last != null) {
                System.out.print(last.val + " -> ");
                last = last.prev;
            }

            System.out.println("START");
        }

        public void insertAfter(int after, int val) {

            Node p = find(after);

            if (p == null) {
                System.out.println("Node does not exist");
                return;
            }

            Node node = new Node(val);

            node.next = p.next;
            p.next = node;
            node.prev = p;

            if (node.next != null) {
                node.next.prev = node;
            }
        }


        public Node find(int value) {

            Node node = head;

            while (node != null) {
                if (node.val == value) {
                    return node;
                }
                node = node.next;
            }

            return null;
        }
        private class Node {

            int val;
            Node next;
            Node prev;

            public Node(int val) {
                this.val = val;
            }

            public Node(int val, Node next, Node prev) {
                this.val = val;
                this.next = next;
                this.prev = prev;
            }
        }

        public static void main(String[] args) {

            DLL list = new DLL();

            list.insertFirst(10);
            list.insertFirst(20);
            list.insertFirst(30);

            list.insertLast(5);

            list.insertAfter(20, 15);

            list.display();
        }
    }

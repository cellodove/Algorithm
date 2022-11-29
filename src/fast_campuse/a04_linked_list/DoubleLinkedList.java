package fast_campuse.a04_linked_list;

public class DoubleLinkedList<T> {
    public Node<T> head = null;
    public Node<T> tail = null;

    public class Node<T>{
        T data;
        Node<T> prev = null;
        Node<T> next = null;

        public Node(T data){
            this.data = data;
        }
    }

    public void addNode(T data){
        if (this.head == null){
            this.head = new Node<>(data);
            this.tail = this.head;
        }else {
            Node<T> node = this.head;
            while (node.next != null){
                node = node.next;
            }
            node.next = new Node<>(data);
            node.next.prev = node;
            this.tail = node.next;
        }
    }

    public Node<T> searchFromHead(T data){
        if (head != null){
            Node<T> node = this.head;
            while (node != null){
                if (node.data == data){
                    return node;
                }else {
                    node = node.next;
                }
            }
        }
        return null;
    }

    public Node<T> searchFromTail(T data){
        if (this.tail != null){
            Node<T> node = this.tail;
            while (node != null){
                if (node.data == data){
                    return node;
                }else {
                    node = node.prev;
                }
            }
        }
        return null;
    }

    public boolean addNodeToFront(T data, T nextData){
        if (this.head == null){
            this.head = new Node<T>(data);
            this.tail = this.head;
            return true;
        }else if (this.head.data == nextData){
            Node<T> newHead = new Node<>(data);
            newHead.next = this.head;
            this.head = newHead;
            this.head.next.prev = this.head;
            return true;
        }else {
            Node<T> node = this.head;
            while (node != null){
                if (node.data == nextData){
                    Node<T> nodePrev = node.prev; //찾은 노드의 앞 노드

                    //정방향 연결
                    nodePrev.next = new Node<>(data); //찾은 노드의 앞에있는 노드 뒤에, 새로 노드를 만들어 연결한다.
                    nodePrev.next.next = node; //새로 만든 노드 뒤에 찾은 노드를 연결한다.

                    //역방향 연결
                    nodePrev.next.prev = nodePrev; //새로 생성된 노드의 앞에, 찾은 노드 앞에있는 노드를 연결한다.
                    node.prev = nodePrev.next; //새로 생성된 노드를 찾은 노드 앞에 연결한다.
                    return true;
                }else {
                    node = node.next;
                }
            }
            return false;
        }
    }

    public boolean delNode(T data){
        if (head == null){
            return false;
        }else if (this.head.data == data){
            this.head = this.head.next;
            this.head.prev = null;
            return true;
        }else {
            Node<T> node = this.head;
            while (node != null){
                if (node.data == data){
                    Node<T> nodePrev = node.prev; //찾은 노드의 앞노드

                    nodePrev.next = node.next; //삭제할 노드의 앞부분 분리 후 연결
                    node.next.prev = nodePrev; //삭제할 노드의 뒷부분 분리 후 연결
                    return true;
                }else {
                    node = node.next;
                }
            }
        }

        return false;
    }

    public void printAll(){
        if (this.head != null){
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null){
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public static void main(String[] args) {
        DoubleLinkedList<String> doubleLinkedList = new DoubleLinkedList<>();
        doubleLinkedList.addNode("1");
        doubleLinkedList.addNode("2");
        doubleLinkedList.addNode("3");
        doubleLinkedList.addNode("4");
        doubleLinkedList.addNode("5");

        doubleLinkedList.addNodeToFront("3.5","3");
        doubleLinkedList.printAll();

    }

}

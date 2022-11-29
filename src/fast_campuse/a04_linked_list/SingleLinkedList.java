package fast_campuse.a04_linked_list;

public class SingleLinkedList <T>{
    public Node<T> head = null;
    public class Node<T>{
        T data;
        Node<T> next = null;

        public Node(T data){
            this.data = data;
        }
    }

    public void addNode(T data){
        if (head == null){
            //헤드가 없으면 첫시작이라는뜻
            head = new Node(data);
        }else {
            //헤드로부터 시작해 링크드 리스트의 끝에 도달하면 그 마지막에 노드를 추가한다.
            Node<T> node = this.head;
            while (node.next != null){
                node = node.next;
            }
            node.next = new Node<>(data);
        }
    }

    public void printAll(){
        if (head != null){
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null){
                node = node.next;
                System.out.println(node.data);
            }
        }
    }

    public Node<T> search(T data){
        if (head != null) {
            Node<T> node = this.head;
            while (node != null) {
                if (node.data == data) {
                    return node;
                } else {
                    node = node.next;
                }
            }
        }
        return null;
    }

    public void addNodeInside(T data, T isData){
        Node<T> searchData = this.search(isData);
        if (searchData == null){
            this.addNode(data);
        }else {
            Node<T> nextNode = searchData.next;
            searchData.next = new Node<>(data);
            searchData.next.next = nextNode;
        }
    }

    public boolean delNode(T isData){
        if (head == null){
            return false;
        }else {
            Node<T> node = this.head;
            if (node.data == isData){
                this.head = this.head.next;
                return true;
            }else {
                while (node.next != null){
                    if (node.next.data == isData){
                        node.next = node.next.next;
                        return true;
                    }
                    node = node.next;
                }
                return false;
            }
        }
    }

    public static void main(String[] args) {
        SingleLinkedList<String> singleLinkedList = new SingleLinkedList<>();
        singleLinkedList.addNode("1");
        singleLinkedList.addNode("2");
        singleLinkedList.addNode("3");
        singleLinkedList.addNode("4");
        singleLinkedList.addNode("5");
        singleLinkedList.addNodeInside("3.5","1");

        singleLinkedList.printAll();
    }
}

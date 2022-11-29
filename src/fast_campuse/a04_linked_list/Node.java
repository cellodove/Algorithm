package fast_campuse.a04_linked_list;

public class Node<T> {
    T data; //노드에 저장될 데이터
    Node<T> next = null; //다음 노트를 가르키는 인스턴스

    //생성자
    public Node(T data){
        this.data = data;
    }

    public static void main(String[] args) {
        Node<String> node1 = new Node("a");
        Node<String> node2 = new Node("b");

        node1.next = node2;
        Node<String> head = node1; //노드의 가장앞을 헤드라 부른다.

        System.out.println(node1.data);
        System.out.println(node1.next.data);
    }
}

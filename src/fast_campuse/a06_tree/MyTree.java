package fast_campuse.a06_tree;

public class MyTree {
    Node root = null;

    public class Node{
        Node left;
        Node right;
        int value;

        public Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public boolean addNode(int value){
        //노드가 하나도 없을때
        if (root == null){
            root = new Node(value);
            return true;
        }else {
            //노드가 이미 있을때
            Node findNode = this.root;
            while (true){
                //기준 노드 값보다 작아 왼쪽 노드로 들어갈때
                if (value < findNode.value){
                    if (findNode.left != null){
                        findNode = findNode.left;
                    }else {
                        findNode.left = new Node(value);
                        return true;
                    }
                }else { //노드가 오른 쪽으로 들어갈때
                    if (findNode.right != null){
                        findNode = findNode.right;
                    }else {
                        findNode.right = new Node(value);
                        return true;
                    }
                }
            }
        }
    }

    public Node search(int value){
        if (this.root != null) {
            Node findNode = this.root;
            while (findNode != null) {
                if (findNode.value == value) {
                    return findNode;
                } else if (value <= findNode.value) {
                    findNode = findNode.left;
                } else {
                    findNode = findNode.right;
                }
            }
        }
        return null;
    }


    public static void main(String[] args) {
        MyTree myTree = new MyTree();
        myTree.addNode(10);
        myTree.addNode(20);
        myTree.addNode(30);
        myTree.addNode(40);
    }

}

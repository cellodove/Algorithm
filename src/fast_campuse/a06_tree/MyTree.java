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

    public boolean delete(int value){
        boolean searched = false;

        Node currParentNode = this.root;
        Node currNode = this.root;

        /* Node 가 하나도 없을때 */
        if (this.root == null){
            return false;
        }else {

            /* Node 가 하나만 있고 그 노드를 삭제해야할 경우*/
            if (this.root.value == value && this.root.left == null && this.root.right == null){
                this.root = null;
                return true;
            }


            /* 삭제할 노드를 찾는다. */
            while (currNode != null){
                if (currNode.value == value){
                    searched = true;
                    break;
                }else if (value < currNode.value){
                    currParentNode = currNode;
                    currNode = currNode.left;
                }else {
                    currParentNode = currNode;
                    currNode = currNode.right;
                }
            }

            /* 삭제할 노드를 못찾을 경우 */
            if (!searched){
                return false;
            }

            /*
             * 위의 코드가 실행하면
             * currNode 에는 삭제할 노드가 들어있다.
             * currParentNode 에는 삭젤할 노드의 부모 노드가 들어있다.
             */

            /* case 1: 삭제할 Node 가 Leaf 노드인 경우 */
            if (currNode.left == null && currNode.right == null){
                /* 부모 노드의 왼쪽에 있을 경우 */
                if (currNode.value < currParentNode.value){
                    currParentNode.left = null;

                }else {
                    /* 부모 노드의 오른쪽에 있을 경우 */
                    currParentNode.right = null;
                }
                return true;


            /* case 2-1: 삭제할 Node 가 Child Node를 한 개 가지고 있을 경우(왼쪽에 Child Node) */
            }else if (currNode.left != null && currNode.right == null){
                /* 삭제할 노드가 부모 노드의 왼쪽에 있을 경우 */
                if (value < currParentNode.value){
                    currParentNode.left = currNode.left;
                }else {
                    /* 삭제할 노드가 부모 노드의 오른쪽에 있을 경우 */
                    currParentNode.right = currNode.left;
                }
                return true;

            /* case 2-2: 삭제할 Node 가 Child Node를 한 개 가지고 있을 경우(오른쪽에 Child Node) */
            }else if (currNode.left == null && currNode.right != null){
                /* 삭제할 노드가 부모 노드의 왼쪽에 있을 경우 */
                if (value < currParentNode.value){
                    currParentNode.left = currNode.right;
                }else {
                    /* 삭제할 노드가 부모 노드의 오른쪽에 있을 경우 */
                    currParentNode.right = currNode.right;
                }
                return true;


            /* Case 3-1: 삭제할 노드 가 자식 노드를 두 개 가지고 있을 경우 */
            }else {

                /* 삭제할 노드가 부모 노드의 왼쪽에 있을 때 */
                if (value < currParentNode.value){
                    Node changeNode = currNode.right;
                    Node changeParentNode = currNode.right;
                    while (changeNode.left != null){
                        changeParentNode = changeNode;
                        changeNode = changeNode.left;
                    }
                    /* while 문이 돌고나면  changeNode 에는 삭제할 노드의 오른쪽 노드중 가장 작은 값의 노드가 들어있게 된다*/

                    /* Case 3-1-2 changeNode 의 오른쪽에 Child Node 가 있을 때 */
                    if (changeNode.right !=  null){
                        changeParentNode.left = changeNode.right;

                    /* Case 3-1-1 changeNode 의 오른쪽에 Child Node 가 없을 때 */
                    }else {
                        changeParentNode.left = null;
                    }

                    /* 삭제할 노드의 부모 노드에 연결해 준다. */
                    currParentNode.left = changeNode;

                    /* 삭제할 노드가 가지고있던 오른쪽 왼쪽 노드를 바꿀 노드에 연결해 준다. */
                    changeNode.left = currNode.left;
                    changeNode.right = currNode.right;

                }else {

                    /* 삭제할 노드가 부모 노드의 오른쪽에 있을 때 */
                    Node changeNode = currNode.right;
                    Node changeParentNode = currNode.right;
                    while (changeNode.left != null){
                        changeParentNode = changeNode;
                        changeNode = changeNode.left;
                    }
                    /* while 문이 돌고나면  changeNode 에는 삭제할 노드의 오른쪽 노드중 가장 작은 값의 노드가 들어있게 된다*/

                    /* Case 3-2-2 changeNode 의 오른쪽에 Child Node 가 있을 때 */
                    if (changeNode.right !=  null){
                        changeParentNode.left = changeNode.right;

                    /* Case 3-2-1 changeNode 의 오른쪽에 Child Node 가 없을 때 */
                    }else {
                        changeParentNode.left = null;
                    }

                    /* 삭제할 노드의 부모 노드에 연결해 준다. */
                    currParentNode.right = changeNode;

                    /* 삭제할 노드가 가지고있던 오른쪽 왼쪽 노드를 바꿀 노드에 연결해 준다. */
                    changeNode.left = currNode.left;
                    changeNode.right = currNode.right;

                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        // Case 3-1: 삭제할 노드가 자식 노드를 두 개 가지고 있을 경우
        MyTree myTree = new MyTree();
        myTree.addNode(10);
        myTree.addNode(15);
        myTree.addNode(13);
        myTree.addNode(11);
        myTree.addNode(14);
        myTree.addNode(18);
        myTree.addNode(16);
        myTree.addNode(19);
        myTree.addNode(17);
        myTree.addNode(7);
        myTree.addNode(8);
        myTree.addNode(6);
        System.out.println(myTree.delete(15));

        System.out.println("ROOT: " + myTree.root.value);
        System.out.println("ROOT LEFT: " + myTree.root.left.value);
        System.out.println("ROOT LEFT LEFT: " + myTree.root.left.left.value);
        System.out.println("ROOT LEFT RIGHT: " + myTree.root.left.right.value);

        System.out.println("ROOT RIGHT: " + myTree.root.right.value);
        System.out.println("ROOT RIGHT LEFT: " + myTree.root.right.left.value);
        System.out.println("ROOT RIGHT RIGHT: " + myTree.root.right.right.value);

        System.out.println("ROOT RIGHT RIGHT LEFT: " + myTree.root.right.right.left.value);
        System.out.println("ROOT RIGHT RIGHT RIGHT: " + myTree.root.right.right.right.value);
    }

}

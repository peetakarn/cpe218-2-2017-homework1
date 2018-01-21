public class Node {
    private int item;
    private  Node next;

    // begin constrct
    public Node (){
        next = null;
    }
    public  Node(int newItem ){
        item = newItem;
        next = null;
    }
    public  Node(int newItem,Node nextNode){
        item = newItem;
        next = nextNode;
    }
    // end constrct

    public void setItem(int item) {
        this.item = item;
    }
    public int getItem() {
        return item;
    }
    public void setNext(Node nextNode){
        next = nextNode;
    }

    public Node getNext() {
        return next;
    }
}

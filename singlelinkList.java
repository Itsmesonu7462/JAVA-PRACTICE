public class singlelinkList {
    Node head;
     class Node{
        String  data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
     }
     public void addFirst(String  data){
        Node newNode = new Node(data);
        if(head == null){
            head  = newNode;
            return;
        }
        newNode.next=head;
        head =newNode;
     }
    public void printList(){
        Node CurrentNode =head;
        while(CurrentNode != null){
            System.out.println("-> "+CurrentNode.data);
            CurrentNode= CurrentNode.next;
        }
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head =newNode;
            return;
        }
        Node  lastNode = head;
        while(lastNode.next !=null){
            lastNode = lastNode.next;
        }
        lastNode.next=newNode;

    }
     public static void main(String[] args) {
        singlelinkList list = new singlelinkList();
        list.printList();
        list.addFirst("DSA");
        list.addFirst("VICCK");
        list.addFirst(null);
        list.addFirst("ONE");
        list.addLast("full");
        list.printList();
     }
}

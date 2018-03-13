public class Stackluis{
    private Node head;

    public Stackluis(){
        head = null;
    }
    public Stackluis(Object o){
        head = new Node(o);
    }
    public void push(Object o){
        Node n = new Node(o);
        n.next = head;
        head = n;
    }
    public Object top(){
        return head.ob;
    }
    public void pop(){
        if(head.next != null){
            head = head.next;
        }
    }
    public boolean isemply(){
        if(head == null){
            return true;
        }else{
            return false;
        }
        
    }


}
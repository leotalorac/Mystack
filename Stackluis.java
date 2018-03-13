public class Stackluis{
    private Node head;

    public Stackluis(){
        head = null;
    }
    public Stackluis(Object o){
        head = new Node(o);
    }
    public void push(Object o){
        if(this.isemply()){
            head = new Node(o);
        }else{
            Node n = new Node(o);
            n.next = head;
            head = n;   
        }
    }
    public Object top(){
        return head.ob;
    }
    public void pop(){
        if(head.next != null){
            head = head.next;
        }else{
            head = null;
        }
    }
    public boolean isempty(){
        if(head == null){
            return true;
        }else{
            return false;
        }
    }
    public boolean isnotempty(){
        if(head != null){
            return true;
        }else{
            return false;
        }
    }
    public void printhead(){
        if(!(this.isemply())){
            System.out.println("head " + head.ob);
        }
    }


}
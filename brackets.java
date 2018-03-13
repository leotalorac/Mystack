import java.util.Scanner;
public class brackets{
    //node implementation
    public static class Node {
        //next node
        Node next;
        //data to save, for convinience use int, but can be change to object
        Object ob;
        //constructor
        Node(Object val) {
            ob = val;
            next = null;
        }
    }
    public static class Stackluis{
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
        public boolean isemply(){
            if(head == null){
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        boolean a = true;
        for(int h=0;h<cases;h++){
            //System.out.println("case: " + h);
            Stackluis sta = new Stackluis();
            String s = sc.next();
            //System.out.println(s);
            if (s.length()>0){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) =='(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                    sta.push(s.charAt(i));
                    
                }else{
                    if(s.charAt(i) ==')'){
                        if((char)sta.top() == '('){
                            sta.pop();
                            
                        }else{
                            System.out.println("NO");
                            a = false;
                            break;
                        }
                    }else if(s.charAt(i) =='}'){
                        if((char)sta.top() == '{'){
                            sta.pop();
                            
                        }else{
                            System.out.println("NO");
                            a= false;
                            break;
                        }
                    }else if(s.charAt(i) ==']'){
                        if((char)sta.top() == '['){
                            sta.pop();
                            
                        }else{
                            System.out.println("NO");
                            a= false;
                            break;
                        }
                    }
                }
            }
            if(a){
                System.out.println("YES");
            }
            a =true;
        }
        }
    }
}
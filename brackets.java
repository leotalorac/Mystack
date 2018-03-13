import java.util.Scanner;
public class brackets{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        String s = sc.nextLine();
        boolean a = true;
        for(int h=0;h<cases;h++){
            Stackluis sta = new Stackluis();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) =='(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                    sta.push(s.charAt(i));
                }else{
                    if(s.charAt(i) ==')'){
                        if((char)sta.top() == '('){
                            sta.pop();
                        }else{
                            System.out.println("NO");
                            a= false;
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
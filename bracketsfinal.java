import java.util.Scanner;
import java.util.Stack;
public class bracketsfinal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        Stack<Character> ste = new Stack<>();
        boolean a = true;
        for(int h=0;h<cases;h++){
            String s = sc.next();
            for(int i =0;i<s.length();i++){
                if(s.charAt(i) == '[' || s.charAt(i) == '(' || s.charAt(i) == '{'){
                    ste.push(s.charAt(i));
                }else{
                    if(!(ste.isEmpty())){
                        char tem = ste.peek();
                        if((s.charAt(i) == ']' && tem == '[') || (s.charAt(i) ==')' && tem == '(') || (s.charAt(i) == '}' && tem == '{')){
                            
                                ste.pop();
                        }
                    }else{
                        ste.push('0');
                        break;
                    }
                }
            }
            if(ste.isEmpty()){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            ste.clear();
        }
    }
}
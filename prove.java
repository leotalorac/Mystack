public class prove{
    public static void main(String[] args) {
        Stackluis l = new Stackluis(3);
        l.printhead();
        l.push(1);
        l.printhead();
        l.push(2);
        l.printhead();
        l.pop();
        l.printhead();
        l.pop();
        l.printhead();
        System.out.println(l.isemply());
        l.pop();
        System.out.println(l.isemply());
    }
}
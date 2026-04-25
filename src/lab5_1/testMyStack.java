package lab5_1;

public class testMyStack {
    public static void main(String[] args) {
        MyStack stack1 = new MyStack();
        stack1.push("a");
        stack1.push("b");
        stack1.push("c");

        MyStack stack2 = (MyStack) stack1.clone();

        System.out.println("" + stack1 + stack2);
        System.out.println("stack1 == stack2: " + (stack1 == stack2));

        stack1.pop();
        System.out.println("" + stack1 + stack2);
    }
}

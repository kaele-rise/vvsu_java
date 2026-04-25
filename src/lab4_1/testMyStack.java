package lab4_1;

public class testMyStack {
    public static void main(String[] args) {
        MyStack strStack = new MyStack();
        strStack.push("adc");
        strStack.push("xyz");
        strStack.push("def");

        System.out.println(strStack);

        strStack.sort();
        System.out.println(strStack);

        ComparableStaff worker1 = new ComparableStaff("Mike", 1);
        ComparableStaff worker2 = new ComparableStaff("Sean", 3);
        ComparableStaff worker3 = new ComparableStaff("Daniel", 2);
        ComparableStaff worker4 = new ComparableStaff("Josh", 1);

        MyStack workStack = new MyStack();
        workStack.push(worker2);
        workStack.push(worker1);
        workStack.push(worker4);
        workStack.push(worker3);


        System.out.println(workStack);

        workStack.sort();
        System.out.println(workStack);
    }
}

package lab1;

public class testMyString2 {
    public static void main(String[] args) {
        MyString2 my_arr1 = new MyString2(new char[]{'J', 'a', 'v', 'a'});
        MyString2 my_arr2 = new MyString2(new char[]{'j', 'a', 'v', 'a', '1'});
        MyString2 sub1 = my_arr1.substring(2);
        System.out.println(my_arr1);
        System.out.println("" + sub1);

        MyString2 sub2 = my_arr2.substring(1, 2);
        System.out.println(my_arr2);
        System.out.println("" + sub2);

        System.out.println(my_arr1.equals(my_arr2));

        System.out.println(my_arr1.compareTo(my_arr2));

        System.out.println(MyString2.valueOf(true));
    }
}

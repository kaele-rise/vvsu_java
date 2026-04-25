package lab5;

public class testComparableDate {
    public static Comparable[] maxAndMin(Comparable[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Нужно хотя бы 2 элемента");
        }

        Comparable max = array[0];
        Comparable min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
            if (array[i].compareTo(min) < 0) {
                min = array[i];
            }
        }

        return new Comparable[]{max, min};
    }

    public static void main(String[] args) {
        Integer[] nums = {5, 2, 3, 1, 4};
        Comparable[] resNum = maxAndMin(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ", ");
        }
        System.out.println("");
        System.out.println(resNum[0] + ", " + resNum[1]);


        ComparableDate[] dates = {
                new ComparableDate(15, 5, 2006),
                new ComparableDate(2, 6, 2001),
                new ComparableDate(11, 5, 2006),
                new ComparableDate(12, 12, 1999),
                new ComparableDate(20, 2, 2007),
        };
        for (int i = 0; i < dates.length; i++) {
            System.out.print(dates[i] + ", ");
        }

        Comparable[] resDate = maxAndMin(dates);
        System.out.println("");
        System.out.println(resDate[0] + ", " + resDate[1]);
    }
}

package lab4_1;

public class ComparableStaff implements Comparable<ComparableStaff>  {
    String name;
    public int experience;

    public ComparableStaff() {
        name = "worker";
        experience = 0;
    }

    public ComparableStaff(String name_, int experience_) {
        name = name_;
        experience = experience_;
    }

    public int compareTo(ComparableStaff s) {

        return experience - s.experience;
    }

    public String toString() {
        return "" + name + ": " + experience;
    }

}

package lab5;

public class ComparableDate implements Comparable<ComparableDate> {
    int year;
    int month;
    int day;

    public ComparableDate(int day_, int month_, int year_) {
        if ((month_ <= 12) & (day <= 31)) {
            year = year_;
            month = month_;
            day = day_;
        } else {
            year = 1970;
            month = 1;
            day = 1;
        }
    }

    public ComparableDate() {
        year = 1970;
        month = 1;
        day = 1;
    }

    @Override
    public int compareTo(ComparableDate date) {
        if (date.year != year) {
            return year - date.year;
        }
        if (date.month != month) {
            return month - date.month;
        }

        return day - date.day;
    }

    @Override
    public String toString() {
        return "" + day + "." + month + "." + year;
    }
}

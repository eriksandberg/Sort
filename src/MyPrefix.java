/**
 * User: Erik
 * Date: 2018-04-17
 * A class implementing a comparable, printable data type
 */

public class MyPrefix implements Comparable {

    public MyPrefix(Prefix prefix) {
        this.prefix = prefix;

        /*switch (this.prefix) {
            case FEMTO:
                break;
            case PICO:
                break;
            case NANO:
                break;
            case MICRO:
                break;
            case MILLI:
                break;
            case CENTI:
                break;
            case DECI:
                break;
        }*/
    }

    private Prefix prefix;

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || other.getClass() != this.getClass()) return false;

        MyPrefix o = (MyPrefix) other;
        if(this.prefix.getId() == o.prefix.getId()) return true;

        return false;
    }

    @Override
    public int compareTo(Object other) {
        if (this.equals(other)) return 0;

        MyPrefix o = (MyPrefix) other;
        if (this.prefix.getId() > o.prefix.getId()) {
            return 1;
        } else {
            return -1;
        }
    }

    // For printing
    @Override
    public String toString() {
        return this.prefix.toString();
    }

    public Prefix getPrefix() {
        return prefix;
    }
}

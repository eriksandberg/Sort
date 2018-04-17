/**
 * User: Erik
 * Date: 2018-04-17
 */

public enum Prefix {
    FEMTO (0), PICO (1), NANO (2), MICRO (3),
    MILLI (4), CENTI (5), DECI (6), UNKNOWN (7);

    private final int id;

    Prefix(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}

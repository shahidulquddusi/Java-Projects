public enum SchoolGrade {

    A(90, 100),
    B(80, 90),
    C(70, 80),
    D(60, 70),
    E(50, 60),
    F(0, 50);

    private final int minRange;
    private final int maxRange;

    SchoolGrade(int minRange, int maxRange) {
        this.minRange = minRange;
        this.maxRange = maxRange;
    }

    public boolean isInRange(int score){
        return score >= minRange && score <= maxRange;
    }

    /**
     * A simple method that calculates {@code grade} based on
     * range of numbers and returns {@code String} values for grades.
     * <br><br>
     *
     * @param studentScore
     * @return <span style="color: #6198d4;">{@code String}</span>
     */
    public static String getGrade(int studentScore) {
        String res;
        if (SchoolGrade.A.isInRange(studentScore)){
            res = SchoolGrade.A.name();
        } else if (SchoolGrade.B.isInRange(studentScore)){
            res = SchoolGrade.B.name();
        } else if (SchoolGrade.C.isInRange(studentScore)){
            res = SchoolGrade.C.name();
        } else if (SchoolGrade.D.isInRange(studentScore)){
            res = SchoolGrade.D.name();
        } else if (SchoolGrade.E.isInRange(studentScore)){
            res = SchoolGrade.E.name();
        } else if (SchoolGrade.F.isInRange(studentScore)){
            res = SchoolGrade.F.name();
        } else {
            res = "Number not between 0 and 100";
        }
        return res;
    }
}

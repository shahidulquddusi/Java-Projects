public class Main {

    public static void main(String[] args) {

        String dollyGrade = SchoolGrade.getGrade(75);
        String mollyGrade = SchoolGrade.getGrade(65);
        String pollyGrade = SchoolGrade.getGrade(85);
        String mishaGrade = SchoolGrade.getGrade(55);
        String bishopGrade = SchoolGrade.getGrade(88);
        String nishiGrade = SchoolGrade.getGrade(82);

        System.out.printf("""
                        Dolly got: %s
                        Molly got: %s
                        Polly got: %s
                        Misha got: %s
                        Bishop got: %s
                        Nishi got: %s
                        """,
                dollyGrade, mollyGrade, pollyGrade, mishaGrade, bishopGrade, nishiGrade);
/*
        Output:
        Dolly got: C
        Molly got: D
        Polly got: B
        Misha got: E
        Bishop got: B
        Nishi got: B
*/
    }
}
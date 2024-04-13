public class SignExtend {
    public static String extend(String reg) {
        String s = "000000000000";
        s += reg;
        return s;
    }
}

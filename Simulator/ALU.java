public class ALU {
    
    public static String add(String reg1, String reg2) {
        return addBinary(Registers.read(reg1), Registers.read(reg2));
    }
    public static String or(String reg1, String reg2) {
        return BitwiseOr(Registers.read(reg1), Registers.read(reg2));
    }
    public static String and(String reg1, String reg2) {
        return BitwiseAnd(Registers.read(reg1), Registers.read(reg2));
    }
    public static String li(String reg) {
        return reg;
    }
    public static String lw(String reg1, String reg2) {
        return add(Registers.read(reg1), Registers.read(reg2));
    }
    public static String lwr(String reg1, String reg2) {
        return add(Registers.read(reg1), Registers.read(reg2));
    }
    public static String swr(String reg1, String reg2) {
        return add(Registers.read(reg1), Registers.read(reg2));
    }
    public static String sw(String reg1, String reg2) {
        return add(Registers.read(reg1), Registers.read(reg2));
    }
    public static String BitwiseOr(String reg1, String reg2) {
        String s = "";
        //System.out.println("OR: " + reg1 + "\nreg2: " + reg2 );
        for(int i = 0; i < reg1.length(); i++) {
            if(reg1.charAt(i) == '1' || reg2.charAt(i) == '1') {
                s += 1;
            }
            else {
                s += 0;
            }
        }
        //System.out.println("S: " + s);
        return s;
    } 
    public static String BitwiseAnd(String reg1, String reg2) {
        String s = "";
        for(int i = 0; i < reg1.length(); i++) {
            if(reg1.charAt(i) == '1' && reg2.charAt(i) == '1') {
                s += 1;
            }
            else {
                s += 0;
            }
        }
        return s;
    }

    public static String addBinary(String s1, String s2) {
        //System.out.println("ADDBINARYs1 s2: " + s1 + " " + s2);
        return addDecimalToBinary(binaryToDecimal(s1), binaryToDecimal(s2));
    }

    public static int binaryToDecimal(String s) {
        int sum = 0;
        int j = 0;
        for(int i = s.length()-1; i >= 0; i--) {
            sum += Integer.parseInt("" + s.charAt(i)) * Math.pow(2, j);
           /// System.out.println("Char " + s.charAt(i));
            j++;
        }
        //System.out.println("sum " + sum);
        return sum;
    }
    public static String addDecimalToBinary(int a, int b) {
        int sum = a + b;
        return Integer.toBinaryString(sum + 0b10000).substring(1);
    }
}

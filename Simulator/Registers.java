import java.util.Scanner;
import java.io.*;

public class Registers {
    static String $R0 = "0000000000000000";
    static String $R1 = "0000000000000000";
    static String $R2 = "0000000000000000";
    static String $R3 = "0000000000000000";
    static String $R4 = "0000000000000000";
    static String $R5 = "0000000000000000";
    static  String $R6 = "0000000000000000";
    static String $R7 = "0000000000000000";


public static String read(String reg) {
    if(reg.equals("000")) {
        return $R0;
    }   
    else if(reg.equals("001")) {
        return $R1;
    }
    else if(reg.equals("010")) {
        return $R2;
    }
    else if(reg.equals("011")) {
        return $R3;
    }
    else if(reg.equals("100")) {
        return $R4;
    }
    else if(reg.equals("101")) {
        return $R5;
    }
    else if(reg.equals("110")) {
        return $R6;
    }
    else {
        return $R7;
    }
    
}
public static void Display(String reg) {
    System.out.println(read(reg));
}
public static void write(String data, String reg) {
    if(reg.equals("000")) {
        $R0 = data;
    }   
    else if(reg.equals("001")) {
        $R1 = data;
    }
    else if(reg.equals("010")) {
        $R2 = data;
    }
    else if(reg.equals("011")) {
        $R3 = data;
    }
    else if(reg.equals("100")) {
        $R4 = data;;
    }
    else if(reg.equals("101")) {
        $R5 = data;
    }
    else if(reg.equals("110")) {
        $R6 = data;
    }
    else {
        $R7 = data;
    }
}
}
import java.util.Scanner;
import java.io.*;

public class InstructionMemory {
    // Scanner scan = new Scanner("MachineCode.txt");
    // String MachineCode = scan.nextLine();
    static String OpCode;
    static String reg1;
    static String reg2;
    static String reg3;
    static String address;
    static String instruction;

    public static String getNextInstruction(int start) throws IOException {
       File f = new File("MachineCode.txt");
       Scanner scan = new Scanner(f);
       if(!scan.hasNextLine()) {
        return "";
       }
       String MachineCode = scan.nextLine();
       String instruction = MachineCode.substring(start, start+16);
       OpCode = instruction.substring(0, 3);
        reg1 = instruction.substring(3, 6);
        reg2 = instruction.substring(6, 9);
        reg3 = instruction.substring(9, 12);
        address = instruction.substring(12, 16);
       Control.main();
        return instruction;
    }
}




















































































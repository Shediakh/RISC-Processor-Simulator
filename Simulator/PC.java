import java.util.Scanner;
import java.io.*;
public class PC {
    public static int instructionStart = -16;
    public static int getNextInstructionStart() throws IOException{
        instructionStart += 16;
        InstructionMemory.getNextInstruction(instructionStart);
        return instructionStart;
    } 
        
    }


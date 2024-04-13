import java.io.*;

public class Control {
    public static void main() throws IOException {
        int RegDst;
        int MemRead;
        int MemToReg;
        String AluOp;
        int MemWrite;
        int AluSrc;
        int RegWrite;
        AluOp = InstructionMemory.OpCode;
        if(AluOp.equals("000")) {
            RegDst = 1;
            MemRead = 0;
            MemToReg = 0;
            AluOp = "add";
            MemWrite = 0;
            AluSrc = 0;
            RegWrite = 1;
            Registers.write(ALU.add(InstructionMemory.reg1, InstructionMemory.reg2),InstructionMemory.reg3);
            System.out.println("After doing add operation, destination register contains: ");
            Registers.Display(InstructionMemory.reg3);
        }
        else if(AluOp.equals("001")) {
            RegDst = 1;
            MemRead = 0;
            MemToReg = 0;
            AluOp = "and";
            MemWrite = 0;
            AluSrc = 0;
            RegWrite = 1;
            Registers.write(ALU.and(InstructionMemory.reg1, InstructionMemory.reg2),InstructionMemory.reg3);
            System.out.println("After doing and operation, destination register contains: ");
            Registers.Display(InstructionMemory.reg3);
        }
        else if(AluOp.equals("010")) {
            RegDst = 1;
            MemRead = 0;
            MemToReg = 0;
            AluOp = "or";
            MemWrite = 0;
            AluSrc = 0;
            RegWrite = 1;
            Registers.write(ALU.or(InstructionMemory.reg1, InstructionMemory.reg2),InstructionMemory.reg3);
            System.out.println("After doing or operation, destination register contains: ");
            Registers.Display(InstructionMemory.reg3);
        }
        else if(AluOp.equals("011")) {
            RegDst = 1;
            MemRead = 0;
            MemToReg = 1;
            AluOp = "li";
            MemWrite = 1;
            AluSrc = 1;
            RegWrite = 1;
            Registers.write(ALU.li(InstructionMemory.address), ALU.li(InstructionMemory.reg3));
            System.out.println("After doing li operation, destination register contains: ");
            Registers.Display(InstructionMemory.reg3);
        }
        else if(AluOp.equals("100")) {
            RegDst = 1;
            MemRead = 0;
            MemToReg = 1;
            AluOp = "lw";
            MemWrite = 0;
            AluSrc = 0;
            RegWrite = 1;
            Registers.write(ALU.add(InstructionMemory.reg1,InstructionMemory.address), InstructionMemory.reg3);
            System.out.println("After doing lw operation, destination register contains: ");
            Registers.Display(InstructionMemory.reg3);
        }
        else if(AluOp.equals("101")) {
            RegDst = 1;
            MemRead = 0;
            MemToReg = 0;
            AluOp = "sw";
            MemWrite = 1;
            AluSrc = 1;
            RegWrite = 0;
            Registers.write(ALU.add(InstructionMemory.reg1,InstructionMemory.address), InstructionMemory.reg3);
        }
        else if(AluOp.equals("110")) {
            RegDst = 1;
            MemRead = 0;
            MemToReg = 0;
            AluOp = "swr";
            MemWrite = 1;
            AluSrc = 0;
            RegWrite = 0;
        }
        else if(AluOp.equals("111")) {
            RegDst = 1;
            MemRead = 0;
            MemToReg = 1;
            AluOp = "lwr";
            MemWrite = 0;
            AluSrc = 1;
            RegWrite = 1;
        }
        
    }
        
}

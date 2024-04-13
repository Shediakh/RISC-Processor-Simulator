import java.util.Scanner;
import java.io.*;
public class Assembler {
    public static void main(String[] args) throws IOException{
        //The Assembler will turn the assembly code into a binary string
        File f = new File("../InputCode.txt");
        Scanner scan = new Scanner(f);
        int instructionCount = 0;
        //We must include the file name as the first line
        FileWriter fw = new FileWriter("../OutputMachineCode.txt");
        while(scan.hasNextLine()) {
            //seperating instruction part by comma
            //Example: Add, $R0, $R1, $R2 => ["Add", "$R0", "$R1", "$R2"]
            String binaryString = "";
            String[] line = scan.nextLine().trim().split(",");
            //We will use # for commnets, if the line string starts with # it will skip to the next line
            if(line.length == 0 || line[0].charAt(0) == '#') {
                continue;
            }
            //Removing spaces from line string
            for(int i = 0; i < line.length; i++) {
                line[i] = line[i].trim();
            }
            instructionCount++;
            if(line[0].toLowerCase().equals("add")) {
                //Op code
                binaryString += "000";
                //Source 1, 2 and destination
                binaryString += getRegisterBinary(line[1]) + getRegisterBinary(line[2]) + getRegisterBinary(line[3]);
                //Address
                binaryString += "0000";
            }
            else if(line[0].toLowerCase().equals("and")) {
                //Op code
                binaryString += "001";
                //Source 1, 2 and destination
                binaryString += getRegisterBinary(line[1]) + getRegisterBinary(line[2]) + getRegisterBinary(line[3]);
                //Address
                binaryString += "0000";
            }
            else if(line[0].toLowerCase().equals("or")) {
                //Op code
                binaryString += "010";
                //Source 1, 2 and destination
                binaryString += getRegisterBinary(line[1]) + getRegisterBinary(line[2]) + getRegisterBinary(line[3]);
                //Address
                binaryString += "0000";
            }
            else if(line[0].toLowerCase().equals("li")) {
                //Op code
                binaryString += "011";
                //Source 1 and 2 are empty
                binaryString += "000000";
                //Destination
                binaryString += getRegisterBinary(line[1]);
                //We add the value in binary to the address
                binaryString += Integer.toBinaryString(Integer.parseInt(line[2]) + 0b10000).substring(1);
            }
            else if(line[0].toLowerCase().equals("lw")) {
                //Op code
                binaryString += "100";
                //Source 1
                binaryString += getRegisterBinary(line[1]);
                //Source 2 is empty
                binaryString += "000";
                //Destination
                binaryString += getRegisterBinary(line[2]);
                //Address
                binaryString +=  Integer.toBinaryString(Integer.parseInt(line[3])+ 0b10000).substring(1);
            }
            else if(line[0].toLowerCase().equals("sw")) {
                //Op code
                binaryString += "101";
                //Source 1
                binaryString += getRegisterBinary(line[1]);
                //Source 2 is empty
                binaryString += "000";
                //Destination
                binaryString += getRegisterBinary(line[2]);
                //Address
                binaryString +=  Integer.toBinaryString(Integer.parseInt(line[3])+ 0b10000).substring(1);
                
            }
            else if(line[0].toLowerCase().equals("swr")) {
                //Op code
                binaryString += "110";
                //Source 1, 2 and destination
                binaryString += getRegisterBinary(line[1]) + getRegisterBinary(line[2]) + getRegisterBinary(line[3]);
            }
            else if(line[0].toLowerCase().equals("lwr")) {
                binaryString += "111";
                binaryString += getRegisterBinary(line[1]) + getRegisterBinary(line[2]) + getRegisterBinary(line[3]);
            }

            fw.write(binaryString);
        }
        fw.close();
        System.out.println("MachineCode.txt has been Assembled!");
        for(int i = 0; i < instructionCount; i++) {
            PC.getNextInstructionStart();
        }
    }
    public static String getRegisterBinary(String Register) {
        String out = "";
        if(Register.equals("$R0")) {
            out = "000";
        }
        else if(Register.equals("$R1")) {
            out = "001";
        }
        else if(Register.equals("$R2")) {
            out = "010";
        }
        else if(Register.equals("$R3")) {
            out = "011";
        }
        else if(Register.equals("$R4")) {
            out = "100";
        }
        else if(Register.equals("$R5")) {
            out = "101";
        }
        else if(Register.equals("$R6")) {
            out = "110";
        }
        else if(Register.equals("$R7")) {
            out = "111";
        }
        return out;
    }
}
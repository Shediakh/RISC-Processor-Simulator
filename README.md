# RISC-Processor-simulation
# RISC Processor Simulator

This RISC Processor Simulator is a tool designed to simulate the behavior of a RISC (Reduced Instruction Set Computing) processor. It allows users to understand and experiment with the execution of instructions commonly found in RISC architectures.


## Instructions for Usage

1. **Setup**: Clone the repository to your local machine.
2. **Input**: Under `InputCode.txt` write your code and save it
3. **Compile & Run**: Compile and run  the assembler under `/Simulator/Assembler.java`
4. **Output**: The simulator will display the result (value at the destination register) of each operation as well as the instructions in machine code.


## Sample Input (InputCode.txt)
```TCL
#This is a comment
#Value of 1 store in register $R0
li, $R0, 1
#Value of 2 stored in register $R1
li, $R1, 2
#Addition between $R0 and $R1 stored in $R2
add, $R0, $R1, $R2
#Bitwise or between $R0 and $R1, stored in $R3
or, $R0, $R1, $R3
#Bitwise and between $R0 and $R1, stored in $R4
and, $R0, $R1, $R4
```
## Sample Output

![image](https://github.com/Shediakh/RISC-Processor-simulation/assets/63234452/d20e96af-c666-4ef7-9bc4-60d2a1129c1a)
#### OutputMachineCode.txt
```plaintext
01100000000000010110000000010010000000001010000001000000101100000010000011000000
```
## Instruction Set Architecture Overview

#### Instruction Memory Word Size
| Field            | Size (bits) |
|------------------|-------------|
| Operation code   | 3           |
| Register (Rs)    | 3           |
| Register (Rt)    | 3           |
| Register (Rd)    | 3           |
| Address          | 4           |

#### Register and Memory Word Size
| Entity           | Size (bits) |
|------------------|-------------|
| Register         | 3           |
| Memory word      | 16          |

#### Instruction Structure
| Field            | Size (bits) | Range  |
|------------------|-------------|--------|
| Op code          | 3           | 0:2    |
| Source Register 1| 3           | 3:5    |
| Source Register 2| 3           | 6:8    |
| Destination Reg. | 3           | 9:11   |
| Address          | 4           | 12:15  |

#### Syntax and Corresponding Opcode
| Operation | Syntax                               | Opcode |
|-----------|--------------------------------------|--------|
| Add       | Add Source1, Source2, Destination   | 000    |
| And       | And Source1, Source2, Destination   | 001    |
| Or        | Or Source1, Source2, Destination    | 010    |
| Li        | Li Destination, Constant            | 011    |
| Lw        | Lw Source, Destination, Offset     | 100    |
| Sw        | Sw Source, Destination, Offset     | 101    |
| Swr       | Swr Source1, Destination, Source2  | 110    |
| Lwr       | Lwr Source1, Destination, Source2  | 111    |

#### Unique Register Identifiers
| Register | Unique Identifier |
|----------|-------------------|
| $R0      | 000               |
| $R1      | 001               |
| $R2      | 010               |
| $R3      | 011               |
| $R4      | 100               |
| $R5      | 101               |
| $R6      | 110               |
| $R7      | 111               |



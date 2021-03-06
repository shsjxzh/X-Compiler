package shsjxzh.compiler.IR;
import shsjxzh.compiler.IR.Instruction.*;
import shsjxzh.compiler.IR.Value.*;


public interface IRVisitor {
    //string will be handled later
    
    //fundamental
    void visit(IRRoot node);        //with static data and functions
    void visit(BasicBlock node);
    void visit(Function node);

    //instruction
    //Arithmetic
    void visit(Binary node);         //Add, Sub, Mul, Div, Mod, Shl, Shr, And(bitwise), Or(bitwise), Xor
    void visit(Unary node);          //Neg, Not(bitwise)
    void visit(IntCompare node);     //EQ, NE, GT, GE, LT, LE
    void visit(Inc node);
    void visit(Dec node);
    //Control
    void visit(Jump node);
    void visit(Branch node);
    void visit(Return node);
    //Other
    void visit(Call node);
    void visit(HeapAllocate node);
    //data move
    void visit(Move node);
    void visit(Load node);
    void visit(Store node);
    
    //Value
    void visit(IntImme node);
    void visit(VirtualRegister node);
    void visit(PhysicalRegister node);
    void visit(StaticSpace node);        //static space will be given a register later
    void visit(StaticString node);
}

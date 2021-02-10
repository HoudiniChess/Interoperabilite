import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class SimpleStackInterpreterTest
{

  @Test
  void test()
  {
    Expr e = new IntExpr(9);
    SimpleStackInterpreter interpreter = new SimpleStackInterpreter();
    e.accept(interpreter);
    assertTrue(interpreter.result() instanceof IntExpr);
    IntExpr ie = (IntExpr) interpreter.result();
    assertTrue(ie.getVal() == 9);
    Expr e1 = new IntExpr(9);
    Expr mult1 = new MultExpr(e, e1);
    mult1.accept(interpreter);
    assertTrue(interpreter.result() instanceof IntExpr);
    ie = (IntExpr) interpreter.result();
    assertTrue(ie.getVal() == 81);
    Expr plus1 = new PlusExpr(e, e1);
    plus1.accept(interpreter);
    assertTrue(interpreter.result() instanceof IntExpr);
    ie = (IntExpr) interpreter.result();
    assertTrue(ie.getVal() == 18);
  }

}

import java.util.Stack;

// Principe : 
// Pour un calcul les arguments sont récupérés dans la pile
//	- par pour un +, les opg et opd sont dépilé
// Quand le calcul est effectué, on empile le résultat
// Le parcous se fait en profondeur à gauche d'abord
// Le résultat courant est toujours en tête de pile
// A la fin du calcul d'une expression complete, la pile ne contient qu'un seul element, le résultat
//
// en entrée j'ai l'entier 9, le résultat est 9
// - le résultat du calcul pour une expression unaire est l'expression unaire elle-même

public class SimpleStackInterpreter extends Visitor
{
  Stack<Expr> stk;

  public SimpleStackInterpreter()
  {
    stk = new Stack<Expr>();
  }

  @Override
  public void visitIntExpr(IntExpr intExpr)
  {
    stk.push(intExpr);
  }

  @Override
  public void visitMultExpr(MultExpr multExpr)
  {
    multExpr.getOpg().accept(this);
    multExpr.getOpd().accept(this);
    IntExpr ied = (IntExpr) stk.pop();
    IntExpr ieg = (IntExpr) stk.pop();
    stk.push(new IntExpr(ied.getVal() * ieg.getVal()));
  }

  @Override
  public void visitPlusExpr(PlusExpr plusExpr)
  {
    plusExpr.getOpg().accept(this);
    plusExpr.getOpd().accept(this);
    IntExpr ied = (IntExpr) stk.pop();
    IntExpr ieg = (IntExpr) stk.pop();
    stk.push(new IntExpr(ied.getVal() + ieg.getVal()));
  }

  public Expr result()
  {
    return stk.peek();
  }

}

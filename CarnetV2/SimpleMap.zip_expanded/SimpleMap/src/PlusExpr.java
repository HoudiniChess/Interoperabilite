
public class PlusExpr extends BinExpr
{
  Expr opg;
  Expr opd;

  public PlusExpr(Expr opg, Expr opd)
  {
    super(opg, opd);
  }

  @Override
  public void accept(Visitor v)
  {
    v.visitPlusExpr(this);

  }

}


package javalub2;

public class Mouse implements ComputerrPart{

    @Override
   public void accept(ComputerPartVisitor computerPartVisitor){
      computerPartVisitor.visit(this);
   }
}

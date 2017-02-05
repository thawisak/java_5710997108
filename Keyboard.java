
package javalub2;

public class Keyboard implements ComputerrPart{
   
   public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}

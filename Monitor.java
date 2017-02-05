
package javalub2;


public class Monitor implements ComputerrPart {

   
   public void accept(ComputerPartVisitor computerPartVisitor) {
      computerPartVisitor.visit(this);
   }
}

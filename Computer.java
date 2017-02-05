
package javalub2;


public class Computer implements ComputerrPart {
    ComputerrPart[] parts;

   public Computer(){
      parts = new ComputerrPart[] {new Mouse(), new Keyboard(), new Monitor()};		
   } 

   @Override
   public void accept(ComputerPartVisitor computerPartVisitor) {
      for (int i = 0; i < parts.length; i++) {
         parts[i].accept(computerPartVisitor);
      }
      computerPartVisitor.visit(this);
   }
}

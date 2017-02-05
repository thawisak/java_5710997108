
package javalub2;


public class VisitorPatternDemo {
    public static void main(String[] args) {

      ComputerrPart computer = new Computer();
      computer.accept(new ComputerPartDisplayVisitor());
   }
}

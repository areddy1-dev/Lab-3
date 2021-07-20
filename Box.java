
public class Box {
		int size = 0;

	public Box() {} // method with no parameters and void return type

	public static void main(String[] args) {
		Box objBox = new Box();  //Box object created
	    objBox.size = 5;
		objBox.printBox();			
		}
		public void printBox() {
		for (int coloumn = 1; coloumn <= size; coloumn++) {
		for (int star = 1; star <= coloumn; star++) {
		System.out.print("*");
	    }
		System.out.println();
	}
  }

}


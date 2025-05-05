package dp_composite_file;

public class Main {

	public static void main(String[] args) {
		TreeFactory treeFactory = new TreeFactory();
		
		// Creating Test data...
		// The tree with directories and files. 
		Component tree = treeFactory.createTree();	
		
		// write's out the tree
		tree.showDetail(0);
		
		System.out.println("***************************************************************");
		
		Component comp1 = tree.findComponentByName("VACATION_CANARIEN");
		System.out.println("Componenta: " + comp1.getComponentName());
		comp1.showDetail(0);
		System.out.println("Size of folder canarien: " + comp1.getComponentSize());
		
		Component comp2 = tree.findComponentByName("picCroatia-2.jpg");
		System.out.println("Componenta 2: " + comp2.getComponentName());
		comp2.showDetail(0);
	}

}

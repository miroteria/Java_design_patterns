package dp_composite_file;

public class Main {

	public static void main(String[] args) {
		TreeFactory treeFactory = new TreeFactory();
		
		// Test data...
		// Creating test tree with directories and files. 
		FileComponent tree = treeFactory.createTree();			
		tree.showTree();
		
		System.out.println("***************************************************************");
		
		FileComponent comp1 = tree.getComponentByName("VACATION_CANARIEN");
		System.out.println("Componenta: " + comp1.getFileName());
		comp1.showTree();
		System.out.println("Size of folder canarien: " + comp1.getFileSize());
		
		FileComponent comp2 = tree.getComponentByName("picCroatia-2.jpg");
		System.out.println("Componenta 2: " + comp2.getFileName());
	}

}

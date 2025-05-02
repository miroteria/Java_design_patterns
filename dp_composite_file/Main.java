package design_patterns.dp_composite_file;

public class Main {

	public static void main(String[] args) {
		TreeFactory treeFactory = new TreeFactory();
		FileComponent tree = treeFactory.createTree();
						
		tree.showTree();
		
		System.out.println("***************************************************************");
		
		FileComponent comp1 = treeFactory.getComponentByName("VACATION_CANARIEN");
		System.out.println("Componenta: " + comp1.getFileName());
	}

}

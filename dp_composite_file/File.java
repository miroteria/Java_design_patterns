package dp_composite_file;

public class File implements Component {
	final String type = "FILE";
	
	private int treeLevel = 0;
	private String name;
	private int size;
	
	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}
		
	@Override
	public String getComponentName() {
		return this.name;
	}

	@Override
	public int getComponentSize() {
		return this.size;
	}
	
	
	/*
	 * This method write's out the name of component
	 * 
	 * Is used recursion - look at this method in class Directory and you will get it.
	 * 
	 * Parameter treeLevel is used just for indentation of text by output
	 * 
	 */
	@Override
	public void showDetail(int treeLevel) {
		this.treeLevel = treeLevel;
		System.out.println(this.getSpace() + this.type + ": " + this.name);
		
	}

	@Override
	public String getComponentType() {
		return this.type;
	}


	public void setTreeLevel(int treeLevel) {
		this.treeLevel = treeLevel;	
	}
	
	public int getTreeLevel() {
		return treeLevel;
	}
	
	private String getSpace() {
		String space = "";
		for (int i = 0; i < this.treeLevel; i++) {
			space += "    ";
		}
		return space;
	}

	
	/*
	 * This method is used to find out in the tree the component by the name
	 * 
	 * If the name of component is equal to the name we are looking for, than is returned
	 * this component otherwise is returned null
	 * 
	 * look on this method insede Directory class and you will get it 
	 * 
	 * Is used in recursion 
	 */
	@Override
	public Component findComponentByName(String name) {
		if (this.name.equals(name)) {
			return this;
		} else {
			return null;
		}
	}
	
}

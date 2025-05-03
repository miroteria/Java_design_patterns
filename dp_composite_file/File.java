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

	@Override
	public void showDetail() {
		System.out.println(this.getSpace() + this.type + ": " + this.name);
		
	}

	@Override
	public String getComponentType() {
		return this.type;
	}

	@Override
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

	@Override
	public Component getComponentByName(String name) {
		if (this.name.equals(name)) {
			return this;
		} else {
			return null;
		}
	}
	
}

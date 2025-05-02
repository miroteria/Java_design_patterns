package design_patterns.dp_composite_file;

public class File implements FileComponent {
	final String type = "FILE";
	private int treeLevel = 0;
	private String name;
	private int size;
	
	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}
		
	@Override
	public String getFileName() {
		return this.name;
	}

	@Override
	public int getFileSize() {
		return this.size;
	}

	@Override
	public void showTree() {
		System.out.println(this.getSpace() + this.type + ": " + this.name);
		
	}

	@Override
	public String getType() {
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
	public FileComponent getComponentByName(String name) {
		if (this.name.equals(name)) {
			return this;
		} else {
			return null;
		}
	}
	
}

package dp_composite_file;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileComponent {
	final String type = "DIR";
	
	private String name;
	private int size = 0;
	private int treeLevel = 0;
	private List<FileComponent> components = new ArrayList<>();
	
	public Directory(String name) {
		this.name = name;
	}
	
	public void addComponent(FileComponent component) {
		this.components.add(component);
	}
	
	public void removeComponent(FileComponent component) {
		this.components.remove(component);
	}
	
	@Override
	public String getFileName() {
		return this.name;
	}

	@Override
	public int getFileSize() {
		int size = 0;
		for (FileComponent comp : this.components) {
			size += comp.getFileSize();
		}
		return size;
	}

	@Override
	public void showTree() {
		System.out.println(this.getSpace() + this.type + ": " + this.name);
		this.components.forEach(component -> 
							{
								component.setTreeLevel(this.treeLevel + 1);
								component.showTree();
							});
	}

	@Override
	public String getType() {
		return this.type;
	}
	
	public int getTreeLevel() {
		return treeLevel;
	}

	@Override
	public void setTreeLevel(int treeLevel) {
		this.treeLevel = treeLevel;
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
		FileComponent c = null;
		for (FileComponent comp : this.components) {
			//System.out.println("Comp name: " + comp.getFileName());
			if (comp.getFileName().equals(name) ) {
				return comp;
			} else {
				c = comp.getComponentByName(name);
				if (c != null) {
					break;
				}
			}
		}
		
		return c;
	}

	public List<FileComponent> getComponents() {
		return components;
	}
	
}

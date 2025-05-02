package design_patterns.dp_composite_file;

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
		return this.size;
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
		// TODO Auto-generated method stub
		return null;
	}

	public List<FileComponent> getComponents() {
		return components;
	}
	
}

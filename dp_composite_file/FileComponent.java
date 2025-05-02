package dp_composite_file;

public interface FileComponent {
	public String getFileName();
	public String getType();
	public void setTreeLevel(int treeLevel);
	public int getFileSize();
	public void showTree();
}

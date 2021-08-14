
public class Category {
	
	private String name;
	private String description;
	
	public Category(String name, String description) {
		this.name = name;
		this.description = description;
		
	}
	
	public String getCategoryName() {
		return name;
	}
	
	public String getCategoryDesc() {
		return description;
	}
	
	public String toString(){
		String output = "";
		return output;
	}
	
	public void setCategoryName(String name) {
		this.name = name;
	}
	
	public void setCategoryDesc(String description) {
		this.description = description;
	}

}

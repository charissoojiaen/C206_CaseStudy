
public class CCA {
	
	private String title;
	private String description;
	private int classSize;
	private String dayOfWeek;
	private String time;
	private String venue;
	private String instrcInCharge;
	private String category;
	
	public CCA(String title, String description, int classSize, String dayOfWeek, String time, String venue,
			String instrcInCharge, String category) {
		this.title = title;
		this.description = description;
		this.classSize = classSize;
		this.dayOfWeek = dayOfWeek;
		this.time = time;
		this.venue = venue;
		this.instrcInCharge = instrcInCharge;
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getClassSize() {
		return classSize;
	}

	public void setClassSize(int classSize) {
		this.classSize = classSize;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getVenue() {
		return venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}

	public String getInstrcInCharge() {
		return instrcInCharge;
	}

	public void setInstrcInCharge(String instrcInCharge) {
		this.instrcInCharge = instrcInCharge;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	

}


class Book {
	private int pages;
	public String name;
	private float weight;
 
	public void getInfoBook () {
		System.out.print("У книзі " + name + " знаходиться " + pages + " сторінок. ");
		System.out.print("При цьому вона важить " + weight + "кг!");
		System.out.println("");
	} 

	Book (int pages, float weight) {
		this.pages = pages;
		this.weight = weight;
	}
 
	Book (int pages, float weight, String name) {
		this.pages = pages;
		this.weight = weight;
		this.name = name;
	}
}
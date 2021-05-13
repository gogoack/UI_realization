package spms.vo;

public class User {
	
	protected int id;
	protected String name;
	protected String dog_breed;
	protected String gender ;
	protected int age;
	protected String medical_history;
	protected String discovery_place ;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDog_breed() {
		return dog_breed;
	}
	public void setDog_breed(String dog_breed) {
		this.dog_breed = dog_breed;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMedical_history() {
		return medical_history;
	}
	public void setMedical_history(String medical_history) {
		this.medical_history = medical_history;
	}
	public String getDiscovery_place() {
		return discovery_place;
	}
	public void setDiscovery_place(String discovery_place) {
		this.discovery_place = discovery_place;
	}
	
	
}

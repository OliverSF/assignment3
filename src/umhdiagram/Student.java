/*
 * Oliver Faherty
 * ID: 16102532
 * CT874: Programming 1
 */
package umhdiagram;

public class Student {
	
	private String name; //creating private string called name
	private long IDnumber; //creating private long called IDnumber
	
	//creating default constructor
	public Student() {
		name = "";
		IDnumber = 0;
	}
	public Student(String name) {
		this(name,0);
	}
	public Student(long IDnumber) {
		this("",IDnumber);
	}
	//Creating constructor
	public Student(String name, long IDnumber) {
		this.name = name;
		this.IDnumber = IDnumber;
	}
	
	//Creating getters for name and IDnumber
	public String getName(){
		return name;
	}
	public long getIDnumber(){
		return IDnumber;
	}
	//Creating setters for name and IDnumber
	public void setName(String name){
		this.name = name;
	}
	public void setIDnumber(long IDnumber){
		this.IDnumber = IDnumber;
	}
	//modifying default toString method
	public String toString(){
		return "Student [Name = " + getName() + ", IDnumber = " + getIDnumber() + "]";
	}
}

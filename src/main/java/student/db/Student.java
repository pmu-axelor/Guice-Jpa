package student.db;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
 
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private int id;
 private String name;
 private String department;
 private String city;



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

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public Student(int id, String name, String department, String city) {
	super();
	this.id = id;
	this.name = name;
	this.department = department;
	this.city = city;
}

public Student() {
	super();
}

}

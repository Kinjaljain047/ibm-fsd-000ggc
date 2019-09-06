package comm.example.spring;

import java.util.Arrays;
import java.util.LinkedHashMap;

import org.springframework.stereotype.Component;
@Component("stu")
public class Student {
	private int id;
private String firstname;
private String lastname;

private String country;

private LinkedHashMap<String, String> countryOptions;

private String favoriteLanguage;
private String[] operatingSystems;

public Student() {
	
	// populate country options: used ISO country code
	countryOptions = new LinkedHashMap<String,String>();
	
	countryOptions.put("BR", "Brazil");
	countryOptions.put("FR", "France");
	countryOptions.put("DE", "Germany");
	countryOptions.put("IN", "India");
	countryOptions.put("US", "United States of America");		

}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public LinkedHashMap<String, String> getCountryOptions() {
	return countryOptions;
}

public String getFavoriteLanguage() {
	return favoriteLanguage;
}

public void setFavoriteLanguage(String favoriteLanguage) {
	this.favoriteLanguage = favoriteLanguage;
}
public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
	this.countryOptions = countryOptions;
}
public String[] getOperatingSystems() {
	return operatingSystems;
}
public void setOperatingSystems(String[] operatingSystems) {
	this.operatingSystems = operatingSystems;
}

public void setOS(String str)
{
	this.setOperatingSystems(str.split(","));
}
@Override
public String toString() {
	return "Student [id=" +id+",firstname=" + firstname + ", lastname=" + lastname + ", country=" + country + ", favoriteLanguage=" + favoriteLanguage + ", operatingSystems="
			+ Arrays.toString(operatingSystems) + "]";
}

}

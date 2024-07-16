package spring.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data

public class User {
	@NotEmpty(message="Please Enter Username")
  private String uname;
	
	@NotEmpty(message="Please Enter Password")
  private String pass;
	
	@NotEmpty(message="Please Enter Email")
	@Email(message="Enter Valid mail id")
  private String mail;
  
	@Size(min=10, max=10 ,message="Check your mobile number")
  private String mno;
  
  @Min(value=18, message="Minor Cant Register")
  private Integer age;

  
  
  public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getMno() {
	return mno;
}
@Override
public String toString() {
	return "User [uname=" + uname + ", pass=" + pass + ", mail=" + mail + ", mno=" + mno + ", age=" + age + "]";
}
public void setMno(String mno) {
	this.mno = mno;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}

  
  

  
  
}

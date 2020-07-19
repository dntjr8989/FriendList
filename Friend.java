
public class Friend {

	private String name;
	private String group;
	private String phonenumber;
	private String email;
	private String picture;
	
	public Friend()
	{
		this.name = null;
		this.group = null;
		this.phonenumber= null;
		this.email = null;
		this.picture = null;
	}
	
	public void print()
	{
		System.out.println(this.name + " " + this.group + " " + this.phonenumber + " " + this.email + " " + this.picture);
	}
	
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name = new String(name);
	}
	
	public String getGroup()
	{
		return this.group;
	}
	public void setGroup(String group)
	{
		this.group = new String(group);
	}
	
	public String getPhonenumber()
	{
		return this.phonenumber;
	}
	public void setPhonenumber(String phonenumber)
	{
		this.phonenumber = new String(phonenumber);
	}
	
	public String getEmail()
	{
		return this.email;
	}
	public void setEmail(String email)
	{
		this.email = new String(email);
	}
	
	public String getPicture()
	{
		return this.picture;
	}
	public void setPicture(String picture)
	{
		this.picture = new String(picture);
	}
}

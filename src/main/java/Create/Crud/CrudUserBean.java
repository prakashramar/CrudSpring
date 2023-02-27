package Create.Crud;

import org.springframework.stereotype.Component;


@Component
public class CrudUserBean 
{
	private String userid;
	private String username;
	private String userdept;
	
	CrudUserBean()
	{
		
	}

	public CrudUserBean(String userid, String username, String userdept) {
		super();
		this.userid = userid;
		this.username = username;
		this.userdept = userdept;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserdept() {
		return userdept;
	}

	public void setUserdept(String userdept) {
		this.userdept = userdept;
	}

	@Override
	public String toString() {
		return "CrudUserBean [userid=" + userid + ", username=" + username + ", userdept=" + userdept + "]";
	}
	

	
}

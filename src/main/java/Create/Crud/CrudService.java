package Create.Crud;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class CrudService 
{
	@Autowired
	static List<CrudUserBean> userList=new ArrayList<CrudUserBean>();
	
	static 
	{
		userList.add(new CrudUserBean("11","Prakash","ECE"));
		userList.add(new CrudUserBean("12","Gowtham","EEE"));
		userList.add(new CrudUserBean("13","Surya","CSE"));
		userList.add(new CrudUserBean("14","Ramkumar","MECH"));
		
	}
	
	public List<CrudUserBean> findAllUsers()
	{
		return userList;
	}
	
	public CrudUserBean findOneUser(String userid)
	{
		for(CrudUserBean user:userList)
		{
			if(user.getUserid().equals(userid))
			return user;
		}
		return null;
	}
	public CrudUserBean deleteUser(String userid)
	{
		for(CrudUserBean user:userList)
		{
			if(user.getUserid().equals(userid)) 
			{
				userList.remove(user);
				return user;
			}
		}
		return null;
	}
	public CrudUserBean createOneUser(CrudUserBean cb)
	{
		userList.add(cb);
		return cb;
	}
}

package Create.Crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrudController 
{
	@Autowired
	private CrudService service;
	
	@GetMapping("userList")
	private List<CrudUserBean> retriveAllUser()
	{
		return service.findAllUsers();
	}
	@GetMapping("userList/{userid}")
	
		private CrudUserBean retriveOneUser(@PathVariable String userid)
		{
			return service.findOneUser(userid);
		}
	@DeleteMapping("userList/{userid}")
	
		private CrudUserBean deteletOneUser(@PathVariable String userid)
		{
			return service.deleteUser(userid);
		}
	@PostMapping("userList")
	@ResponseBody
		public CrudUserBean createUser(@RequestBody CrudUserBean cb)
		{
			return service.createOneUser(cb);
		}
}

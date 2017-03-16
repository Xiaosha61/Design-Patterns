
import java.util.ArrayList;
import java.util.List;

public class PersonCore extends Person {

	private List<PersonRole> roles;
	private String firstname;
	
	public PersonCore(String firstname){
		roles = new ArrayList<PersonRole>();
		this.firstname = firstname;
	}

	@Override
	public void addRole(PersonRole role) {
		if(!roles.contains(role)){
			roles.add(role);
			role.setCore(this);
		}
	}

	@Override
	public void removeRole(PersonRole role) {
		if(roles.contains(role))
			roles.remove(role);
	}

	@Override
	public PersonRole getRole(String context) {
		for(PersonRole role : roles){
			if(context.equals(role.getContext()))
				return role;
		}
		
		return null;
	}

	@Override
	public String sayHello() {
		return  "Hey, I'm " + firstname;
	}
	
}


public abstract class PersonRole extends Person {

	protected PersonCore core;
	private String context;
		
	protected PersonCore getCore() {
		return core;
	}
	protected void setCore(PersonCore core) {
		this.core = core;
	}
	protected String getContext() {
		return context;
	}
	protected void setContext(String context) {
		this.context = context;
	}
	@Override
	public void addRole(PersonRole role) {
		core.addRole(role);
	}
	@Override
	public void removeRole(PersonRole role) {
		core.removeRole(role);
	}
	@Override
	public PersonRole getRole(String context) {
		return core.getRole(context);
	}
}

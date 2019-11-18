import java.util.Hashtable;

public class ControlStore {

	//public MicroInstruction[] controlStore = new MicroInstruction[512];
	public Hashtable<String, MicroInstruction> controlStore1 = new Hashtable<>();
	
	public ControlStore() {
		
	}

	public Hashtable<String, MicroInstruction> getControlStore1() {
		return controlStore1;
	}

	public void setControlStore1(Hashtable<String, MicroInstruction> controlStore1) {
		this.controlStore1 = controlStore1;
	}

	
}

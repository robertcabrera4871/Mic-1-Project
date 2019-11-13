import java.util.Arrays;

public class MicroInstruction {
	public Boolean[] nextAddress = new Boolean[9];
	public Boolean[] jam = new Boolean[3];
	public Boolean[] alu = new Boolean[8];
	public Boolean[] cBus = new Boolean[9];
	public Boolean[] mem = new Boolean[3];
	public Boolean[] bBus = new Boolean[4];
	
	public MicroInstruction() {
		
	}
	public MicroInstruction(Boolean[] nextAddress, Boolean[] jam, Boolean[] alu, Boolean[] cBus, Boolean[] mem,
			Boolean[] bBus) {
		super();
		this.nextAddress = nextAddress;
		this.jam = jam;
		this.alu = alu;
		this.cBus = cBus;
		this.mem = mem;
		this.bBus = bBus;
	}

	@Override
	public String toString() {
		return "MicroInstruction \n[nextAddress=" + Arrays.toString(nextAddress) + ", \njam=" + Arrays.toString(jam)
				+ ", \nalu=" + Arrays.toString(alu) + ", \ncBus=" + Arrays.toString(cBus) + ", \nmem=" + Arrays.toString(mem)
				+ ", \nbBus=" + Arrays.toString(bBus) + "]";
	}
	public Boolean[] getNextAddress() {
		return nextAddress;
	}
	public void setNextAddress(Boolean[] nextAddress) {
		this.nextAddress = nextAddress;
	}
	public Boolean[] getJam() {
		return jam;
	}
	public void setJam(Boolean[] jam) {
		this.jam = jam;
	}
	public Boolean[] getAlu() {
		return alu;
	}
	public void setAlu(Boolean[] alu) {
		this.alu = alu;
	}
	public Boolean[] getcBus() {
		return cBus;
	}
	public void setcBus(Boolean[] cBus) {
		this.cBus = cBus;
	}
	public Boolean[] getMem() {
		return mem;
	}
	public void setMem(Boolean[] mem) {
		this.mem = mem;
	}
	public Boolean[] getbBus() {
		return bBus;
	}
	public void setbBus(Boolean[] bBus) {
		this.bBus = bBus;
	}
	
	
}

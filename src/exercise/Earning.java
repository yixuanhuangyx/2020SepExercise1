package exercise;

public class Earning {
	typeEnum type;
	float amount;
	
	
	public Earning(typeEnum type, float i) {
		this.type = type;
		this.amount = i;
	}
	public typeEnum getType() {
		return type;
	}
	public void setType(typeEnum type) {
		this.type = type;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
}

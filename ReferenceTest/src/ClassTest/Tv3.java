package ClassTest;

public class Tv3 {
	private String color;
	private boolean power;
	private int channel;

	public Tv3(String color, boolean power, int channel) {
		super();
		this.color = color;
		this.power = power;
		this.channel = channel;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	void channelup() {
		channel++;

	}

	void channeldown() {
		channel--;
	}

	void power() {
		
	}	

}

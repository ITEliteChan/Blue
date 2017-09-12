package ao.rf.ch.aoteman;

public class Man {
	private int hp;
	private int attack;

	public Man(int hp, int attack){
		this.hp = hp;
		this.attack = attack;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	@Override
	public String toString() {
		return "Man [hp=" + hp + ", attack=" + attack + "]";
	}
	
}

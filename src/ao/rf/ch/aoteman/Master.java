package ao.rf.ch.aoteman;

public class Master {
private int hp;
private int attack;

public Master(int hp, int attack){
	this.attack = attack;
	this.hp = hp;
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

}

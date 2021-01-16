package sd.design.patterns.simplified.examples.prototype;

public class Main {
	public static void main(String[] args) {
		Monster dragon = new Dragon("Dragon", false, 1, false); // prototype for all Dragons
		Monster drakon = new Dragon("Drakon", true, 2, true); // prototype for all Drakons
		
		Monster ladon = makeMonsterOperation(dragon, "Ladon");
		Monster laconian = makeMonsterOperation(drakon, "Laconian");
		
		System.out.println(ladon);
		ladon.spitPoison();
		
		System.out.println(laconian);
		laconian.spitPoison();
	}
	
	public static Monster makeMonsterOperation(Monster monsterToCopy, String name) {
		Monster newMonster = null;
		try {
			newMonster = monsterToCopy.copy();
			newMonster.setName(name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return newMonster;
	}
}
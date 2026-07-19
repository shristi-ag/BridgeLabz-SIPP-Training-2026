package Game;

public class AdventureGameCharacterSystem {

    public static void startBattle(GameCharacter[] characters) {

        int warriorCount = 0;
        int mageCount = 0;
        int archerCount = 0;

        System.out.println("----- Battle Started -----");

        for (GameCharacter character : characters) {

            character.performAttack();   // Dynamic Method Dispatch

            if (character instanceof Warrior) {
                warriorCount++;
            } else if (character instanceof Mage) {
                mageCount++;
            } else if (character instanceof Archer) {
                archerCount++;
            }
        }

        System.out.println("\n----- Participants -----");
        System.out.println("Warriors: " + warriorCount);
        System.out.println("Mages: " + mageCount);
        System.out.println("Archers: " + archerCount);
    }

    public static void main(String[] args) {

        GameCharacter[] characters = new GameCharacter[5];

        characters[0] = new Warrior("Arjun");
        characters[1] = new Mage("Merlin");
        characters[2] = new Archer("Robin");
        characters[3] = new Warrior("Leon");
        characters[4] = new Mage("Gandalf");

        startBattle(characters);
    }
}

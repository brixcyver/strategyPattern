public class GameApp {
    public static void main(String[] args) {
        // Instantiate characters with specific attack and defense strategies
        Character knight = new Character("Knight", new SwordAttack(), new KnightDefense());
        Character wizard = new Character("Wizard", new SpellAttack(), new WizardDefense());
        Character archer = new Character("Archer", new ArrowAttack(), new ArcherDefense());

        // Simulate game interactions
        simulateBattle(knight, wizard);
    }

    // Simulate battle between two characters
    private static void simulateBattle(Character attacker, Character defender) {
        System.out.println();
        System.out.println("++++++++++++++++++++++");
        System.out.println(attacker.getType() + " attacks!");
        attacker.attack();
        System.out.println(defender.getType() + " defends!");
        defender.defend();
        System.out.println("++++++++++++++++++++++");
    }
}
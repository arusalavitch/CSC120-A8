/**
 * The Gluten class represents the life of my pet gerbil (named Gluten)
 */
public class Gluten implements Contract {

    private boolean isResting = false;
    private boolean hasUsedWheel = false;
    private boolean hasEaten = false;

    /**
     * Gluten grabs an item in his cage.
     * @param item The item to grab.
     */
    @Override
    public void grab(String item) {
        System.out.println("Gluten grabs " + item);
    }

    /**
     * Gluten drops an item.
     * @param item The item to drop.
     * @return A message indicating the action.
     */
    @Override
    public String drop(String item) {
        return "Gluten drops " + item + " in the cage.";
    }

    /**
     * Gluten examines an item.
     * @param item The item to examine.
     */
    @Override
    public void examine(String item) {
        System.out.println("Gluten sniffs " + item);
    }

    /**
     * Gluten uses an item.
     * @param item The item to use.
     */
    @Override
    public void use(String item) {
        if (item.equalsIgnoreCase("wheel")) {
            if (!hasUsedWheel) {
                System.out.println("Gluten runs happily on his wheel :)");
                hasUsedWheel = true;
            } else {
                System.out.println("Gluten has already used the wheel!");
            }
        } else {
            System.out.println("Gluten doesn't know how to use " + item);
        }
    }

    /**
     * Gluten walks in his cage.
     * @param direction The direction to walk.
     * @return true if Gluten can walk, otherwise false.
     */
    @Override
    public boolean walk(String direction) {
        System.out.println("Gluten waddles " + direction + " in his cage.");
        return true;
    }

    /**
     * Gluten flies.
     * @param x The x-coordinate.
     * @param y The y-coordinate.
     * @return true if Gluten can fly, otherwise false.
     */
    @Override
    public boolean fly(int x, int y) {
        System.out.println("Gluten eats a special nut, grows wings, and flies to coordinates (" + x + ", " + y + ") in his cage.");
        return true;
    }

    /**
     * Gluten shrinks in size.
     * @return The new size of Gluten.
     */
    @Override
    public Number shrink() {
        System.out.println("Oh no! Gluten hasn't eaten any nuts in a while. He shrinks slightly.");
        hasEaten =false;
        return 0.9; // Gluten's size decreases by 10%
    }

    /**
     * Gluten grows in size.
     * @return The new size of Gluten.
     */
    @Override
    public Number grow() {
        if (!hasEaten) {
            System.out.println("Gluten was given a nut! He grows slightly. He's getting chonky!!");
            hasEaten = true;
            return 1.1; // Gluten's size increases by 10%
        } else {
            System.out.println("Gluten is too full from his last nut!");
            return 1;
        }
    }

    /**
     * Gluten naps.
     */
    @Override
    public void rest() {
        if (!isResting) {
            System.out.println("Gluten takes a nap in his little hut. He's very cozy.");
            isResting = true;
        } else {
            System.out.println("Gluten is already napping!");
        }
    }

    /**
     * Gluten undoes the last action.
     */
    @Override
    public void undo() {
        System.out.println("Oops! Gluten undoes his last action.");
        // Implement undo functionality if needed
    }
}

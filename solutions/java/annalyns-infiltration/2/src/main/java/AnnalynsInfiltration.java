class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !(knightIsAwake); // Checks if knight is not awake
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake; // Checks if at least one is awake

    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        // Checks if prisoner is awake AND archer is sleeping
        return prisonerIsAwake && !(archerIsAwake);

    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        // Checks if dog is present and archer is asleep
        boolean scenarioOne = petDogIsPresent && !(archerIsAwake); // false
        // Checks if dog isn't present , prisoner is awake and both knight + archer are asleep
        boolean scenarioTwo =  prisonerIsAwake && !(petDogIsPresent || knightIsAwake || archerIsAwake);
        // OR (||) comes from De Morgan's Law !( petDogIsPresent && knightIsAwake && archerIsAwake)


        return scenarioOne || scenarioTwo;
    }

}

/**
 *  boolean knightIsAwake = true;
 *  boolean archerIsAwake = false;
 *  boolean prisonerIsAwake = true;
 *  boolean petDogIsPresent = false;
 *
 *  Should return false
 */



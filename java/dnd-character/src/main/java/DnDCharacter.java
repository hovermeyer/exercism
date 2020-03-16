

class DnDCharacter {
    public int strength, dexterity, constitution, intelligence, wisdom, charisma;

    DnDCharacter(){
        strength = ability();
        dexterity = ability();
        constitution = ability();
        intelligence = ability();
        wisdom = ability();
        charisma = ability();
    }


    int ability() {
        int current_roll = 0; 
        int min_roll = 7;
        int sum_rolls = 0; 
        for (int i = 0; i<4; i++){
            current_roll = (int) (Math.random()*6 + 1);
            if (current_roll < min_roll){
                min_roll = current_roll;
            }
            sum_rolls += current_roll;
        }
        return sum_rolls - min_roll;
    }

    int modifier(int input) {
        return (int) Math.floor((input - 10.0)/2.0);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return 10 + modifier(constitution);
    }

}

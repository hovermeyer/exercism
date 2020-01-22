class ResistorColor {
    
    private String[] resistor_code = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    int colorCode(String color) {
        for (int i = 0; i < resistor_code.length; i++) {
            if (resistor_code[i] == color ){
                return i;
            }
        }


            throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    String[] colors() {
        return resistor_code;
    }
}

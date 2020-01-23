class ResistorColorDuo {

    private String[] resistor_code = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

    int value(String[] colors) {
        return find_index(colors[0])*10 + find_index(colors[1]);
    }

    int find_index(String search){
        for (int i = 0; i<resistor_code.length; i++){
            if (search == resistor_code[i]){
                return i;
            }
        }
        return -1;
    }
}

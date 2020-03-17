class Acronym {

    public String acronym ="";

    Acronym(String phrase) {
        String[] allWords= phrase.toUpperCase().split("[\\s-_]");
        for (String word: allWords){
            if (word.length() >0){
                acronym += word.charAt(0);
            }
        }
    }

    String get() {
        return acronym; 
    }

}

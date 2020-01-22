class Proverb {

    private String[] m_words;


    Proverb(String[] words) {
        m_words = words;
    }

    String recite() {
        String poem = "";
        for (int i = 1; i < m_words.length; i++) {
            poem += "For want of a " + m_words[i-1] + " the " + m_words[i] +  " was lost.\n";
        }
        if (m_words.length >0){
            poem += "And all for the want of a " + m_words[0] + ".";
        }
        return poem; 

    }

}

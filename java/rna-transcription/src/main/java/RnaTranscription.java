import java.util.HashMap; // import the HashMap class


class RnaTranscription {

    String transcribe(String dnaStrand) {

        HashMap<String, String> translation = new HashMap<String, String>();
        translation.put("G", "C");
        translation.put("C", "G");
        translation.put("T", "A");
        translation.put("A", "U");

        String rnaStrand = "";

        for(char nucleotide : dnaStrand.toCharArray()) {
            rnaStrand = rnaStrand + translation.get(String.valueOf(nucleotide));
        }

        return rnaStrand;
    }

}

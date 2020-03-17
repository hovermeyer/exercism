class Hamming {
    
    public int hammingDistance;

    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand == "" && rightStrand !=""){
            throw new IllegalArgumentException("left strand must not be empty.");
        }else if (leftStrand != "" && rightStrand ==""){
            throw new IllegalArgumentException("right strand must not be empty.");
        }else if (leftStrand.length() != rightStrand.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        hammingDistance = 0;
        for (int i = 0; i< leftStrand.length(); i++){
            if (leftStrand.charAt(i) != rightStrand.charAt(i)){
                hammingDistance +=1; 
            }
        }

    }

    int getHammingDistance() {
        return hammingDistance;
    }

}

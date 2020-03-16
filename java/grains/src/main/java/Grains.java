import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if (square > 64 || square < 1){
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        BigInteger initialized = new BigInteger("2"); 
        return initialized.pow(square-1);
    }

    BigInteger grainsOnBoard() {
        BigInteger initialized = new BigInteger("2"); 
        return initialized.pow(64).subtract(BigInteger.ONE);
    }

}

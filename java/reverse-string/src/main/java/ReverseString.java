class ReverseString {

    String reverse(String inputString) {
        StringBuilder builder = new StringBuilder();
        builder.append(inputString);
        builder = builder.reverse();
        return builder.toString();
    }
  
}
class Darts {

    private double radius;

    Darts(double x, double y) {
        radius = Math.pow(Math.pow(x,2) + Math.pow(y,2),0.5);
    }

    int score() {
        if (radius <=1){
            return 10;
        }else if (radius <= 5){
            return 5;
        }else if (radius <=10){
            return 1;
        }else{
            return 0; 
        }
    }

}

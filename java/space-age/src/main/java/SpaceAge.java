class SpaceAge {

    public double totalSeconds,earthYears;
    public final double earthYearDuration = 31557600;

    SpaceAge(double seconds) {
        totalSeconds =seconds;
        earthYears = totalSeconds/earthYearDuration; 
    }

    double getSeconds() {
        return totalSeconds;     
    }

    double onEarth() {
        return earthYears;
    }

    double onMercury() {
        return earthYears/0.2408467;
    }

    double onVenus() {
        return earthYears/0.61519726;
    }

    double onMars() {
        return earthYears/1.8808158;
    }

    double onJupiter() {
        return earthYears/11.862615;
    }

    double onSaturn() {
        return earthYears/29.447498;
    }

    double onUranus() {
        return earthYears/84.016846;
    }

    double onNeptune() {
        return earthYears/164.79132;
    }

}

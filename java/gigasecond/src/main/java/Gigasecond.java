import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

class Gigasecond {

    public LocalDateTime initialMoment;

    Gigasecond(LocalDate moment) {
        initialMoment = moment.atStartOfDay();
    }

    Gigasecond(LocalDateTime moment) {
        initialMoment = moment;
    }

    LocalDateTime getDateTime() {
        return initialMoment.plus(1000000000, ChronoUnit.SECONDS);
    }

}

import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {
    private static final long GIGASECOND = 1_000_000_000;
    private LocalDateTime birthDateTime;

    Gigasecond(LocalDate birthDate) {
        birthDateTime = birthDate.atStartOfDay();
    }

    Gigasecond(LocalDateTime birthDateTime) {
       this.birthDateTime = birthDateTime;
    }

    LocalDateTime getDate() {
        return birthDateTime.plusSeconds(GIGASECOND);
    }

}

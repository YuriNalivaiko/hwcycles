

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqamvn.services.VacationService;

public class VacationServiceTest {
    @Test
    void shouldCalculateVacationMonths1() {
        VacationService service = new VacationService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expectedVacationMonths = 3;
        int actualVacationMonths = service.calculateVacationMonths(income, expenses, threshold);
        Assertions.assertEquals(expectedVacationMonths, actualVacationMonths);
    }

    @Test
    void shouldCalculateVacationMonths2() {
        VacationService service = new VacationService();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expectedVacationMonths = 2;
        int actualVacationMonths = service.calculateVacationMonths(income, expenses, threshold);
        Assertions.assertEquals(expectedVacationMonths, actualVacationMonths);
    }
}
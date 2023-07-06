import org.example.entity.Reservation;
import org.example.repository.ReservationRepository;
import org.example.service.ReservationService;
import org.example.service.impl.ReservationServiceImpl;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ReservationServiceTest {

    private ReservationRepository reservationRepository;
    private ReservationService reservationService;

    @BeforeEach
    public void setUp() {
        reservationRepository = Mockito.mock(ReservationRepository.class);
        reservationService = new ReservationServiceImpl(reservationRepository);
    }

    @Test
    public void testCreationReservationInvokeSaveRespositoryOneTime() {
        String clientName = "Ihab ABADI";
        String reservationDate = "2023-07-06";
        int tableSize = 2;
        reservationService.createReservation(clientName, reservationDate, tableSize);
        Mockito.verify(reservationRepository, Mockito.times(1)).save(Mockito.any(Reservation.class));
    }

    @Test
    public void testCreationReservationReturnCorrectReservationClientName() {
        String clientName = "Ihab ABADI";
        String reservationDate = "2023-07-06";
        int tableSize = 2;
        Mockito.when(reservationRepository.save(Reservation.builder().clientName(clientName).build())).thenReturn(Reservation.builder().clientName(clientName).build());
        Reservation reservation = reservationService.createReservation(clientName, reservationDate, tableSize);
        Assertions.assertEquals(clientName, reservation.getClientName());
    }
}

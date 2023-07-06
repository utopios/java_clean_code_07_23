import org.example.entity.Reservation;
import org.example.exception.InvalidReservationException;
import org.example.repository.ReservationRepository;
import org.example.service.ReservationService;
import org.example.service.impl.ReservationServiceImpl;
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
    public void testCreateReservationInvokeSaveRespositoryOneTime() throws InvalidReservationException {
        String clientName = "Ihab ABADI";
        String reservationDate = "2023-07-06";
        int tableSize = 2;
        reservationService.createReservation(clientName, reservationDate, tableSize);
        Mockito.verify(reservationRepository, Mockito.times(1)).save(Mockito.any(Reservation.class));
    }

    @Test
    public void testCreateReservationReturnCorrectReservationClientName() throws InvalidReservationException {
        String clientName = "Ihab ABADI";
        String reservationDate = "2023-07-06";
        int tableSize = 2;
        Mockito.when(reservationRepository.save(Mockito.any(Reservation.class))).thenReturn(Reservation.builder().clientName(clientName).build());
        Reservation returnedReservation = reservationService.createReservation(clientName, reservationDate, tableSize);
        Assertions.assertEquals(clientName, returnedReservation.getClientName());
    }

    @Test
    public void testCreateReservationShouldRaiseInvalidReservationExceptionWhenInvalidClientName() {
        Assertions.assertThrowsExactly(InvalidReservationException.class, () -> {
            reservationService.createReservation(null,"", 1);
        });
    }

    @Test
    public void testGetReservation() {
        String clientName = "Ihab ABADI";
        Reservation mockReservation = Reservation.builder().clientName(clientName).build();
        Mockito.when(reservationRepository.findByClientName(clientName)).thenReturn(mockReservation);
        Reservation returnedReservation = reservationService.getReservation(clientName);

        Mockito.verify(reservationRepository, Mockito.times(1)).findByClientName(clientName);

        Assertions.assertEquals(clientName, returnedReservation.getClientName());
    }

}

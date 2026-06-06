package za.ac.cput.factories;

import za.ac.cput.domain.Reservation;
import za.ac.cput.repositories.ReservationRepository;

import java.util.List;
import java.util.Optional;

class DatabaseReservationRepository implements ReservationRepository {

    @Override
    public void save(Reservation reservation) {
        throw new UnsupportedOperationException("Database implementation coming in a future sprint.");
    }

    @Override
    public Optional<Reservation> findById(String id) {
        throw new UnsupportedOperationException("Database implementation coming in a future sprint.");
    }

    @Override
    public List<Reservation> findAll() {
        throw new UnsupportedOperationException("Database implementation coming in a future sprint.");
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Database implementation coming in a future sprint.");
    }

    @Override
    public List<Reservation> findByMemberId(String memberId) {
        throw new UnsupportedOperationException("Database implementation coming in a future sprint.");
    }

    @Override
    public List<Reservation> findByBookId(String bookId) {
        throw new UnsupportedOperationException("Database implementation coming in a future sprint.");
    }

    @Override
    public List<Reservation> findByStatus(String status) {
        throw new UnsupportedOperationException("Database implementation coming in a future sprint.");
    }
}

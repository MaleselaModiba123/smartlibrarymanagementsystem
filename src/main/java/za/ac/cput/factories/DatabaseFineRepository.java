package za.ac.cput.factories;

import za.ac.cput.domain.Fine;
import za.ac.cput.repositories.FineRepository;

import java.util.List;
import java.util.Optional;

class DatabaseFineRepository implements FineRepository {

    @Override
    public void save(Fine fine) {
        throw new UnsupportedOperationException("Database implementation coming in a future sprint.");
    }

    @Override
    public Optional<Fine> findById(String id) {
        throw new UnsupportedOperationException("Database implementation coming in a future sprint.");
    }

    @Override
    public List<Fine> findAll() {
        throw new UnsupportedOperationException("Database implementation coming in a future sprint.");
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Database implementation coming in a future sprint.");
    }

    @Override
    public List<Fine> findByStatus(String status) {
        throw new UnsupportedOperationException("Database implementation coming in a future sprint.");
    }

    @Override
    public List<Fine> findByLoanId(String loanId) {
        throw new UnsupportedOperationException("Database implementation coming in a future sprint.");
    }
}

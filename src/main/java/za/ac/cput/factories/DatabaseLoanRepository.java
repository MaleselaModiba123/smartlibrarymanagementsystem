package za.ac.cput.factories;

import za.ac.cput.domain.Loan;
import za.ac.cput.repositories.LoanRepository;

import java.util.List;
import java.util.Optional;

class DatabaseLoanRepository implements LoanRepository {

    @Override
    public void save(Loan loan) {
        throw new UnsupportedOperationException("Database implementation coming in a future sprint.");
    }

    @Override
    public Optional<Loan> findById(String id) {
        throw new UnsupportedOperationException("Database implementation coming in a future sprint.");
    }

    @Override
    public List<Loan> findAll() {
        throw new UnsupportedOperationException("Database implementation coming in a future sprint.");
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Database implementation coming in a future sprint.");
    }

    @Override
    public List<Loan> findByMemberId(String memberId) {
        throw new UnsupportedOperationException("Database implementation coming in a future sprint.");
    }

    @Override
    public List<Loan> findByBookId(String bookId) {
        throw new UnsupportedOperationException("Database implementation coming in a future sprint.");
    }

    @Override
    public List<Loan> findOverdue() {
        throw new UnsupportedOperationException("Database implementation coming in a future sprint.");
    }

    @Override
    public List<Loan> findByStatus(String status) {
        throw new UnsupportedOperationException("Database implementation coming in a future sprint.");
    }
}

package za.ac.cput.factories;

import za.ac.cput.repositories.BookRepository;
import za.ac.cput.repositories.FineRepository;
import za.ac.cput.repositories.LoanRepository;
import za.ac.cput.repositories.MemberRepository;
import za.ac.cput.repositories.ReservationRepository;
import za.ac.cput.repositories.inmemory.InMemoryBookRepository;
import za.ac.cput.repositories.inmemory.InMemoryFineRepository;
import za.ac.cput.repositories.inmemory.InMemoryLoanRepository;
import za.ac.cput.repositories.inmemory.InMemoryMemberRepository;
import za.ac.cput.repositories.inmemory.InMemoryReservationRepository;

/**
 * Factory that returns the correct repository implementation for a given
 * storage backend. The rest of the application asks this factory for a
 * repository by storage type ("MEMORY" or "DATABASE") and never needs to know
 * which concrete implementation it receives. Switching the whole system from
 * in-memory storage to a database is therefore a one-line configuration change
 * rather than a code change scattered across the codebase. (NFR-05)
 */
public class RepositoryFactory {

    public static final String MEMORY = "MEMORY";
    public static final String DATABASE = "DATABASE";

    private RepositoryFactory() {
        // Static factory; not meant to be instantiated.
    }

    public static BookRepository getBookRepository(String storageType) {
        switch (normalise(storageType)) {
            case MEMORY:
                return new InMemoryBookRepository();
            case DATABASE:
                return new DatabaseBookRepository();
            default:
                throw unknownStorageType(storageType);
        }
    }

    public static MemberRepository getMemberRepository(String storageType) {
        switch (normalise(storageType)) {
            case MEMORY:
                return new InMemoryMemberRepository();
            case DATABASE:
                return new DatabaseMemberRepository();
            default:
                throw unknownStorageType(storageType);
        }
    }

    public static LoanRepository getLoanRepository(String storageType) {
        switch (normalise(storageType)) {
            case MEMORY:
                return new InMemoryLoanRepository();
            case DATABASE:
                return new DatabaseLoanRepository();
            default:
                throw unknownStorageType(storageType);
        }
    }

    public static ReservationRepository getReservationRepository(String storageType) {
        switch (normalise(storageType)) {
            case MEMORY:
                return new InMemoryReservationRepository();
            case DATABASE:
                return new DatabaseReservationRepository();
            default:
                throw unknownStorageType(storageType);
        }
    }

    public static FineRepository getFineRepository(String storageType) {
        switch (normalise(storageType)) {
            case MEMORY:
                return new InMemoryFineRepository();
            case DATABASE:
                return new DatabaseFineRepository();
            default:
                throw unknownStorageType(storageType);
        }
    }

    private static String normalise(String storageType) {
        if (storageType == null) {
            throw unknownStorageType(null);
        }
        return storageType.trim().toUpperCase();
    }

    private static IllegalArgumentException unknownStorageType(String storageType) {
        return new IllegalArgumentException("Unknown storage type: " + storageType);
    }
}

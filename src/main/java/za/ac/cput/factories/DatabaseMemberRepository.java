package za.ac.cput.factories;

import za.ac.cput.domain.Member;
import za.ac.cput.repositories.MemberRepository;

import java.util.List;
import java.util.Optional;

class DatabaseMemberRepository implements MemberRepository {

    @Override
    public void save(Member member) {
        throw new UnsupportedOperationException("Database implementation coming in a future sprint.");
    }

    @Override
    public Optional<Member> findById(String id) {
        throw new UnsupportedOperationException("Database implementation coming in a future sprint.");
    }

    @Override
    public List<Member> findAll() {
        throw new UnsupportedOperationException("Database implementation coming in a future sprint.");
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Database implementation coming in a future sprint.");
    }

    @Override
    public Optional<Member> findByEmail(String email) {
        throw new UnsupportedOperationException("Database implementation coming in a future sprint.");
    }

    @Override
    public List<Member> findByAccountStatus(String status) {
        throw new UnsupportedOperationException("Database implementation coming in a future sprint.");
    }
}

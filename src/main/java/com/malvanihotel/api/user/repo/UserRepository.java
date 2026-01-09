package com.malvanihotel.api.user.repo;

import com.malvanihotel.api.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.ScopedValue;
import java.util.Optional;

//public class UserRepository {
    @Repository
    public interface UserRepository extends JpaRepository<User, Long> {

        Optional<User> findByUsername(String username);

        boolean existsByUsername(String username);

}

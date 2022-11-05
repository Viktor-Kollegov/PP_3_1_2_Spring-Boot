package academy.kata.PP_3_1_2_SpringBoot.repository;

import academy.kata.PP_3_1_2_SpringBoot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

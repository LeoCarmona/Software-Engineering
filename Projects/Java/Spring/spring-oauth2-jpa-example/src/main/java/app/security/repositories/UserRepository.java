package app.security.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import app.security.entities.User;

/**
 * 
 * 
 * @author Leonardo Carmona da Silva
 *         <ul>
 *         <li><a href="https://br.linkedin.com/in/l3ocarmona">https://br.linkedin.com/in/l3ocarmona</a></li>
 *         <li><a href="https://github.com/leocarmona">https://github.com/leocarmona</a></li>
 *         <li><a href="mailto:lcdesenv@gmail.com">lcdesenv@gmail.com</a></li>
 *         </ul>
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

    public User findOneByUsername(String username);

}

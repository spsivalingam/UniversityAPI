package uncc.api.uncc.api.Repository;

import org.springframework.data.repository.CrudRepository;
import uncc.api.uncc.api.Entity.User;

/**
 * Created by sivalingam on 2/10/2018.
 */
public interface UserRepository extends CrudRepository<User,String> {

    User findByuser_id(String user_id);

}

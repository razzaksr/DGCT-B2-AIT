package crud.bt.dgct_ait_fsd;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepo extends JpaRepository<CollegeEvents,String>{
    
}

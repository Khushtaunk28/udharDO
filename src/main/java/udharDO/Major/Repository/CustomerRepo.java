package udharDO.Major.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import udharDO.Major.Entity.Customer;

public interface CustomerRepo extends MongoRepository<Customer, ObjectId> {
}

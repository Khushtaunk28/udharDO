package udharDO.Major.Repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import udharDO.Major.Entity.Shopkeeper;

public interface ShopkeeperRepo extends MongoRepository<Shopkeeper, ObjectId> {
}

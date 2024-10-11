package udharDO.Major.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;

@Document(collection = "shopkeeper")
@Data
@NoArgsConstructor
public class Shopkeeper {
//id, name, businessName, loanGiven, interestRate (2.5%-5%)
    @Id
    private ObjectId id;
    private String firstName;
    private String lastName;
    private String email;
    @NonNull
    private long    phone;
    private String address;
    @NonNull
    private String businessName;
    private double loanGiven;
}

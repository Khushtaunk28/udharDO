package udharDO.Major.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customer")
@Data
@NoArgsConstructor
public class Customer {
   // id, name, contactInfo, totalLoanAmount, repaymentStatus
    @Id
    private ObjectId id;
    @NonNull
    private String firstName;
    private String lastName;
    private String email;
    private long phone;
    @NonNull
    private double totalLoanAmount;
    private boolean repaymentStatus;
}

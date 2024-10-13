package udharDO.Major.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.lang.annotation.Documented;

@Document(collection = "loan")
@Data
@NoArgsConstructor
public class Loan {
    // - **Loan**: `loanId, loanAmount, issueDate, repaymentDate, interestRate, status, shopkeeperId, customerId`
    //  - **Repayment**: `repaymentId, loanId, amountPaid, datePaid, interestApplied
    @Id
    private ObjectId loanid;
    private double loanamount;

}

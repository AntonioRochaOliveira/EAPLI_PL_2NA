package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author i080649
 */
@Entity
public class Cash  extends PaymentType
{
    @Id
    @GeneratedValue
    private String currency;
    
    public Cash( String alias, String currency )
    {
        super(alias);
        this.currency = currency;
    }
    
}

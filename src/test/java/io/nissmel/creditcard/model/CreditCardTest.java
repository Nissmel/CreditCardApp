package io.nissmel.creditcard.model;

import io.nissmel.creditcard.CreditCard;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class CreditCardTest {
    public static final int NEW_CREDIT_LIMIT = 2000;


    @Test
    public void itAllowAssignLimitToCreditCard()
    {
        CreditCard card = new CreditCard("1412-1231");

        card.assignLimit(BigDecimal.valueOf(NEW_CREDIT_LIMIT));
        Assert.assertTrue(card.getLimit().equals(BigDecimal.valueOf(NEW_CREDIT_LIMIT)));
    }

    @Test
    public void itVerifyMinimumCredit()
    {

    }


}

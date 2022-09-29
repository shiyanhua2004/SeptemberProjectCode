package BankAccount2;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class BankAccountTest {


    @Test
    void testUser()
    {
        User user = new User("John","Doe","johndoe@gmail.com");

        assertEquals("John", user.getName());
        assertEquals("Doe", user.getLastName());
        assertEquals("johndoe@gmail.com", user.getEmail());
    }

    @Test
    void testAddHundred(){

       double amount = 100;

       assertEquals(200, Bank.addHundred(amount));
    }

    @Test
    void testSubSpecific(){

        double amount = 100;
        double numSubtract =50;

        assertEquals(50,Bank.subSpecific(amount, numSubtract));

    }
}

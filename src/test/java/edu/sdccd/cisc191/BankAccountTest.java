package edu.sdccd.cisc191;

import static org.junit.jupiter.api.Assertions.*;

// import BankAccount2.Main;
import BankAccount2.User;
import org.junit.jupiter.api.Test;
// import java.io.PrintStream;
// import java.io.ByteArrayOutputStream;
// import java.io.ByteArrayInputStream;


public class BankAccountTest {


    @Test
    void testUser()
    {
        User user = new User("John","Doe","johndoe@gmail.com");

        assertEquals("John", user.getName());
        assertEquals("Doe", user.getLastName());
        assertEquals("johndoe@gmail.com", user.getEmail());
    }

}

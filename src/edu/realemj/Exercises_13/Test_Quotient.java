package edu.realemj.Exercises_13;

import edu.realemj.Testing.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Quotient {
    @Test()
    public void test_quotient() {
        Assert.assertEquals(2, Quotient.quotient(5,2));
    }
    
}

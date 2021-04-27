package com.uregina.app;
import com.uregina.exceptions.*;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    @Test
    public void toTime24_Am_12()
    {
    	try
        {
            Time12 time12 = new Time12(12, 40, AmPm.am);
            Time24 time24 = time12.toTime24();
	    	int hours = time24.getHours();
	    	int minutes = time24.getMinutes();
	        assertEquals( minutes, 40 );
	        assertEquals( hours, 0);
        }
        catch(InvalidTimeException e)
        {
            System.out.println("Time");
        }
    	
    	
    }


    @Test
    public void toTime24_Am_not12()
    {
    	try
        {

    	Time12 time12 = new Time12(1, 40, AmPm.am);
    	Time24 time24 = time12.toTime24();
    	int hours = time24.getHours();
    	int minutes = time24.getMinutes();
        assertEquals( minutes, 40 );
        assertEquals( hours, 1);
    	}
    	catch(InvalidTimeException e)
        {
            System.out.println("Time");
        }
    }


    @Test
    public void toTime24_Pm_12()
    {
    	try
        {
	    	Time12 time12 = new Time12(12, 40, AmPm.pm);
	    	Time24 time24 = time12.toTime24();
	    	int hours = time24.getHours();
	    	int minutes = time24.getMinutes();
	        assertEquals( minutes, 40 );
	        assertEquals( hours, 12);
	    }
	    catch(InvalidTimeException e)
        {
            System.out.println("Time");
        }
    }


    @Test
    public void toTime24_Pm_not12()
    {
    	try
        {
	    	Time12 time12 = new Time12(1, 40, AmPm.pm);
	    	Time24 time24 = time12.toTime24();
	    	int hours = time24.getHours();
	    	int minutes = time24.getMinutes();
	        assertEquals( minutes, 40 );
	        assertEquals( hours, 13);
	    }
	    catch(InvalidTimeException e)
        {
            System.out.println("Time");
        }
    }


    @Test
    public void toTime24_BoundsMax()
    {
    	try
        {
	    	Time12 time12 = new Time12(12, 59, AmPm.pm);
	    	Time24 time24 = time12.toTime24();
	    	int hours = time24.getHours();
	    	int minutes = time24.getMinutes();
	        assertEquals( minutes, 59 );
	        assertEquals( hours, 23);
	    }
	    catch(InvalidTimeException e)
        {
            System.out.println("Time");
        }
    }


    @Test
    public void toTime24_BoundsMin()
    {
    	try
        {
	    	Time12 time12 = new Time12(12, 0, AmPm.am);
	    	Time24 time24 = time12.toTime24();
	    	int hours = time24.getHours();
	    	int minutes = time24.getMinutes();
	        assertEquals( minutes, 0 );
	        assertEquals( hours, 0);
   	 	}
   	 	catch(InvalidTimeException e)
        {
            System.out.println("Time");
        }
    }

}













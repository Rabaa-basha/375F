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
	        assertEquals( 40, minutes );
	        assertEquals( 0, hours);
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

    	Time12 time12 = new Time12(2, 40, AmPm.am);
    	Time24 time24 = time12.toTime24();
    	int hours = time24.getHours();
    	int minutes = time24.getMinutes();
        assertEquals( 40, minutes );
        assertEquals( 2, hours);
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
	        assertEquals( 40, minutes );
	        assertEquals( 12, hours);
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
	        assertEquals( 40, minutes );
	        assertEquals( 13, hours);
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
	    	Time12 time12 = new Time12(11, 59, AmPm.pm);
	    	Time24 time24 = time12.toTime24();
	    	int hours = time24.getHours();
	    	int minutes = time24.getMinutes();
	        assertEquals( 59, minutes );
	        assertEquals( 23, hours);
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
	        assertEquals( 0, minutes );
	        assertEquals( 0, hours);
   	 	}
   	 	catch(InvalidTimeException e)
        {
            System.out.println("Time");
        }
    }
	
	
//     @Test
//     public void Subtract_Invalid_h1_1()
//     {
//     	try
//         {
// 	    	Time12 time121 = new Time12(-25, 1, AmPm.pm);
// 		Time12 time122 = new Time12(-25, -2, AmPm.pm);
// 	    	int answer = subtract(time121, time122);
		
// 	        assertTrue(actualMessage.contains("Invalid Time"));
// 	    }
// 	    catch(InvalidTimeException e)
//         {
//             System.out.println("Time");
//         }
//     }

	
//    @Test
//     public void Subtract_h2_moreThan_h1()
//     {
//     	try
//         {
// 	    	Time12 time121 = new Time12( 1, 2, AmPm.pm);
// 		Time12 time122 = new Time12( 2, 2, AmPm.pm);
// 	    	int answer = subtract(time121, time122);
		
// 	        assertEquals( -60, answer);
// 	    }
// 	    catch(InvalidTimeException e)
//         {
//             System.out.println("Time");
//         }
//     }
	
//    @Test
//     public void Subtract_h1_moreThan_h2()
//     {
//     	try
//         {
// 	    	Time12 time121 = new Time12( 2, 2, AmPm.pm);
// 		Time12 time122 = new Time12( 1, 2, AmPm.pm);
// 	    	int answer = subtract(time121, time122);
		
// 	        assertEquals( 60, answer);
// 	    }
// 	    catch(InvalidTimeException e)
//         {
//             System.out.println("Time");
//         }
//     }
	
	
//    @Test
//     public void Subtract_m2_moreThan_m1()
//     {
//     	try
//         {
// 	    	Time12 time121 = new Time12( 1, 1, AmPm.pm);
// 		Time12 time122 = new Time12( 1, 2, AmPm.pm);
// 	    	int answer = subtract(time121, time122);
		
// 	        assertEquals( -1, answer);
// 	    }
// 	    catch(InvalidTimeException e)
//         {
//             System.out.println("Time");
//         }
//     }
	
	
//    @Test
//     public void Subtract_m1_moreThan_m1()
//     {
//     	try
//         {
// 	    	Time12 time121 = new Time12( 1, 2, AmPm.pm);
// 		Time12 time122 = new Time12( 1, 1, AmPm.pm);
// 	    	int answer = subtract(time121, time122);
		
// 	        assertEquals( 1, answer);
// 	    }
// 	    catch(InvalidTimeException e)
//         {
//             System.out.println("Time");
//         }
//     }
// }













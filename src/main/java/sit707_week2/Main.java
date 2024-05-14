package sit707_week2;

import java.io.IOException;

/**
 * Hello world!
 * @author Ahsan Habib
 */
public class Main 
{
    public static void main( String[] args ) throws IOException
    { 
    	//int n=2;
    	//if(n==1)
    	//{
        SeleniumOperations.officeworks_registration_page("https://www.officeworks.com.au/app/identity/create-account");
    	//}
    	//else
    	//{
    	
    	SeleniumOperations1.officeworks_registration_page("https://login.mailchimp.com/signup/");
    	//}
    	
    }
}

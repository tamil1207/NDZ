package NDZ;

import Reuse.Libgo;
import io.cucumber.java.en.Given;
import lib.Search;

public class Addtocart extends Libgo {
 static Search  v;

    	@Given("search_prodect  {string}")
    	public static void search_prodect(String prodect) throws InterruptedException{
	    // Write code here that turns the phrase above into concrete actions
		Browser();
		v = new Search(driver);
	  
	}
}


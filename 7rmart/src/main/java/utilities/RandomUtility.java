package utilities;

import com.github.javafaker.Faker;

public class RandomUtility {
private Faker faker; //private instance variable


public  RandomUtility() {
	this.faker=new Faker();// object is created
}

public String generateSubcategoryName()
{
	return faker.book().author();
}



}

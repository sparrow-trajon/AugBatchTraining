package DaoImpl;

import java.util.ArrayList;
import java.util.List;

import model.Customer;
import model.User;

public class DaoDriver {
	static UserDaoImpl daoImpl = new UserDaoImpl();

	public static void main(String[] args) {

		// List<User> a= daoImpl.getAllUser();

		// a.stream().forEach(x->System.out.println(x));

		/**
		 * 
		 * 1.insert a record into table 2.fetch records from the table 3.update the
		 * records in the table 4. delete some records from the table
		 */

		//insertCustomer();
		insertMultiCustomer();

	}

	private static void insertMultiCustomer() {
		List<Customer> customers = new ArrayList<>();

		Customer cust = new Customer();
		cust.setAddressId("7").setCustomer_id(6681).setEmail("abc@google.com").setFirstName("mani").setLastName("ish")
				.setStoreId(1);

		Customer cust1 = new Customer();
		cust.setAddressId("7").setCustomer_id(6682).setEmail("abc@google.com").setFirstName("mani").setLastName("ish")
				.setStoreId(1);

		customers.add(cust1);
		customers.add(cust);
		try {
			daoImpl.insertMulti(customers);
		} catch (Exception e) {
			System.out.println("Error occcured" + e);
			e.printStackTrace();
		}

	}

	private static void insertCustomer() {
		Customer cust = new Customer();
		cust.setAddressId("7").setCustomer_id(6666).setEmail("abc@google.com").setFirstName("man").setLastName("ish")
				.setStoreId(1);

		daoImpl.insert(cust);

	}
}

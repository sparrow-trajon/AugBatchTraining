package stringgs;

public class User {	
	
	long mobileNo;
	String name;
	
	public static void main(String[] args) {
			
//		User user = new  User();
//		 
//		user.mobileNo=8287091244l;
//		user.name="manish";
//		
//		
//		System.out.println(user.mobileNo);
//		System.out.println(user.name);
//		
//		User user2= new User();
//		 user2.mobileNo=8287091244l;
//		 user2.name="man";
//		 
//		 System.out.println(user2.mobileNo);
//		 System.out.println(user2.name);
//		 
//		 System.out.println(user2.equals(user));
//		
		
	StringBuffer buffer= new StringBuffer("manish");
		buffer.append("kumar");
		System.out.println(buffer);
	
	StringBuffer buffer2= new StringBuffer("manish");
	System.out.println(buffer.equals(buffer2));
	
	
	}
	
	
	public boolean equals(User obj) {
		// TODO Auto-generated method stub
		return (this.name.equalsIgnoreCase(obj.name) && (this.mobileNo == obj.mobileNo))?true:false;
	}

}

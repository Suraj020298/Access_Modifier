package access_Modifier;

 //Class is having Default access modifier 
class defAccessSpecifier
{ 
void display() 
   { 
       System.out.println("You are using defalut access specifier"); 
   } 
} 

public class Access_modifier {

	public static void main(String[] args) {
		//default
		System.out.println("Dafault Access Specifier");
		defAccessSpecifier obj = new defAccessSpecifier(); 		  
      obj.display(); 

	}
}

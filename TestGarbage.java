package garbagecollector;
//package defines a name space in which classes are stored
//Garbage collector reclaiming the runtime unused memory automatically
public class TestGarbage 
//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
//class defines instance and class fields,methods and inner classes as well as specifying the interfaces the class implements and the immediate superclass of the class
{
	public void finalize()
//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
//class defines instance and class fields,methods and inner classes as well as specifying the interfaces the class implements and the immediate superclass of the class

	{
		System.out.println("Object is garbage collector");//print the value
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGarbage s1=new TestGarbage();
		//TestGarbage is name of the class
		//s1 is a reference variable
		//new is operator that which allocates memory to an object
		//TestGarbage is constructor call
		TestGarbage s2=new TestGarbage();
		//TestGarbage is name of the class
				//s2 is a reference variable
				//new is operator that which allocates memory to an object
				//TestGarbage is constructor call
		s1=null;//s1 and s2 is value null
		s2=null;
		System.gc();//prints garbage collector
	}

}

package com.benisonmuller.corejava2;

interface Om
{
//	int i= 8;
	void abc();
	static void show()
	{
		System.out.println("Hi");
	}
}
//class MyOm implements Om
//{
//	public void abc()
//	{
//		i=9;  /// we don't use this variable because in interface the variable is 
//		      // automatic treated as constant or final
//	}
//}
public class StaticMethodInterface {

	public static void main(String[] args) {

          Om.show();    /// In static method we don't have to create the method 
                          // to call
	}

}

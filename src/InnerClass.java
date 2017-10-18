

class Atest{
	
	void concPrint(){
		System.out.println("Parent Done");
	}
	void aPrint(){
		System.out.println("Parent2 Done");
		
	}
}

class Atest2 extends Atest{
	void aPrint(){
		System.out.println("Done");
	}
	
	void myPrint(){
		System.out.println(" Child Done");
	}
	
}
public class InnerClass {
   int testvar=50;
	static class RealInnerClass{
		int i=20;
		void printvar(){
			System.out.println(i);
		}
	}	
		public static void main(String[] args) {
			
			String o = new String("0"); String s = (String) o;
			System.out.println(s);
			/*InnerClass.RealInnerClass rr=new InnerClass.RealInnerClass();
			rr.printvar();
			tackleAbstract();*/
	}
		static void tackleAbstract(){
			Atest Aa=new Atest(){
				void aPrint(){
					System.out.println("Done");
				}
				
			};
			
			Aa.concPrint();
			Aa.aPrint();
			
		}

	}



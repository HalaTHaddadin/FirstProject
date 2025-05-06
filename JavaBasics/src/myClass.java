
public class myClass {

	public static void main(String[] args) {
	
				String myname = "abedalraheem";
				String myFirstLetterOfMyName = "a";
				
				int myage = 30; 
			int plusYears = 10 ; 
				
				int myageAfter10Years =40; 
				System.out.println(myageAfter10Years);
				
				int numberOfLettersInMyName = myname.length();
				
				boolean ISMyNAMECONTAINSTHELETTERB=myname.startsWith(myFirstLetterOfMyName);
				 
				System.out.println(ISMyNAMECONTAINSTHELETTERB);
				
				
				String myStduetn1 = "ali";
				String myStduetn2 = "mohammad";
				String myStduetn3 = "thoElKafel";
				String myStduetn4 = "aya";
				
				String [] myStudents = {"ali","mohammad","thoElKafel","aya","malik"};
				
				System.out.println(myStudents[0]);
				System.out.println(myStudents[1]);
				System.out.println(myStudents[2]);
				System.out.println(myStudents[3]);

				for(int i = 0 ; i<=myStudents.length;i++ ) {
					System.out.println(myStudents[i]);
				}
				
				

			}

		}


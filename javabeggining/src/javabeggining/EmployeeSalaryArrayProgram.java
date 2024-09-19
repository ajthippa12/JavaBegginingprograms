package javabeggining;

public class EmployeeSalaryArrayProgram 
{

	public static void main(String[] args)
	{
		String name[] = new String[2];
		name[0]= "aj";
		name[1]= "jay";
		float salary[]=new float[2];
		salary[0]=101.22f;
		salary[1]=202.11f;
		for (int i=0;i<name.length;i++) {
		System.out.println(name[i]);
		for(int j=0;j<salary.length;j++) {
		System.out.println(salary[j]);
			}
		}

	}

	}
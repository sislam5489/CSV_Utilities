package CSV;
import java.io.File;
import CSV.CSVUtilities;

public class Runner {
	public static void main(String args)
	{
		File data = new File("Archived_DOE_High_School_Directory_2016.csv");
		CSVUtilities x = new CSVUtilities(data);
		int y = x.numColumns;
		int z = x.numRows;
		int a = 0;
		int b = y*z;
		while(a<b)
		{
			for(int i = 0;i<y;i++)
			{
				System.out.print(x.CSVData.get(a) + " ");
				a++;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println(x.getColumnHeaders());
		System.out.println(x.getDataString(1));
		System.out.println(x.getDataInt(5));
		System.out.println(x.getDataDouble(5));
		
	}
	
}

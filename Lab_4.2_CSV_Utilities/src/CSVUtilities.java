import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

import javax.xml.crypto.Data;

public class CSVUtilities {

	private ArrayList<String> CSVData;
	private int numColumns;
	BufferedReader br = null;
	public CSVUtilities(File csv)
	{
		this.numColumns = (int) csv.length();
		
		
		try 
		{
			br = new BufferedReader(new FileReader(csv));
			String line = br.readLine();
			while(line!=null)
			{
				String[]seperator = line.split(",");
				numColumns = seperator.length;
				for(int i = 0;i<numColumns;i++)
					CSVData.add(seperator[i]);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("File could not open");
		
		}
		
	}
	public List getColumnHeaders()
	{
		return null;
		
	}
	public List getDataString(int column)
	{
		
		return null;
		
	}
	public List getDataInt(int column)
	{
		return null;
		
	}
	public List getDataDouble(int column)
	{
		return null;
		
	}
}

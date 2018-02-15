package com.mercurynewtours.generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelData {

		public static String getData(String path,String sheet,int rn,int cn)
		{
			try
			{
			FileInputStream fil=new FileInputStream(path);
			Workbook wb=WorkbookFactory.create(fil);
			String data=wb.getSheet(sheet).getRow(rn).getCell(cn).toString();
			return data;
			}
			catch(Exception e)
			{
				return "";
			}
		}
			public static int getRowCount(String path,String sheet)
			{
				try
				{
				FileInputStream fil=new FileInputStream(path);
				Workbook wb=WorkbookFactory.create(fil);
				int rn=wb.getSheet(sheet).getLastRowNum();
				return rn;
			    }
				catch(Exception e)
				{
					return 0;
				}
			}
			public static short getCellCount(String path,String sheet,int rn)
			{
				try
				{
					FileInputStream fil=new FileInputStream(path);
					Workbook wb=WorkbookFactory.create(fil);
					short cn = wb.getSheet(sheet).getRow(rn).getLastCellNum();
					return cn;
				}
				catch(Exception e)
				{
					return 0;
				}
	}

}

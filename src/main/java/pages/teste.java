package pages;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class teste {

	public static void main(String[] args) {

		File file = new File(
				"C:\\CRIAÇÃO DE MASSAS\\Planilha de criação de massas POS E CONTROLE\\Planilhas de massas POS E CONTROLE.xlsx");
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			long CPF = 0;
			
			int quantidadeLinhas = sheet.getPhysicalNumberOfRows();

			for (int i = 2; i < quantidadeLinhas; i++) {
				String HabLinha = sheet.getRow(i).getCell(3).getStringCellValue();
				long cpf = (long) sheet.getRow(i).getCell(0).getNumericCellValue();

				if (!HabLinha.equals("ok")) {
					System.out.println(cpf);
					CPF = cpf;
					break;
				}

			}
		
			
		} catch (Exception e) {
			System.out.println("Todos estão cadastrados!!!");
			assertTrue(false);
		}

	}

}

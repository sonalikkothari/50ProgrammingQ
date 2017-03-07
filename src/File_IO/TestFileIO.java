package File_IO;

import java.io.IOException;

import org.testng.annotations.Test;

import File_IO.ConsoleInt;
import File_IO.DatInStrm;
import File_IO.FileCopy;
import File_IO.InputStreamBufferReader;
import File_IO.ScannerIO;


public class TestFileIO {

	/*@Test
	public void test_Scanner_IO () {
		ScannerIO scanio = new ScannerIO();
		scanio.scannerInt();
	}*/
	
	/*@Test
	public void test_InputStream_BufReader() throws IOException {
		InputStreamBufferReader inbuf = new InputStreamBufferReader();
		inbuf.inputStream_BufferReader();
	}*/
	
	/*@Test
	public void test_ConsoleInt()  {
		ConsoleInt consl = new ConsoleInt();
		 
		 consl.console_int();
		
		
	}*/
	
	/*@Test
	public void test_DataInStream() {
		DatInStrm dat = new DatInStrm();
		dat.data_Input_Stream();
	}*/
	
	@Test
	public void test_File_Copy() throws IOException {
		FileCopy flcp = new FileCopy();
		flcp.file_Write();
	}
}

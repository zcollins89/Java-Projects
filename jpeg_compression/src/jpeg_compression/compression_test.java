package jpeg_compression;

//import the following packages
import java.io.*;
import java.util.*;
import java.awt.image.*;
import javax.imageio.*;
import javax.imageio.stream.ImageOutputStream;

public class compression_test {

	public static void main(String[] args) throws IOException {
		//user input
		System.out.println("Wait!!");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		img_compress();

	}
	
	private static void img_compress() throws IOException {
		//image object
		File img = new File("nature.jpg");
		//input the file
		BufferedImage image = ImageIO.read(img);
						
		//compressed image obj
	    File compressedImg = new File("compress.jpg");
	    OutputStream os =new FileOutputStream(compressedImg);

	    //
	    Iterator<ImageWriter>writers =  ImageIO.getImageWritersByFormatName("jpg");
	    ImageWriter writer = (ImageWriter) writers.next();

	    ImageOutputStream ios = ImageIO.createImageOutputStream(os);
	    writer.setOutput(ios);

	    ImageWriteParam param = writer.getDefaultWriteParam();
	      
	    param.setCompressionMode(ImageWriteParam.MODE_EXPLICIT);
	    param.setCompressionQuality(0.05f);
	    writer.write(null, new IIOImage(image, null, null), param);
	      
	      os.close();
	      ios.close();
	      writer.dispose();
	}

}

// text compression algorithms using Deflate; lossless data compression algorithm that uses a combo of LZ77 and Huffman coding 
import java.io.ByteArrayInputStream; 
import java.io.ByteArrayOutputStream; 
import java.io.IOException; 
import java.util.zip.Deflater; 

import java.util.zip.DeflaterOutputStream; 
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream; 

public class TextCompressionExample
  {
    public static byte[] compress(byte[] data) throws IOException
    {
      Deflater deflater = new Deflater();
      deflater.setInput(data);
      deflater.finish();

      ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
      DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(outputStream, deflater);
      deflaterOutputStream.finish();

      return outputStream.toByteArray();

    }

    public static byte[] decompress(byte[] compressedData) throws IOException
    {
      Inflater inflater = new Inflater();
      inflater.setInput(compressedData);

      ByteArrayOutputStream outputStream = new ByteArrayOutputStream(compressedData.length);

      InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(compressedData, inflater);

      byte[] buffer = new byte[1024];
      int len;
      while ((len = inflaterInputStream.read(buffer)) > 0)
        {
          outputStream.write(buffer, 0, len);
        }
      return outputStream.toByteArray();
    }

    public static void main(String[] args) throws IOException
    {
      String text = "This is a sample to be compressed.";
      byte[] compressedData = compress(text.getBytes());
      byte[] decompressedData = decompress(compressedData);

      System.out.println("Original text: " + text);
      System.out.println("Compressed data length: " + compressedData.length);
      System.out.println("Decompressed text: " + new String(decompressedData));
    }

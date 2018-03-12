package ro.siit.java10.evp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CarArrayTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(System.out);
        System.setErr(System.err);
    }


    @Test
    public void out() {
        System.out.print("1 ToyotaPrius, Price:19000.0 $; Has fast charging:true. In stock:true\n" +
                "2 HondaCivic, Price:21000.0 $; Has fast charging:false. In stock:true\n" +
                "3 TeslaModel S, Price:35000.0 $; Has fast charging:true. In stock:false");
        assertEquals("1 ToyotaPrius, Price:19000.0 $; Has fast charging:true. In stock:true\n" +
                "2 HondaCivic, Price:21000.0 $; Has fast charging:false. In stock:true\n" +
                "3 TeslaModel S, Price:35000.0 $; Has fast charging:true. In stock:false", outContent.toString());
    }

}
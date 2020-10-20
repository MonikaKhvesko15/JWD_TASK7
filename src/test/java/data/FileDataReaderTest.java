package data;

import com.epam.task7.data.DataReader;
import com.epam.task7.data.FileDataReader;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileDataReaderTest {
    private final static String FILE_NAME = "src/test/resources/inputTest.txt";

    @Test
    public void testGetNumberShouldReadFromFileWhenFileExists() throws IOException {
        //given
        DataReader reader = new FileDataReader();

        List<String> excepted=new ArrayList<>();
        excepted.add("Hello");
        excepted.add("Java");
        //when
        List<String> actual=reader.readData(FILE_NAME);
        //then
        Assert.assertEquals(excepted, actual);
    }
}

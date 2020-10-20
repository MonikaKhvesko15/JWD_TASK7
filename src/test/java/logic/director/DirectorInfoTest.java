package logic.director;

import com.epam.task7.data.DataReader;
import com.epam.task7.data.FileDataReader;
import com.epam.task7.entity.Cone;
import com.epam.task7.entity.Point;
import com.epam.task7.logic.parser.Parser;
import com.epam.task7.logic.parser.StringParser;
import com.epam.task7.logic.validator.DataValidator;
import com.epam.task7.logic.validator.LineValidator;
import com.epam.task7.model.ConeCreator;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

public class DirectorInfoTest {
    @Test
    public void testDirectorInfoShouldReturnConeListWhenDataReceivedFromFile() throws IOException {
        //given
//        List<String> info = new ArrayList<>();
//        info.add("(1;2;9) (3;4;0) (5;6;4)");
//        DataReader reader = Mockito.mock(FileDataReader.class);
//        when(reader.readData(anyString())).thenReturn(info);
//
//        LineValidator validator = new DataValidator();
//        when(validator.filterLines(info)).thenReturn(info);
//
//        List<Point> points = new ArrayList<>();
//        points.add(new Point(1, 2, 9));
//        points.add(new Point(3, 4, 0));
//        points.add(new Point(5, 6, 4));
//
//        Parser parser = new StringParser();
//        when(parser.parseString(info.get(0))).thenReturn(points);
//
//        List<Cone> cones = new ArrayList<>();
//        ConeCreator creator = new ConeCreator();
//        when(creator.createCone(points)).thenReturn(null);
    }
}

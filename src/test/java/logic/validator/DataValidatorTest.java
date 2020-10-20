package logic.validator;

import com.epam.task7.logic.validator.DataValidator;
import com.epam.task7.logic.validator.LineValidator;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DataValidatorTest {
    @Test
    public void testDataValidatorShouldIgnoreIncorrectLinesInStorageWhenNoValidInformation() {
        //given
        List<String> lines = new ArrayList<String>();
        lines.add("(1;2;9) (3;4;0) (5;6;4)");
        lines.add("(1;1;-4) (2;2;-8)");
        lines.add("(1;1;1) (2;2;7) (3;1;2) (4;4;3)");

        List<String> correctLines = new ArrayList<String>();
        correctLines.add("(1;2;9) (3;4;0) (5;6;4)");

        LineValidator validator = new DataValidator();
        //when
        List<String> excepted = validator.filterLines(lines);

        //then
        Assert.assertEquals(excepted, correctLines);
    }
}

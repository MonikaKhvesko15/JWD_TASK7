package com.epam.task7.logic.director;

import com.epam.task7.data.DataReader;
import com.epam.task7.data.factory.FileDataReaderFactory;
import com.epam.task7.data.factory.ReaderFactory;
import com.epam.task7.entity.Cone;
import com.epam.task7.entity.Point;
import com.epam.task7.logic.parser.Parser;
import com.epam.task7.logic.parser.StringParser;
import com.epam.task7.logic.validator.DataValidator;
import com.epam.task7.logic.validator.LineValidator;
import com.epam.task7.model.ConeCreator;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class DirectorInfo implements Director {
    private String filename;

    public DirectorInfo(String filename) throws IOException {
        this.filename = filename;
    }

    //log init
    private static final Logger log = Logger.getLogger(DirectorInfo.class);

    @Override
    public List<Cone> run() throws Exception {

        ReaderFactory readerFactory = new FileDataReaderFactory();
        DataReader reader = readerFactory.createReader();
        List<String> info = reader.readData(this.filename);


        LineValidator validator = new DataValidator();
        List<String> validInfo = validator.filterLines(info);

        List<Cone> cones=new ArrayList<>();

        Parser parser = new StringParser();
        ConeCreator creator=new ConeCreator();

        for (String str : validInfo) {
            List<Point> points=parser.parseString(str);
            cones.add(creator.createCone(points));

        }
        return cones;
    }
}

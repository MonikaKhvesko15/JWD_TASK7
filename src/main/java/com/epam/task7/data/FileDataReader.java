package com.epam.task7.data;

import com.epam.task7.logic.director.DirectorInfo;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class FileDataReader implements DataReader{
    //log init
    private static final Logger log = Logger.getLogger(FileDataReader.class);

    @Override
    public List<String> readData(String filename) throws IOException {
        List<String> result = new ArrayList<>();
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(filename));

            String line;
            while ((line = br.readLine()) != null) {
                result.add(line);
            }
            log.info("Info received from file");

        } catch (IOException e) {
            log.warn("file not found");
        } finally {
            if (br != null) {
                br.close();
            }
        }
        return result;
    }
}

package com.epam.task7.data;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface DataReader {
    List<String> readData(String filename) throws IOException;
}

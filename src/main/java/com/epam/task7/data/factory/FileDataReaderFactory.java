package com.epam.task7.data.factory;

import com.epam.task7.data.DataReader;
import com.epam.task7.data.FileDataReader;

public class FileDataReaderFactory implements ReaderFactory{
    @Override
    public DataReader createReader() {
        return new FileDataReader();
    }
}

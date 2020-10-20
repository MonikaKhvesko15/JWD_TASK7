package com.epam.task7.logic.validator;

import com.epam.task7.logic.director.DirectorInfo;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


public class DataValidator implements LineValidator {
    //log init
    private static final Logger log = Logger.getLogger(DataValidator.class);
    private static final String REGEX = "([(]-?\\d+[;]-?\\d+[;]-?\\d+[)]) ([(]-?\\d+[;]-?\\d+[;]-?\\d+[)]) ([(]-?\\d+[;]-?\\d+[;]-?\\d+[)])";

    @Override
    public List<String> filterLines(List<String> lines) {
        List<String> filteredLines = new ArrayList<>();
        for (String line : lines) {
            String trimLine = line.trim();
            if (trimLine.matches(REGEX)) {
                filteredLines.add(trimLine);
            }
        }
        log.info("Valid info wrote to list");
        return filteredLines;
    }
}

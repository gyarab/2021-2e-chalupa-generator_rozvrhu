package com.mycompany.timetables;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author chalu
 */
public class Classroom implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String number;
    private final String name;
    private ArrayList<Subject> prohibitedSubjects = new ArrayList<>();
    private transient ArrayList<ArrayList<TimetableHour>> timetable = new ArrayList<>();

    public Classroom(String number, String name) {
        this.number = number;
        this.name = name;
        resetTimetable();
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Subject> getProhibitedSubjects() {
        return prohibitedSubjects;
    }

    public ArrayList<ArrayList<TimetableHour>> getTimetable() {
        return timetable;
    }

    public void setProhibitedSubjects(ArrayList<Subject> prohibitedSubjects) {
        this.prohibitedSubjects = prohibitedSubjects;
    }

    public void setTimetable(ArrayList<ArrayList<TimetableHour>> timetable) {
        this.timetable = timetable;
    }

    public void resetTimetable() {
        timetable = new ArrayList<>();
        for (int y = 0; y < 5; y++) {
            timetable.add(y, new ArrayList<>());
            for (int x = 0; x < 8; x++) {
                timetable.get(y).add(x, null);
            }
        }
    }

    @Override
    public String toString() {
        return number + " - " + name;
    }
}

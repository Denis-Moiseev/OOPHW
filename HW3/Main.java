package OOPHW.HW3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        StudyGroup group1 = new StudyGroup(1);
        StudyGroup group2 = new StudyGroup(2);
        StudyGroup group3 = new StudyGroup(3);
        StudyGroup group4 = new StudyGroup(4);
        StudyGroup group5 = new StudyGroup(5);
        StudyGroup group6= new StudyGroup(6);

        List<StudyGroup> groups1 = new ArrayList<>();
        groups1.add(group2);
        groups1.add(group3);

        List<StudyGroup> groups2 = new ArrayList<>();
        groups2.add(group6);

        List<StudyGroup> groups3 = new ArrayList<>();
        groups3.add(group1);
        groups3.add(group4);
        groups3.add(group5);

        Stream stream1 = new Stream(groups1);
        Stream stream2 = new Stream(groups2);
        Stream stream3 = new Stream(groups3);

        StreamService streamService = new StreamService();
        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        streams.add(stream3);
        streamService.sortStreams(streams);

        for (Stream stream : streams) {
            System.out.println(stream);
        }
    }
}
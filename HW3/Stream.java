package OOPHW.HW3;

import java.util.Iterator;
import java.util.List;

class Stream implements Iterable<StudyGroup> {
    private List<StudyGroup> studyGroups;

    public Stream(List<StudyGroup> studyGroups) {
        this.studyGroups = studyGroups;
    }

    public List<StudyGroup> geStudyGroups() {
        return studyGroups;
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return studyGroups.iterator();
    }

    public int size() {
        return studyGroups.size();
    }

    @Override
    public String toString() {
        return "Stream {" +
                "groupsNumber" + studyGroups +
                '}';
    }
}
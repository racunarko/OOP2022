package hr.fer.oop.homework_04;

public class UniMasterChef {
    CompetitionEntry[] entries;

    public UniMasterChef(int entriesNum) {
        this.entries = new CompetitionEntry[entriesNum];
    }

    int index = 0;
    public boolean addEntry(CompetitionEntry entry) {
        if(index == this.entries.length) {
            return false;
        }
        for(CompetitionEntry e : entries) {
            if(e != null && e.equals(entry)) {
                return false;
            }
        }
        entries[index] = entry;
        index++;
        return true;
    }

    public Dessert getBestDessert() {
        if (index == 0) return null;

        double max = entries[0].getRating();
        int maxIndex = 0;
        for(int i = 1; i < index; i++) {
            if (entries[i].getRating() > max) {
                max = entries[i].getRating();
                maxIndex = i;
            }
        }
        return entries[maxIndex].getDesert();
    }

    public static Person[] getInvolvedPeople(CompetitionEntry entry) {
        Person[] returnValue = new Person[4];
        int index = 0;
        returnValue[index] = entry.getChef();
        index++;
        for(Student s : entry.getGraders()) {
            returnValue[index] = s;
            index++;
        }
        return returnValue;
    }

}

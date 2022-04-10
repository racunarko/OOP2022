package hr.fer.oop.homework_04;

public class CompetitionEntry {
    Teacher chef;
    Dessert desert;
    Student[] graders = new Student[3];
    int[] grades = new int[3];


    public CompetitionEntry(Teacher chef, Dessert desert) {
        this.chef = chef;
        this.desert = desert;
    }

    public Teacher getChef() {
        return chef;
    }

    public Dessert getDesert() {
        return desert;
    }

    public Student[] getGraders() {
        return graders;
    }


    private int index = 0;
    public boolean addRating(Student grader, int grade) {
        if(index == 3) {
            return false;
        }
        for (Student s : graders) {
            if (s != null && s.equals(grader)) {
                return false;
            }
        }
        graders[index] = grader;
        grades[index] = grade;
        index++;
        return true;
    }

    public double getRating() {
        if (index == 0) return 0;
        double sum = 0;
        for(int i = 0; i < index; i++) {
            sum += grades[i];
        }
        return sum / index;
    }
}

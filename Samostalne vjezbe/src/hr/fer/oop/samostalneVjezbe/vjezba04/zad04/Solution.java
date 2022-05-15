package hr.fer.oop.samostalneVjezbe.vjezba04.zad04;

import java.util.*;

class Solution implements StudentScoreStatistics {

    Map<String, List<Integer>> studentsScores;

    public Solution() {
        studentsScores = new LinkedHashMap<>();
    }

    @Override
    public void addStudentScores(String student, Integer... scores) {
        List<Integer> scoreList = new ArrayList<>(scores.length);
        Collections.addAll(scoreList, scores);
        studentsScores.put(student, scoreList);
    }

    @Override
    public Collection<String> getInsertionOrderedStudents() {
        return new LinkedHashSet<>(studentsScores.keySet());
    }

    @Override
    public Collection<Integer> getNaturallySortedPointsForStudent(String student) {
        if(!(studentsScores.containsKey(student))) return null;
        List<Integer> scores = studentsScores.get(student);
        Collections.sort(scores);
        return scores;
    }
}

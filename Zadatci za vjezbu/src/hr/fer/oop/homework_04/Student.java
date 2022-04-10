package hr.fer.oop.homework_04;

public class Student extends Person{
    private String studentId;
    private short academicYear;

    public Student(String name, String surname, int age, String studentId, short academicYear) {
        super(name, surname, age);
        this.studentId = studentId;
        this.academicYear = academicYear;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public short getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(short academicYear) {
        this.academicYear = academicYear;
    }

    @Override
    public String toString() {
        return super.toString() + ", student id=" + studentId + ", academic year=" + academicYear;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Student)) {
            return false;
        }
        Student other = (Student) obj;
        return this.studentId.equals(other.studentId);
    }
}

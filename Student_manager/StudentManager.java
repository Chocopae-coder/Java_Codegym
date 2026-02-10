package studentManager;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void add(Student student) {
        this.students.add(student);
    }

    public ArrayList<Student> getAll() {
        return this.students;
    }

    public void update(int id, Student student) {
        int index = this.getIndexById(id);
        this.students.set(index, student);
    }

    public Student getById(int id) {
        int index = this.getIndexById(id);
        return this.students.get(index);
    }

    public void remove(int id) {
        int index = this.getIndexById(id);
        this.students.remove(index);
    }

    public int getIndexById(int id) {
        for (int i = 0; i < this.students.size(); i++) {
            Student student = this.students.get(i);
            if (id == student.getId()) {
                return i;
            }
        }
        return -1;
    }

    public ArrayList<Student> getByNameContains(String keywork) {
        ArrayList<Student> listFined = new ArrayList<>();
        for(Student s: students) {
            if(s.getName().contains(keywork)) {
                listFined.add(s);
            }
        }
        return listFined;
    }
}

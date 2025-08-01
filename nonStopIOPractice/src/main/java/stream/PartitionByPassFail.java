package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student{
    String name;
    Integer score;
    public Student(String name, Integer score){
        this.name=name;
        this.score=score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}

public class PartitionByPassFail {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Paruk", 54),
                new Student("Raja", 34),
                new Student("Sukhie", 43),
                new Student("Surie", 75)
        );

        Map<Boolean, List<Student>> passedStudents = students.stream()
                .collect(Collectors.partitioningBy(s->s.getScore()>60));

        for (Map.Entry<Boolean, List<Student>> filtered : passedStudents.entrySet() ){
            System.out.print(filtered.getKey());
            printList(filtered.getValue());
        }
    }

    public static void printList(List<Student> studentList){
        for (Student s: studentList){
            System.out.print(s.getName()+" "+s.getScore());
            System.out.println();
        }
    }
}

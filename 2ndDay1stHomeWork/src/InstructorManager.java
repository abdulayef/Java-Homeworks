public class InstructorManager {

    Instructor instructor;

    public InstructorManager(Instructor instructor){
        this.instructor=instructor;

    }

    public void addStudent(Student student){
        System.out.println(student.firstName + " " + student.lastName + " İsimli öğrenci " + instructor.firstName + " isimli eğitmen tarafından kursa eklendi");

    }

    public void deleteStudent(Student student){
        System.out.println(student.firstName + " " + student.lastName + " İsimli öğrenci " + instructor.firstName + " isimli eğitmen tarafından kursdan silindi");

    }

}

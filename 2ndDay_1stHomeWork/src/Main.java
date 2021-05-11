public class Main {

    public static void main(String[] args) {

        Student birol=new Student("Birol", "ÖZTÜRK", "906", 0);

        Instructor engin=new Instructor("Engin", "DEMİROĞ", "1", 1);

        InstructorManager instructorManager=new InstructorManager(engin);

        instructorManager.addStudent(birol);
        instructorManager.deleteStudent(birol);

    }

}

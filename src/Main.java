public class Main{
    public static void main( String[] args ){
        CourseService courseService = new CourseService();

        String courseId = "math_01";
        String studentId = "120120";
        
        System.out.println("Información del curso");
        courseService.displayCourseInformation( courseId );
        System.out.println("Información del alumno");
        courseService.displayStudentInformation( studentId);

        System.out.println("Se agrega el curso");
        courseService.enrollStudent( studentId, courseId );
        System.out.println("Información del alumno con el curso");
        courseService.displayStudentInformation( studentId);

        System.out.println("Se elimina el curso");
        courseService.unEnrollStudent( studentId, courseId );
        System.out.println("Información del alumno sin el curso");
        courseService.displayStudentInformation( studentId);
    }
}//main
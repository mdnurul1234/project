package parser;

public class UnitTestingStudentProfile {

    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

        Student st = new Student();
         st.setFirstName("Nurul");
         st.setLastName("Islam");
         st.setScore("109");
         st.setId("102");

        System.out.println(st.getFirstName() + " " + st.getLastName()+ " " + st.getScore() + " " + st.getId());

  }
}

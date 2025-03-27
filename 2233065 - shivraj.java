import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

class Student {
    private String first_name;
    private String roll_number;

    // Getters and Setters
    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getRoll_number() {
        return roll_number;
    }

    public void setRoll_number(String roll_number) {
        this.roll_number = roll_number;
    }
}

class Institute {
    private String institute_name;
    private Student student;

    // Getters and Setters
    public String getInstitute_name() {
        return institute_name;
    }

    public void setInstitute_name(String institute_name) {
        this.institute_name = institute_name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}

public class JsonParser {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Read JSON file
            Institute institute = objectMapper.readValue(new File("input.json"), Institute.class);

            // Display parsed data
            System.out.println("Institute Name: " + institute.getInstitute_name());
            System.out.println("Student Name: " + institute.getStudent().getFirst_name());
            System.out.println("Roll Number: " + institute.getStudent().getRoll_number());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

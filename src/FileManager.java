import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileManager {

    // ==========================================
    // FILE NAME
    // ==========================================

    private static final String FILE_NAME =
            "students.txt";


    // ==========================================
    // SAVE STUDENT DATA
    // ==========================================

    public static void saveStudents(
            ArrayList<Student> students
    ) {

        try {

            PrintWriter writer =
                    new PrintWriter(
                            new FileWriter(FILE_NAME)
                    );


            // Save every student
            for (Student student : students) {

                // Basic student information
                writer.println(
                        "STUDENT"
                );

                writer.println(
                        student.studentId
                );

                writer.println(
                        student.name
                );

                writer.println(
                        student.course
                );

                writer.println(
                        student.year
                );


                // ------------------------------------------
                // Skills student can teach
                // ------------------------------------------

                writer.println(
                        "OFFERED"
                );


                for (
                        Skill skill :
                        student.offeredSkills
                ) {

                    writer.println(
                            skill.skillName
                            + "|"
                            + skill.category
                    );
                }


                // ------------------------------------------
                // Skills student wants to learn
                // ------------------------------------------

                writer.println(
                        "WANTED"
                );


                for (
                        Skill skill :
                        student.wantedSkills
                ) {

                    writer.println(
                            skill.skillName
                            + "|"
                            + skill.category
                    );
                }


                // End of student
                writer.println(
                        "END"
                );
            }


            writer.close();


            System.out.println(
                    "Student data saved successfully."
            );


        } catch (IOException e) {

            System.out.println(
                    "Error while saving student data."
            );
        }
    }


    // ==========================================
    // LOAD STUDENT DATA
    // ==========================================

    public static void loadStudents(
            ArrayList<Student> students
    ) {

        try {

            BufferedReader reader =
                    new BufferedReader(
                            new FileReader(FILE_NAME)
                    );


            String line;


            // Read file line by line
            while ((line = reader.readLine()) != null) {

                // Look for the beginning
                // of a student record
                if (line.equals("STUDENT")) {

                    Student student =
                            new Student();


                    // --------------------------------------
                    // Basic student information
                    // --------------------------------------

                    student.studentId =
                            reader.readLine();

                    student.name =
                            reader.readLine();

                    student.course =
                            reader.readLine();

                    student.year =
                            Integer.parseInt(
                                    reader.readLine()
                            );


                    // --------------------------------------
                    // Read remaining information
                    // --------------------------------------

                    line = reader.readLine();


                    // Read offered skills
                    if (line.equals("OFFERED")) {

                        while (
                                !(line =
                                        reader.readLine())
                                        .equals("WANTED")
                        ) {

                            String[] skillData =
                                    line.split(
                                            "\\|"
                                    );


                            if (
                                    skillData.length == 2
                            ) {

                                Skill skill =
                                        new Skill();

                                skill.skillName =
                                        skillData[0];

                                skill.category =
                                        skillData[1];


                                student.offeredSkills.add(
                                        skill
                                );
                            }
                        }
                    }


                    // --------------------------------------
                    // Read wanted skills
                    // --------------------------------------

                    if (line.equals("WANTED")) {

                        while (
                                !(line =
                                        reader.readLine())
                                        .equals("END")
                        ) {

                            String[] skillData =
                                    line.split(
                                            "\\|"
                                    );


                            if (
                                    skillData.length == 2
                            ) {

                                Skill skill =
                                        new Skill();

                                skill.skillName =
                                        skillData[0];

                                skill.category =
                                        skillData[1];


                                student.wantedSkills.add(
                                        skill
                                );
                            }
                        }
                    }


                    // Add loaded student
                    students.add(student);
                }
            }


            reader.close();


            if (!students.isEmpty()) {

                System.out.println(
                        "Student data loaded successfully."
                );
            }


        } catch (IOException e) {

            // File does not exist yet.
            // This is normal for the first run.
            System.out.println(
                    "No previous student data found."
            );

        } catch (NumberFormatException e) {

            System.out.println(
                    "Invalid student data in file."
            );
        }
    }
}
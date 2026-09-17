import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // =====================================================
        // CREATE SCANNER
        // =====================================================

        Scanner sc = new Scanner(System.in);


        // =====================================================
        // STUDENT LIST
        // =====================================================

        // Stores all registered students
        ArrayList<Student> students = new ArrayList<>();


        // =====================================================
        // LOAD SAVED STUDENTS
        // =====================================================

        // Load students from students.txt when
        // the program starts
        FileManager.loadStudents(students);


        // =====================================================
        // CREATE MANAGERS
        // =====================================================

        // Manages exchange requests
        ExchangeManager exchangeManager =
                new ExchangeManager();


        // Manages ratings and feedback
        RatingManager ratingManager =
                new RatingManager();


        // Manages completed exchange history
        HistoryManager historyManager =
                new HistoryManager();


        // =====================================================
        // REQUEST ID COUNTER
        // =====================================================

        int requestNumber = 1;


        // =====================================================
        // MAIN PROGRAM CONTROL
        // =====================================================

        boolean running = true;


        // =====================================================
        // MAIN MENU
        // =====================================================

        while (running) {

            System.out.println("\n=================================");
            System.out.println("      CAMPUS SKILL EXCHANGE");
            System.out.println("=================================");

            System.out.println("1. Register Student");
            System.out.println("2. View Students");
            System.out.println("3. Find Skill Matches");
            System.out.println("4. Send Exchange Request");
            System.out.println("5. View Exchange Requests");
            System.out.println("6. Accept Exchange Request");
            System.out.println("7. Reject Exchange Request");
            System.out.println("8. Complete Exchange");
            System.out.println("9. Give Rating");
            System.out.println("10. View Exchange History");
            System.out.println("11. View Ratings");
            System.out.println("12. Exit");


            // Take menu choice
            int choice = readInteger(
                    sc,
                    "\nEnter your choice: "
            );


            // =================================================
            // MENU SWITCH
            // =================================================

            switch (choice) {


                // =================================================
                // CASE 1: REGISTER STUDENT
                // =================================================

                case 1:

                    System.out.println(
                            "\n--- STUDENT REGISTRATION ---"
                    );


                    // -------------------------------------------------
                    // STUDENT ID
                    // -------------------------------------------------

                    String studentId;


                    while (true) {

                        studentId = readNonEmpty(
                                sc,
                                "Enter Student ID: "
                        );


                        // Check duplicate ID
                        if (
                                isDuplicateId(
                                        students,
                                        studentId
                                )
                        ) {

                            System.out.println(
                                    "This Student ID already exists."
                            );

                        } else {

                            break;
                        }
                    }


                    // -------------------------------------------------
                    // STUDENT NAME
                    // -------------------------------------------------

                    String name = readNonEmpty(
                            sc,
                            "Enter Name: "
                    );


                    // -------------------------------------------------
                    // COURSE
                    // -------------------------------------------------

                    String course = readNonEmpty(
                            sc,
                            "Enter Course: "
                    );


                    // -------------------------------------------------
                    // YEAR
                    // -------------------------------------------------

                    int year = readIntegerInRange(
                            sc,
                            "Enter Year (1-4): ",
                            1,
                            4
                    );


                    // -------------------------------------------------
                    // CREATE STUDENT OBJECT
                    // -------------------------------------------------

                    Student student = new Student();


                    student.studentId = studentId;
                    student.name = name;
                    student.course = course;
                    student.year = year;


                    // =================================================
                    // SKILLS STUDENT CAN TEACH
                    // =================================================

                    System.out.println(
                            "\n--- SKILLS YOU CAN TEACH ---"
                    );


                    int offeredCount =
                            readIntegerInRange(
                                    sc,
                                    "How many skills can you teach? ",
                                    0,
                                    20
                            );


                    for (
                            int i = 1;
                            i <= offeredCount;
                            i++
                    ) {

                        System.out.println(
                                "\nSkill " + i
                        );


                        String skillName =
                                readNonEmpty(
                                        sc,
                                        "Enter skill name: "
                                );


                        String category =
                                readNonEmpty(
                                        sc,
                                        "Enter category: "
                                );


                        // Create Skill object
                        Skill skill = new Skill();


                        skill.skillName =
                                skillName;


                        skill.category =
                                category;


                        // Add skill to student's
                        // offered skills
                        student.offeredSkills.add(
                                skill
                        );
                    }


                    // =================================================
                    // SKILLS STUDENT WANTS TO LEARN
                    // =================================================

                    System.out.println(
                            "\n--- SKILLS YOU WANT TO LEARN ---"
                    );


                    int wantedCount =
                            readIntegerInRange(
                                    sc,
                                    "How many skills do you want to learn? ",
                                    0,
                                    20
                            );


                    for (
                            int i = 1;
                            i <= wantedCount;
                            i++
                    ) {

                        System.out.println(
                                "\nSkill " + i
                        );


                        String skillName =
                                readNonEmpty(
                                        sc,
                                        "Enter skill name: "
                                );


                        String category =
                                readNonEmpty(
                                        sc,
                                        "Enter category: "
                                );


                        // Create Skill object
                        Skill skill = new Skill();


                        skill.skillName =
                                skillName;


                        skill.category =
                                category;


                        // Add skill to student's
                        // wanted skills
                        student.wantedSkills.add(
                                skill
                        );
                    }


                    // =================================================
                    // ADD STUDENT
                    // =================================================

                    students.add(student);


                    // =================================================
                    // SAVE STUDENTS TO FILE
                    // =================================================

                    FileManager.saveStudents(
                            students
                    );


                    System.out.println(
                            "\nStudent registered successfully!"
                    );


                    break;


                // =================================================
                // CASE 2: VIEW STUDENTS
                // =================================================

                case 2:

                    System.out.println(
                            "\n================================="
                    );


                    System.out.println(
                            "       REGISTERED STUDENTS"
                    );


                    System.out.println(
                            "================================="
                    );


                    if (students.isEmpty()) {

                        System.out.println(
                                "No students registered yet."
                        );

                    } else {


                        // Display every student

                        for (Student s : students) {

                            System.out.println(
                                    "\n---------------------------------"
                            );


                            System.out.println(
                                    "Student ID: "
                                    + s.studentId
                            );


                            System.out.println(
                                    "Name: "
                                    + s.name
                            );


                            System.out.println(
                                    "Course: "
                                    + s.course
                            );


                            System.out.println(
                                    "Year: "
                                    + s.year
                            );


                            // -------------------------------------------------
                            // OFFERED SKILLS
                            // -------------------------------------------------

                            System.out.println(
                                    "\nSkills they can teach:"
                            );


                            if (
                                    s.offeredSkills.isEmpty()
                            ) {

                                System.out.println(
                                        "- No skills added"
                                );

                            } else {

                                for (
                                        Skill skill :
                                        s.offeredSkills
                                ) {

                                    System.out.println(
                                            "- "
                                            + skill.skillName
                                            + " ("
                                            + skill.category
                                            + ")"
                                    );
                                }
                            }


                            // -------------------------------------------------
                            // WANTED SKILLS
                            // -------------------------------------------------

                            System.out.println(
                                    "\nSkills they want to learn:"
                            );


                            if (
                                    s.wantedSkills.isEmpty()
                            ) {

                                System.out.println(
                                        "- No skills added"
                                );

                            } else {

                                for (
                                        Skill skill :
                                        s.wantedSkills
                                ) {

                                    System.out.println(
                                            "- "
                                            + skill.skillName
                                            + " ("
                                            + skill.category
                                            + ")"
                                    );
                                }
                            }
                        }
                    }


                    break;


                // =================================================
                // CASE 3: FIND SKILL MATCHES
                // =================================================

                case 3:

                    System.out.println(
                            "\n================================="
                    );


                    System.out.println(
                            "         FIND SKILL MATCHES"
                    );


                    System.out.println(
                            "================================="
                    );


                    if (students.size() < 2) {

                        System.out.println(
                                "At least 2 students are required."
                        );

                    } else {


                        // Compare every pair of students

                        for (
                                int i = 0;
                                i < students.size();
                                i++
                        ) {

                            for (
                                    int j = i + 1;
                                    j < students.size();
                                    j++
                            ) {


                                Student student1 =
                                        students.get(i);


                                Student student2 =
                                        students.get(j);


                                SkillMatcher.findMatch(
                                        student1,
                                        student2
                                );
                            }
                        }
                    }


                    break;


                // =================================================
                // CASE 4: SEND EXCHANGE REQUEST
                // =================================================

                case 4:

                    if (students.size() < 2) {

                        System.out.println(
                                "\nAt least 2 students are required."
                        );


                        break;
                    }


                    System.out.println(
                            "\n--- SEND EXCHANGE REQUEST ---"
                    );


                    // -------------------------------------------------
                    // DISPLAY STUDENTS
                    // -------------------------------------------------

                    System.out.println(
                            "\nAvailable Students:"
                    );


                    for (
                            int i = 0;
                            i < students.size();
                            i++
                    ) {

                        Student s =
                                students.get(i);


                        System.out.println(
                                (i + 1)
                                + ". "
                                + s.name
                                + " ("
                                + s.studentId
                                + ")"
                        );
                    }


                    // -------------------------------------------------
                    // SELECT SENDER
                    // -------------------------------------------------

                    int senderChoice =
                            readIntegerInRange(
                                    sc,
                                    "\nSelect sender: ",
                                    1,
                                    students.size()
                            );


                    Student sender =
                            students.get(
                                    senderChoice - 1
                            );


                    // -------------------------------------------------
                    // SELECT RECEIVER
                    // -------------------------------------------------

                    int receiverChoice =
                            readIntegerInRange(
                                    sc,
                                    "Select receiver: ",
                                    1,
                                    students.size()
                            );


                    Student receiver =
                            students.get(
                                    receiverChoice - 1
                            );


                    // -------------------------------------------------
                    // PREVENT SELF REQUEST
                    // -------------------------------------------------

                    if (sender == receiver) {

                        System.out.println(
                                "\nA student cannot send "
                                + "a request to themselves."
                        );


                        break;
                    }


                    // -------------------------------------------------
                    // SKILL OFFERED
                    // -------------------------------------------------

                    String skillOffered =
                            readNonEmpty(
                                    sc,
                                    "Enter skill you will teach: "
                            );


                    // -------------------------------------------------
                    // SKILL WANTED
                    // -------------------------------------------------

                    String skillWanted =
                            readNonEmpty(
                                    sc,
                                    "Enter skill you want to learn: "
                            );


                    // -------------------------------------------------
                    // GENERATE REQUEST ID
                    // -------------------------------------------------

                    String requestId =
                            "R"
                            + String.format(
                                    "%03d",
                                    requestNumber
                            );


                    requestNumber++;


                    // -------------------------------------------------
                    // SEND REQUEST
                    // -------------------------------------------------

                    exchangeManager.sendRequest(
                            requestId,
                            sender,
                            receiver,
                            skillOffered,
                            skillWanted
                    );


                    break;


                // =================================================
                // CASE 5: VIEW EXCHANGE REQUESTS
                // =================================================

                case 5:

                    exchangeManager.viewRequests();

                    break;


                // =================================================
                // CASE 6: ACCEPT REQUEST
                // =================================================

                case 6:

                    if (
                            exchangeManager.requests.isEmpty()
                    ) {

                        System.out.println(
                                "\nNo exchange requests available."
                        );

                    } else {

                        String acceptId =
                                readNonEmpty(
                                        sc,
                                        "\nEnter Request ID to accept: "
                                );


                        exchangeManager.acceptRequest(
                                acceptId
                        );
                    }


                    break;


                // =================================================
                // CASE 7: REJECT REQUEST
                // =================================================

                case 7:

                    if (
                            exchangeManager.requests.isEmpty()
                    ) {

                        System.out.println(
                                "\nNo exchange requests available."
                        );

                    } else {

                        String rejectId =
                                readNonEmpty(
                                        sc,
                                        "\nEnter Request ID to reject: "
                                );


                        exchangeManager.rejectRequest(
                                rejectId
                        );
                    }


                    break;


                // =================================================
                // CASE 8: COMPLETE EXCHANGE
                // =================================================

                case 8:

                    if (
                            exchangeManager.requests.isEmpty()
                    ) {

                        System.out.println(
                                "\nNo exchange requests available."
                        );

                    } else {

                        String completeId =
                                readNonEmpty(
                                        sc,
                                        "\nEnter Request ID to complete: "
                                );


                        // Find request
                        ExchangeRequest request =
                                findRequestById(
                                        exchangeManager.requests,
                                        completeId
                                );


                        if (request == null) {

                            System.out.println(
                                    "\nRequest ID not found."
                            );

                        } else if (
                                request.status.equals(
                                        "Accepted"
                                )
                        ) {


                            // Complete exchange

                            exchangeManager.completeExchange(
                                    completeId
                            );


                            // Add exchange to history

                            historyManager.addHistory(
                                    request
                            );

                        } else {

                            exchangeManager.completeExchange(
                                    completeId
                            );
                        }
                    }


                    break;


                // =================================================
                // CASE 9: GIVE RATING
                // =================================================

                case 9:

                    if (
                            exchangeManager.requests.isEmpty()
                    ) {

                        System.out.println(
                                "\nNo exchange requests available."
                        );


                        break;
                    }


                    System.out.println(
                            "\n--- GIVE RATING ---"
                    );


                    // -------------------------------------------------
                    // REQUEST ID
                    // -------------------------------------------------

                    String ratingRequestId =
                            readNonEmpty(
                                    sc,
                                    "Enter completed Request ID: "
                            );


                    // Find request

                    ExchangeRequest ratingRequest =
                            findRequestById(
                                    exchangeManager.requests,
                                    ratingRequestId
                            );


                    if (ratingRequest == null) {

                        System.out.println(
                                "\nRequest ID not found."
                        );


                        break;
                    }


                    // -------------------------------------------------
                    // CHECK COMPLETION
                    // -------------------------------------------------

                    if (
                            !ratingRequest.status.equals(
                                    "Completed"
                            )
                    ) {

                        System.out.println(
                                "\nRating can only be given "
                                + "after completing the exchange."
                        );


                        break;
                    }


                    // -------------------------------------------------
                    // SELECT RATING GIVER
                    // -------------------------------------------------

                    System.out.println(
                            "\nWho is giving the rating?"
                    );


                    System.out.println(
                            "1. "
                            + ratingRequest.sender.name
                    );


                    System.out.println(
                            "2. "
                            + ratingRequest.receiver.name
                    );


                    int giverChoice =
                            readIntegerInRange(
                                    sc,
                                    "Select student: ",
                                    1,
                                    2
                            );


                    Student giver;

                    Student ratingReceiver;


                    if (giverChoice == 1) {

                        giver =
                                ratingRequest.sender;


                        ratingReceiver =
                                ratingRequest.receiver;

                    } else {

                        giver =
                                ratingRequest.receiver;


                        ratingReceiver =
                                ratingRequest.sender;
                    }


                    // -------------------------------------------------
                    // RATING SCORE
                    // -------------------------------------------------

                    int score =
                            readIntegerInRange(
                                    sc,
                                    "Enter rating (1-5): ",
                                    1,
                                    5
                            );


                    // -------------------------------------------------
                    // FEEDBACK
                    // -------------------------------------------------

                    String feedback =
                            readNonEmpty(
                                    sc,
                                    "Enter feedback: "
                            );


                    // -------------------------------------------------
                    // SAVE RATING
                    // -------------------------------------------------

                    ratingManager.addRating(
                            giver,
                            ratingReceiver,
                            score,
                            feedback
                    );


                    break;


                // =================================================
                // CASE 10: VIEW EXCHANGE HISTORY
                // =================================================

                case 10:

                    historyManager.viewHistory();

                    break;


                // =================================================
                // CASE 11: VIEW RATINGS
                // =================================================

                case 11:

                    ratingManager.viewRatings();

                    break;


                // =================================================
                // CASE 12: EXIT
                // =================================================

                case 12:

                    running = false;


                    System.out.println(
                            "\n================================="
                    );


                    System.out.println(
                            "Thank you for using "
                            + "Campus Skill Exchange!"
                    );


                    System.out.println(
                            "================================="
                    );


                    break;


                // =================================================
                // INVALID OPTION
                // =================================================

                default:

                    System.out.println(
                            "\nInvalid choice."
                    );


                    System.out.println(
                            "Please enter a number between "
                            + "1 and 12."
                    );
            }
        }


        // =====================================================
        // CLOSE SCANNER
        // =====================================================

        sc.close();
    }


    // =========================================================
    // METHOD: READ NON-EMPTY TEXT
    // =========================================================

    public static String readNonEmpty(
            Scanner sc,
            String message
    ) {

        while (true) {

            System.out.print(message);


            String input =
                    sc.nextLine().trim();


            if (input.isEmpty()) {

                System.out.println(
                        "Input cannot be empty. "
                        + "Please try again."
                );

            } else {

                return input;
            }
        }
    }


    // =========================================================
    // METHOD: READ INTEGER
    // =========================================================

    public static int readInteger(
            Scanner sc,
            String message
    ) {

        while (true) {

            System.out.print(message);


            String input =
                    sc.nextLine().trim();


            try {

                return Integer.parseInt(input);

            } catch (NumberFormatException e) {

                System.out.println(
                        "Invalid input. "
                        + "Please enter a number."
                );
            }
        }
    }


    // =========================================================
    // METHOD: READ INTEGER WITH RANGE
    // =========================================================

    public static int readIntegerInRange(
            Scanner sc,
            String message,
            int minimum,
            int maximum
    ) {

        while (true) {

            int number =
                    readInteger(
                            sc,
                            message
                    );


            if (
                    number >= minimum
                    && number <= maximum
            ) {

                return number;

            } else {

                System.out.println(
                        "Please enter a number between "
                        + minimum
                        + " and "
                        + maximum
                        + "."
                );
            }
        }
    }


    // =========================================================
    // METHOD: CHECK DUPLICATE STUDENT ID
    // =========================================================

    public static boolean isDuplicateId(
            ArrayList<Student> students,
            String studentId
    ) {

        for (Student student : students) {

            if (
                    student.studentId.equalsIgnoreCase(
                            studentId
                    )
            ) {

                return true;
            }
        }


        return false;
    }


    // =========================================================
    // METHOD: FIND REQUEST BY ID
    // =========================================================

    public static ExchangeRequest findRequestById(
            ArrayList<ExchangeRequest> requests,
            String requestId
    ) {

        for (ExchangeRequest request : requests) {

            if (
                    request.requestId.equalsIgnoreCase(
                            requestId
                    )
            ) {

                return request;
            }
        }


        return null;
    }
}

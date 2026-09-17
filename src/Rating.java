public class Rating {

    // ==========================================
    // RATING INFORMATION
    // ==========================================

    Student giver;

    Student receiver;

    int score;

    String feedback;


    // ==========================================
    // CONSTRUCTOR
    // ==========================================

    public Rating(
            Student giver,
            Student receiver,
            int score,
            String feedback
    ) {

        this.giver = giver;
        this.receiver = receiver;
        this.score = score;
        this.feedback = feedback;
    }
}
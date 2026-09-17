import java.util.ArrayList;

public class RatingManager {

    // ==========================================
    // STORE ALL RATINGS
    // ==========================================

    ArrayList<Rating> ratings = new ArrayList<>();


    // ==========================================
    // ADD RATING
    // ==========================================

    public void addRating(
            Student giver,
            Student receiver,
            int score,
            String feedback
    ) {

        Rating rating = new Rating(
                giver,
                receiver,
                score,
                feedback
        );

        ratings.add(rating);

        System.out.println(
                "\nRating submitted successfully!"
        );
    }


    // ==========================================
    // VIEW ALL RATINGS
    // ==========================================

    public void viewRatings() {

        System.out.println(
                "\n================================="
        );

        System.out.println(
                "          RATINGS & FEEDBACK"
        );

        System.out.println(
                "================================="
        );


        if (ratings.isEmpty()) {

            System.out.println(
                    "No ratings available yet."
            );

            return;
        }


        for (Rating rating : ratings) {

            System.out.println(
                    "\n---------------------------------"
            );

            System.out.println(
                    "From: " + rating.giver.name
            );

            System.out.println(
                    "For: " + rating.receiver.name
            );

            System.out.println(
                    "Rating: "
                    + rating.score
                    + "/5"
            );

            System.out.println(
                    "Feedback: "
                    + rating.feedback
            );
        }
    }
}
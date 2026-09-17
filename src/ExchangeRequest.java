public class ExchangeRequest {

    // ==========================================
    // INFORMATION ABOUT AN EXCHANGE REQUEST
    // ==========================================

    String requestId;

    // Student who sends the request
    Student sender;

    // Student who receives the request
    Student receiver;

    // Skill that sender will teach
    String skillOffered;

    // Skill that sender wants to learn
    String skillWanted;

    // Current status of request
    // Possible values:
    // Pending, Accepted, Rejected, Completed
    String status;


    // ==========================================
    // CONSTRUCTOR
    // ==========================================

    public ExchangeRequest(
            String requestId,
            Student sender,
            Student receiver,
            String skillOffered,
            String skillWanted
    ) {

        this.requestId = requestId;
        this.sender = sender;
        this.receiver = receiver;
        this.skillOffered = skillOffered;
        this.skillWanted = skillWanted;

        // Every new request starts as Pending
        this.status = "Pending";
    }
}
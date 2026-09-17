public class ExchangeHistory {

    // ==========================================
    // COMPLETED EXCHANGE INFORMATION
    // ==========================================

    String requestId;

    Student student1;

    Student student2;

    String skill1;

    String skill2;


    // ==========================================
    // CONSTRUCTOR
    // ==========================================

    public ExchangeHistory(
            String requestId,
            Student student1,
            Student student2,
            String skill1,
            String skill2
    ) {

        this.requestId = requestId;
        this.student1 = student1;
        this.student2 = student2;
        this.skill1 = skill1;
        this.skill2 = skill2;
    }
}
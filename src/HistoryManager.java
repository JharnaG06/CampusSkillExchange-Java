import java.util.ArrayList;

public class HistoryManager {

    // ==========================================
    // STORE COMPLETED EXCHANGES
    // ==========================================

    ArrayList<ExchangeHistory> history =
            new ArrayList<>();


    // ==========================================
    // ADD COMPLETED EXCHANGE
    // ==========================================

    public void addHistory(
            ExchangeRequest request
    ) {

        ExchangeHistory completedExchange =
                new ExchangeHistory(
                        request.requestId,
                        request.sender,
                        request.receiver,
                        request.skillOffered,
                        request.skillWanted
                );

        history.add(completedExchange);
    }


    // ==========================================
    // VIEW EXCHANGE HISTORY
    // ==========================================

    public void viewHistory() {

        System.out.println(
                "\n================================="
        );

        System.out.println(
                "        EXCHANGE HISTORY"
        );

        System.out.println(
                "================================="
        );


        if (history.isEmpty()) {

            System.out.println(
                    "No completed exchanges yet."
            );

            return;
        }


        for (ExchangeHistory exchange : history) {

            System.out.println(
                    "\n---------------------------------"
            );

            System.out.println(
                    "Request ID: "
                    + exchange.requestId
            );

            System.out.println(
                    exchange.student1.name
                    + " taught "
                    + exchange.skill1
            );

            System.out.println(
                    exchange.student2.name
                    + " taught "
                    + exchange.skill2
            );

            System.out.println(
                    "Status: Completed"
            );
        }
    }
}
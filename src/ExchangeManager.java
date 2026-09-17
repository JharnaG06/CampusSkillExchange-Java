import java.util.ArrayList;

public class ExchangeManager {

    // ==========================================
    // STORE ALL EXCHANGE REQUESTS
    // ==========================================

    ArrayList<ExchangeRequest> requests = new ArrayList<>();


    // ==========================================
    // SEND EXCHANGE REQUEST
    // ==========================================

    public void sendRequest(
            String requestId,
            Student sender,
            Student receiver,
            String skillOffered,
            String skillWanted
    ) {

        // Create a new exchange request
        ExchangeRequest request = new ExchangeRequest(
                requestId,
                sender,
                receiver,
                skillOffered,
                skillWanted
        );

        // Add request to the list
        requests.add(request);

        System.out.println("\nExchange request sent successfully!");
        System.out.println("Request ID: " + requestId);
        System.out.println("From: " + sender.name);
        System.out.println("To: " + receiver.name);
        System.out.println("Skill Offered: " + skillOffered);
        System.out.println("Skill Wanted: " + skillWanted);
        System.out.println("Status: " + request.status);
    }


    // ==========================================
    // VIEW ALL REQUESTS
    // ==========================================

    public void viewRequests() {

        System.out.println("\n=================================");
        System.out.println("        EXCHANGE REQUESTS");
        System.out.println("=================================");

        // Check if there are no requests
        if (requests.isEmpty()) {

            System.out.println("No exchange requests found.");

            return;
        }

        // Display every request
        for (ExchangeRequest request : requests) {

            System.out.println("\n---------------------------------");

            System.out.println(
                    "Request ID: " + request.requestId
            );

            System.out.println(
                    "From: " + request.sender.name
            );

            System.out.println(
                    "To: " + request.receiver.name
            );

            System.out.println(
                    "Skill Offered: " + request.skillOffered
            );

            System.out.println(
                    "Skill Wanted: " + request.skillWanted
            );

            System.out.println(
                    "Status: " + request.status
            );
        }
    }


    // ==========================================
    // ACCEPT REQUEST
    // ==========================================

    public void acceptRequest(String requestId) {

        for (ExchangeRequest request : requests) {

            if (request.requestId.equalsIgnoreCase(requestId)) {

                if (request.status.equals("Pending")) {

                    request.status = "Accepted";

                    System.out.println(
                            "\nExchange request accepted!"
                    );

                } else {

                    System.out.println(
                            "\nThis request is already "
                            + request.status + "."
                    );
                }

                return;
            }
        }

        System.out.println(
                "\nRequest ID not found."
        );
    }


    // ==========================================
    // REJECT REQUEST
    // ==========================================

    public void rejectRequest(String requestId) {

        for (ExchangeRequest request : requests) {

            if (request.requestId.equalsIgnoreCase(requestId)) {

                if (request.status.equals("Pending")) {

                    request.status = "Rejected";

                    System.out.println(
                            "\nExchange request rejected."
                    );

                } else {

                    System.out.println(
                            "\nThis request is already "
                            + request.status + "."
                    );
                }

                return;
            }
        }

        System.out.println(
                "\nRequest ID not found."
        );
    }


    // ==========================================
    // COMPLETE EXCHANGE
    // ==========================================

    public void completeExchange(String requestId) {

        for (ExchangeRequest request : requests) {

            if (request.requestId.equalsIgnoreCase(requestId)) {

                if (request.status.equals("Accepted")) {

                    request.status = "Completed";

                    System.out.println(
                            "\nSkill exchange completed successfully!"
                    );

                } else {

                    System.out.println(
                            "\nOnly an accepted request "
                            + "can be completed."
                    );
                }

                return;
            }
        }

        System.out.println(
                "\nRequest ID not found."
        );
    }
}
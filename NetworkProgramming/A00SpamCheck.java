import java.net.*;

public class A00SpamCheck {

    // Program banner and DNSBL service
    public static final String BANNER = "=== Spamhaus IP Blacklist Checker ===";
    public static final String BLACKHOLE = "zen.spamhaus.org";

    /**
     * Checks whether a given IP address is blacklisted.
     * @param ip The IP address (e.g., "1.2.3.4")
     * @return true if blacklisted, false if not
     */
    private static boolean isSpammer(String ip) {
        try {
            // Split IP into its four octets
            String[] parts = ip.split("\\.");
            if (parts.length != 4) {
                System.err.println("Invalid IP format: " + ip);
                return false;
            }

            // Reverse the IP address and append the Spamhaus domain
            String query = parts[3] + "." + parts[2] + "." + parts[1] + "." + parts[0] + "." + BLACKHOLE;

            // Try to resolve the reversed IP
            InetAddress.getByName(query);

            // If it resolves, it's blacklisted
            return true;
        } catch (UnknownHostException e) {
            // If not found, it's not blacklisted
            return false;
        }
    }

    /**
     * Main program entry point
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java SpamCheck <IP1> <IP2> ...");
            return;
        }

        System.out.println(BANNER);
        System.out.printf("%-17s | %s%n", "Host", "Status");
        System.out.println("---------------------");

        for (String ip : args) {
            if (isSpammer(ip)) {
                System.out.printf("%-17s | %s%n", ip, "Spammer");
            } else {
                System.out.printf("%-17s | %s%n", ip, "Legitimate");
            }
        }
    }
}
package Java3;

import java.util.Locale;

public class Select_Network_fact
{
    public cellularplan getPlan(String planType) {
        if (planType== null || planType.isEmpty())
            return null;
        switch (planType.toLowerCase()) {
            case "airtel":
                return new airtel_Network();
            case "vodaphone":
                return new Vodaphone_Network();
            default:
                throw new IllegalArgumentException("Unknown channel "+planType);
        }
    }

}
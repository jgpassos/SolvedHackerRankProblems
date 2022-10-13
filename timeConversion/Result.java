package timeConversion;

class Result {

    /*
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // String s: input time in 12 hour format
        
        int hour = Integer.parseInt(s.substring(0, 2));
        String time = s.substring(s.length() - 2, s.length());
        
        if(time.equals("PM") && hour != 12 ) {
            return (hour + 12) + s.substring(2, s.length() -2);
        }
        if(time.equals("AM") && hour == 12) {
            return "00" + s.substring(2, s.length() - 2);
        }
        return s.replace("AM", "").replace("PM", "");
    }
}

package JavaInputOutput;

public class EmailDomainCounter {
    public static void main(String[] args) throws Exception {

        BufferedReader br =
                new BufferedReader(new FileReader("emails.txt"));

        String email;

        int gmail = 0;
        int yahoo = 0;
        int others = 0;

        while ((email = br.readLine()) != null) {

            String domain =
                    email.substring(email.indexOf("@") + 1);

            if (domain.equals("gmail.com"))
                gmail++;
            else if (domain.equals("yahoo.com"))
                yahoo++;
            else
                others++;
        }

        br.close();

        System.out.println("Gmail Users = " + gmail);
        System.out.println("Yahoo Users = " + yahoo);
        System.out.println("Others = " + others);
    }
}
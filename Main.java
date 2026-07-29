/*
 * DEVELOPER: <your name>
 * COLLABORATORS: <anyone who helped>
 * COURSE: CS 111 Intro to CS I - Java
 * LAST MODIFIED: July 28, 2026
 *
 * DACArecipient Tester
 * PROGRAM DESCRIPTION:
 * Tests the DACArecipient class by creating two recipients (one built with
 * individual setters, one with setAll) and printing their data.
 */

/**
 * Tests the DACArecipient class by building two recipients and printing them.
 */
class Main
{
    /**
     * Creates two DACArecipient objects and prints their data.
     *
     * @param args the command-line arguments (not used)
     */
    public static void main(String[] args)
    {
        //First recipient: set each field with its own setter
        DACArecipient person1 = new DACArecipient();
        person1.setSurname("Mendez");
        person1.setGivenName("Javier");
        person1.setUscisNumber("56-3-445");
        person1.setCountryOfOrigin("Venezuela");
        person1.setBirthday(2451564);
        person1.setValidFromDate(3956753);
        person1.setExpirationDate(3956840);
        person1.setSex('M');

        //Second recipient: set everything at once with setAll
        DACArecipient person2 = new DACArecipient();
        person2.setAll("Kim", "Seo-yun", "25-6-567", "South Korea",
                2451257, 39567322, 39567818, 'F');

        printRecipient("Person 1", person1);
        System.out.println();
        printRecipient("Person 2", person2);
    }

    /**
     * Prints all fields of one recipient under a heading.
     *
     * @param heading the label to show above the data
     * @param person the recipient whose data is printed
     */
    public static void printRecipient(String heading, DACArecipient person)
    {
        System.out.println(heading);
        System.out.println("-----------------------------");
        System.out.println("Surname: " + person.getSurname());
        System.out.println("Given name: " + person.getGivenName());
        System.out.println("USCIS Number: " + person.getUscisNumber());
        System.out.println("Country of Origin: " + person.getCountryOfOrigin());
        System.out.println("Birthday(JDN): " + person.getBirthday());
        System.out.println("Valid From Date(JDN): " + person.getValidFromDate());
        System.out.println("Expiration Date(JDN): " + person.getExpirationDate());
        System.out.println("Sex: " + person.getSex());
    }
}

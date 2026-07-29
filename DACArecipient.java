/*
 * UML CLASS DIAGRAM:
 * -----------------------------------------
 * DACArecipient
 * -----------------------------------------
 * - surname : String
 * - givenName : String
 * - uscisNumber : String
 * - countryOfOrigin : String
 * - birthday : int
 * - validFromDate : int
 * - expirationDate : int
 * - sex : char
 * -----------------------------------------
 * + getSurname() : String
 * + setSurname(surname : String) : void
 * + getGivenName() : String
 * + setGivenName(givenName : String) : void
 * + getUscisNumber() : String
 * + setUscisNumber(uscisNumber : String) : void
 * + getCountryOfOrigin() : String
 * + setCountryOfOrigin(countryOfOrigin : String) : void
 * + getBirthday() : int
 * + setBirthday(birthday : int) : void
 * + getValidFromDate() : int
 * + setValidFromDate(validFromDate : int) : void
 * + getExpirationDate() : int
 * + setExpirationDate(expirationDate : int) : void
 * + getSex() : char
 * + setSex(sex : char) : void
 * + setAll(surname : String, givenName : String, uscisNumber : String,
 *          countryOfOrigin : String, birthday : int, validFromDate : int,
 *          expirationDate : int, sex : char) : void
 * -----------------------------------------
 */

/**
 * Represents one person receiving Deferred Action for Childhood Arrivals (DACA).
 *
 * @author add your name here
 * @version 1.0
 */
public class DACArecipient
{
    // ===== INSTANCE VARIABLES =====
    private String surname;
    private String givenName;
    private String uscisNumber;
    private String countryOfOrigin;
    private int birthday;
    private int validFromDate;
    private int expirationDate;
    private char sex;

    // ===== ACCESSORS =====
    /**
     * Gets the surname.
     *
     * @return the surname
     */
    public String getSurname()
    {
        return surname;
    }

    /**
     * Gets the given name.
     *
     * @return the given name
     */
    public String getGivenName()
    {
        return givenName;
    }

    /**
     * Gets the USCIS number.
     *
     * @return the USCIS number
     */
    public String getUscisNumber()
    {
        return uscisNumber;
    }

    /**
     * Gets the country of origin.
     *
     * @return the country of origin
     */
    public String getCountryOfOrigin()
    {
        return countryOfOrigin;
    }

    /**
     * Gets the birthday (Julian Day Number).
     *
     * @return the birthday (Julian Day Number)
     */
    public int getBirthday()
    {
        return birthday;
    }

    /**
     * Gets the valid-from date (Julian Day Number).
     *
     * @return the valid-from date (Julian Day Number)
     */
    public int getValidFromDate()
    {
        return validFromDate;
    }

    /**
     * Gets the expiration date (Julian Day Number).
     *
     * @return the expiration date (Julian Day Number)
     */
    public int getExpirationDate()
    {
        return expirationDate;
    }

    /**
     * Gets the sex.
     *
     * @return the sex
     */
    public char getSex()
    {
        return sex;
    }

    // ===== MUTATORS =====
    /**
     * Sets the surname.
     *
     * @param surname the surname
     */
    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    /**
     * Sets the given name.
     *
     * @param givenName the given name
     */
    public void setGivenName(String givenName)
    {
        this.givenName = givenName;
    }

    /**
     * Sets the USCIS number.
     *
     * @param uscisNumber the USCIS number
     */
    public void setUscisNumber(String uscisNumber)
    {
        this.uscisNumber = uscisNumber;
    }

    /**
     * Sets the country of origin.
     *
     * @param countryOfOrigin the country of origin
     */
    public void setCountryOfOrigin(String countryOfOrigin)
    {
        this.countryOfOrigin = countryOfOrigin;
    }

    /**
     * Sets the birthday (Julian Day Number).
     *
     * @param birthday the birthday (Julian Day Number)
     */
    public void setBirthday(int birthday)
    {
        this.birthday = birthday;
    }

    /**
     * Sets the valid-from date (Julian Day Number).
     *
     * @param validFromDate the valid-from date (Julian Day Number)
     */
    public void setValidFromDate(int validFromDate)
    {
        this.validFromDate = validFromDate;
    }

    /**
     * Sets the expiration date (Julian Day Number).
     *
     * @param expirationDate the expiration date (Julian Day Number)
     */
    public void setExpirationDate(int expirationDate)
    {
        this.expirationDate = expirationDate;
    }

    /**
     * Sets the sex.
     *
     * @param sex the sex
     */
    public void setSex(char sex)
    {
        this.sex = sex;
    }

    /**
     * Sets every instance variable at once.
     *
     * @param surname the surname
     * @param givenName the given name
     * @param uscisNumber the USCIS number
     * @param countryOfOrigin the country of origin
     * @param birthday the birthday (Julian Day Number)
     * @param validFromDate the valid-from date (Julian Day Number)
     * @param expirationDate the expiration date (Julian Day Number)
     * @param sex the sex
     */
    public void setAll(String surname, String givenName, String uscisNumber,
            String countryOfOrigin, int birthday, int validFromDate,
            int expirationDate, char sex)
    {
        setSurname(surname);
        setGivenName(givenName);
        setUscisNumber(uscisNumber);
        setCountryOfOrigin(countryOfOrigin);
        setBirthday(birthday);
        setValidFromDate(validFromDate);
        setExpirationDate(expirationDate);
        setSex(sex);
    }
}

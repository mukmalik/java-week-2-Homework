package javaWeek2HomeWork;

public class Program14_Person
{
    String firstName, lastName;
    int age;

    public  String getFirstName()
    {
        firstName = "Shaa";
        return firstName;
    }
    public String getLastName()
    {
        lastName = "Duke";
        return lastName;
    }
    public int getAge()
    {
        age = 22;
        return age;
    }

    public void setFirstName(String firstName)
    {
            this.firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public void setAge(int age)
    {
        if(age<0 || age>100)
        {
            age = 0;
        }
    }

    public boolean isTeen()
    {
        if (age>12 && age<20)
        {           return true;       }
        else { return false;}

    }
    public String getFullName()
    {
        if(firstName.isEmpty())
        {
            return lastName;
        }
        if (lastName.isEmpty())
        {
            return firstName;
        }
        if ((firstName.isEmpty() && lastName.isEmpty()))
        {
            return " ";
        }
        else
        {
            return firstName + "  " + lastName;
        }

    }

    public static void main(String[] args)
    {
        Program14_Person person = new Program14_Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());

    }



}

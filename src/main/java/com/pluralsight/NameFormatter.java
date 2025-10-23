package com.pluralsight;

public class NameFormatter {

    //private constructor so you can't instantiate the class
    private NameFormatter(){}

    //static method for firstName and lastName
    public static String format(String firstName,
                                String lastName){

        //if the first or last name is missing, returning an empty string
        if(firstName.isEmpty() || lastName.isEmpty()){
            return "";
        }
        //formatting correctly
        return lastName + ", " + firstName;
    }
    //static method for prefix, firstName, middleName, lastName, suffx
    public static String format(String prefix,
                                String firstName,
                                String middleName,
                                String lastName,
                                String suffix){
         if(firstName.isEmpty() || lastName.isEmpty()){
            return "";
         }
         //easier for more efficient concatenation
         StringBuilder stringBuild = new StringBuilder();

         //appending/adding the last name
        stringBuild.append(lastName);
        stringBuild.append(",");

        //adding/appending prefix if it exists
        if(!prefix.isEmpty()){
            stringBuild.append(prefix).append(" ");
        }
        //appending/adding first name
        stringBuild.append(firstName);

        //appending/adding middle name if it exists
        if(!middleName.isEmpty()){
            stringBuild.append(" ").append(middleName);
        }
        //appending/adding suffix if it exists
        if(!suffix.isEmpty()){
            stringBuild.append(", ").append(suffix);
        }
        //returning the formatted name string
        return stringBuild.toString();
    }
}



package com.company.factory;

public class Program {
    public static void main(String[] args){
        DeveloperFactory developerFactory = createDeveloperBySpecialty(4);
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(Integer specialty){
        switch (specialty){
            case 1: return new JavaDeveloperFactory();
            case 2: return new CppDeveloperFactory();
            case 3: return new PhpDeveloperFactory();
            default: throw  new RuntimeException(specialty + " is unknown specialty.");
        }
    }
}

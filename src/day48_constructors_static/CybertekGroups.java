package day48_constructors_static;

import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {
        // dependency injection. Group object creation depends on String name
        Group group1 = new Group("Cyberbugs");
        //print size of members
      //  System.out.println(group1.getMembers().size());

        group1.addMember("Elvin");
        group1.addMember("Maria");
        group1.addMember("Eva");
        group1.addMember("Maria");
        group1.addMember("Dave");
        group1.addMember("Kate");
        group1.addMember("Rasim");

        System.out.println(group1.getMembers().size());
        System.out.println(group1.toString());


        Group group2 = new Group("CyberCats");
        group2.setMembers(Arrays.asList("Stephen", "Wakshum", "Akrem", "Bulent", "Andreea", "Andrei"));
        System.out.println(group2.getMembers());

        if (group2.getMembers().contains("Akrem")) {
            System.out.println("Akrem is a member of group2");
        } else {
            System.out.println("Akrem is not in group2");
        }

        //remove some members from group1
        group1.removeMember("Pavel");
        group1.removeMember("Elvin");
        System.out.println(group1);
    }
}

public class SkillMatcher {

    // This method checks whether two students
    // have skills that they can exchange.
    public static void findMatch(Student student1, Student student2) {

        boolean matchFound = false;

        System.out.println("\n=================================");
        System.out.println("        SKILL MATCHING");
        System.out.println("=================================");

        // Check Jharna's offered skills
        // against Rahul's wanted skills
        for (Skill offeredSkill : student1.offeredSkills) {

            for (Skill wantedSkill : student2.wantedSkills) {

                if (offeredSkill.skillName.equalsIgnoreCase(wantedSkill.skillName)) {

                    System.out.println(student1.name + " can teach "
                            + offeredSkill.skillName
                            + " to " + student2.name);

                    matchFound = true;
                }
            }
        }

        // Check Rahul's offered skills
        // against Jharna's wanted skills
        for (Skill offeredSkill : student2.offeredSkills) {

            for (Skill wantedSkill : student1.wantedSkills) {

                if (offeredSkill.skillName.equalsIgnoreCase(wantedSkill.skillName)) {

                    System.out.println(student2.name + " can teach "
                            + offeredSkill.skillName
                            + " to " + student1.name);

                    matchFound = true;
                }
            }
        }

        // Display final result
        if (matchFound) {

            System.out.println("\n🎉 MUTUAL SKILL MATCH FOUND!");

        } else {

            System.out.println("\nNo skill match found.");

        }

        System.out.println("=================================");
    }
}
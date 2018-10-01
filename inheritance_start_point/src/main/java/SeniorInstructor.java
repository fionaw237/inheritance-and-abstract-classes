public class SeniorInstructor extends Instructor{
    private String secretSociety;

    public SeniorInstructor(String name, String cohort, String moduleTeam, String secretSociety){
        super(name, cohort, moduleTeam);
        this.secretSociety = secretSociety;
    }

}

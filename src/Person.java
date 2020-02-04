public class Person {
    //composition has-a relationship
    private Job job;
    private Education education;
    public Person(){
        this.job=new Job();
        job.setSalary(1000L);
        this.education = new Education();
        education.setSchools("Monda","Clara","Perito","Porres","Argentina","Real","Super");
    }


    public long getSalary() {
        return job.getSalary();
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }
}

public class Patient extends Person{
    private String idCardInsurance;

    public Patient(){}

    public Patient(String name, int id, double age, String idCardInsurance) {
        super(name, id, age);
        this.idCardInsurance = idCardInsurance;
    }

    public String getIdCardInsurance() {

        return idCardInsurance;
    }

    public void setIdCardInsurance(String idCardInsurance) {
        if( idCardInsurance != null)
        this.idCardInsurance = idCardInsurance;
    }

    @Override
    public String toString() {
        return super.toString() + "; id card insurance: " + idCardInsurance ;
    }
}

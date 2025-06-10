package models;

public class Contact <T,U>{
    private T nameT;
    private U numPhone;

    public Contact(T nameT, U numPhone) {
        this.nameT = nameT;
        this.numPhone = numPhone;
    }

    public T getNameT() {
        return nameT;
    }

    public void setNameT(T nameT) {
        this.nameT = nameT;
    }

    public U getNumPhone() {
        return numPhone;
    }

    public void setNumPhone(U numPhone) {
        this.numPhone = numPhone;
    }

    @Override
    public String toString(){
        return " Contacto: " +
                "Name: " + nameT +
                ", Phone: " + numPhone;
    }


    
}
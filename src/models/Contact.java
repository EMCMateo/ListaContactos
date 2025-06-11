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
/* 
    @Override
    public int hashCode() {
        
        return super.hashCode();
    }
        

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        return super.equals(obj);
    }
*/

@Override
public boolean equals(Object obj) {
    if (this == obj) {
        return true; // mismo objeto
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false; // null o diferente clase
    }
    Contact<?, ?> other = (Contact<?, ?>) obj;

    if (nameT == null) {
        if (other.nameT != null) return false;
    } else if (!nameT.equals(other.nameT)) {
        return false;
    }

    if (numPhone == null) {
        return other.numPhone == null;
    } else {
        return numPhone.equals(other.numPhone);
    }
}


    



    


    
}
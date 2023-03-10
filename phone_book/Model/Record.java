package phone_book.Model;

public class Record {
    String firstName;
    String lastName;
    String phone;

    Record(String firstName, String lastName, String phone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    @Override
    public String toString(){
        return this.firstName + " " + this.lastName + "\t" + this.phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
    public boolean isAppropriate(Record filter){
        return this.firstName.contains(filter.firstName) && this.lastName.contains(filter.lastName) && this.phone.contains(filter.phone);
    }
}
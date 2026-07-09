package a05062026;

public class Customer {

    private String name;

    private String mobile;

    public Customer(String name, String mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public boolean equals(Object obj) {

        Customer other = (Customer) obj;

        if (other.name == null && this.name!=null){
            return false;
        }
        if (other.name!=null && this.name==null){
            return false;
        }
        if (other.name == null && this.name == null){
            return true;
        }

        if (this.name.equals(other.name)){
            return true;
        }

        return true;
    }
}

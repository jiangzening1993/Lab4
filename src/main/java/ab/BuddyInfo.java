package ab; /**
 * Created by zeningjiang on 1/12/2017.
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BuddyInfo {
    public String name;
    public String address;
    public String phoneNum;

    @Id
    @GeneratedValue
    public long id;

    /*public BuddyInfo(long id, String name, String address, String phoneNum) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNum = phoneNum;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public String toString(){
        String str = "";
            str += getName() + " ";
            str += getAddress() + " ";
            str += getPhoneNum() + "\n";

        return str;
    }
}

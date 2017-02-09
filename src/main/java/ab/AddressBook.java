package ab;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

/**
 * Created by zeningjiang on 1/12/2017.
 */

public class AddressBook {

    private ArrayList<BuddyInfo> buddyInfos;
    private static final Logger log = LoggerFactory.getLogger(AddressBook.class);

    public AddressBook(){
        buddyInfos = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddyInfo){
        if(!buddyInfos.contains(buddyInfo)){
            buddyInfos.add(buddyInfo);
        }
    }

    public void removeBuddy(int index){
        if(buddyInfos.size() >= index && index > -1){
            buddyInfos.remove(index);
        }
    }

    public String toString(){
        String str = "";
        for(BuddyInfo bi : buddyInfos){
            str += bi.getName() + " ";
            str += bi.getAddress() + " ";
            str += bi.getPhoneNum() + "\n";
        }
        return str;
    }

    public int size(){
        return buddyInfos.size();
    }

 /*   @Bean
    public CommandLineRunner demo(BuddyList list){
        return (args) -> {
            //Part2.AddressBook addressBook = new Part2.AddressBook();
            //BuddyInfo bi = new BuddyInfo(1, "AAAA", "ZDC", "1234");
            //BuddyInfo bi2 = new BuddyInfo(2, "BBBB", "TYY", "5647");
            //addressBook.addBuddy(bi);
            //list.save(bi);
            //list.save(bi2);
            //System.out.println(addressBook.toString());
            for (BuddyInfo b : list.findAll()){
               log.info(b.toString());
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(AddressBook.class);
    }*/
}

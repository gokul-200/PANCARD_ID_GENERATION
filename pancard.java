
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class pancard {   
     public static String generateAlp() {
            StringBuilder alpha = new StringBuilder(3);
            Random random = new Random();
            for (int i = 0; i < 3; i++) {
                int num = random.nextInt(26);
                alpha.append((char) ('A' + num));
            }
            return alpha.toString();
    }


    public static char input(String lastname){
        
        char fifthchar=lastname.charAt(0);
        return fifthchar;
    }

    public static String RandomNum(){
        Random random =new Random();
        int randomNum=random.nextInt(9999)+1;
        String ranNum=String.format("%04d", randomNum);
        return ranNum;
    }
    
    public static char lastchar(){
        Random random=new Random();
        int ranchar=random.nextInt(26);
        char lastchar=(char)('A'+ranchar);
        return lastchar;

    }
    public static void main(String[] args) {
        HashMap<Integer,Character> st=new HashMap<>();
        st.put(1,'P');
        st.put(2,'F');
        st.put(3,'C');
        st.put(4,'H');
        st.put(5,'A');
        st.put(6,'T');
        st.put(7,'B');
        st.put(8,'L');
        st.put(9,'J');
        st.put(10,'G');  
        
        StringBuilder id=new StringBuilder(10);
        id.append(generateAlp());
        
        

        Scanner s=new Scanner(System.in);
       
        System.out.println("Enter First Name:");
        String firstname=s.next().toUpperCase();
        System.out.println("Enter Last Name:");
        String lastname=s.next().toUpperCase();
       

        System.out.println("""
                           1.Individual
                           2.Firm
                           3.Company
                           4.HUF (Hindu Undivided Family)
                           5.AOP (Association of Persons)
                           6.Trust
                           7.Body of Individuals
                           8.Local Authority
                           9.Artificial Juridical Person
                           10.Government""");

        int opt=s.nextInt();
        switch (opt) {
            case 1:
                id.append(st.get(1));
                break;
            case 2:
                id.append(st.get(2));
                break;
            case 3:
                id.append(st.get(3));
                break;
            case 4:
                id.append(st.get(4));
                break;
            case 5:
                id.append(st.get(5));
                break;
            case 6:
                id.append(st.get(6));
                break;
            case 7:
                id.append(st.get(7));
                break;
            case 8:
                id.append(st.get(8));
                break;
            case 9:
                id.append(st.get(9));
                break;
            case 10:
                id.append(st.get(10));
                break;
            default:
                throw new AssertionError();
        }

        id.append(input(lastname));

        String comdigits=RandomNum();
        id.append(comdigits);
        char LastChar=lastchar();
        id.append(LastChar);
        System.out.println("Your Pancard id is:"+id.toString());
        

        
    }
}

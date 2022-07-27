package althrogram;

public class utilmy {
    public static void main(String[] args) {
        String s = "'Zhelatin', 'Stration,Warezov,', 'Plemood', 'Mydoom'";
        String[] slist = s.split(", ");
        for(String sub:slist) {
            System.out.println("            elif "+sub+" in sample:\n" +
                    "                df.loc[row, 'Class'] = "+"'Email-Worm."+sub.substring(1,sub.length()-1)+"'");
            System.out.println();
        }


    }
}

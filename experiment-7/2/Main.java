import javax.swing.JOptionPane;
public class Lab33
{
public static void main (String []args)
{
String dis="";
String str=JOptionPane.showInputDialog("Enter A String ");
int a = str.length();
String orig=str;
str=str.toUpperCase();
StringBuffer romeo= new StringBuffer();
for(int x=0;x<a;x++)
{
romeo.append(""+str.charAt(x));
romeo.append("\n\n");
}
dis=romeo.toString();
JOptionPane.showMessageDialog(null,"*************************ORIGINAL STRING*************************\n\n" +
                  orig+"\n\n**************************String Buffer*****************************\n" +
"EVERY CHARACARTERS IN THE STRING HAS BEEN SAVE TO (String Buffer)\n\n"+dis);
}    
}

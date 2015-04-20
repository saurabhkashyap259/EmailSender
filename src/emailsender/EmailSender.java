

package emailsender;

public class EmailSender 
{
    public static void main(String[] args) 
    {
        String[] to = {"saurabhkashyap259@yahoo.co.in"};
        if(SendText.sendMail("sdwproject35@gmail.com", "smartdata", "message",to))
        {
            System.out.println("Email sent successfully");
        }
        else
        {
            System.out.println("Some error occured");
        }
    }
}

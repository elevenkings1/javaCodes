import javax.swing.JOptionPane;
public class AverageScore
{
    public static void main(String[] args)
    {
        double score1, score2, score3, average;
        String userInput;
        userInput = JOptionPane.showInputDialog("Please enter the first score");
        score1 = Double.parseDouble(userInput);
        JOptionPane.showInputDialog("Please enter the second score");
        score2 = Double.parseDouble(userInput);
        JOptionPane.showInputDialog("Please enter the third score");
        score3 = Double.parseDouble(userInput);
        average = (score1 + score2 + score3)/3;
        JOptionPane.showMessageDialog(null, "The average of the scores is: " + average);
        if (average > 90)
            JOptionPane.showMessageDialog(null, "Congrats! That's a great score");
        System.exit(0);
    }
}

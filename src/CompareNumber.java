public class CompareNumber extends Task3 {

    public void CompareNumbers(int number, int hiddernumber){
        this.number= number;
        this.hiddernumber=hiddernumber;
        if (number>hiddernumber){
            System.out.println("The number is less than yours");
        }else{if (number <hiddernumber){
            System.out.println("The number is major than yours");
        }
        }if (number == hiddernumber)
        {
            System.out.println("Good job, the number is correct :" + number);

        }
    }
}

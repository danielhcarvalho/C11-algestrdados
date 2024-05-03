public class C11EX14 
{
    public static void main(String[] args) 
    {
        double pi = 0;
        int termos = 0;

        do 
        {
            if (termos % 2 == 0) 
            {
                pi += (double) 1 / (2 * termos + 1);

            } else 
            {
                pi -= (double) 1 / (2 * termos + 1);
                
            }
            termos++;

        } while (!(pi >= 3.1416 / 4 && pi <= 3.1417 / 4));
        pi *= 4;

        System.out.println("Número de termos necessários: " + termos);
        System.out.println("Valor aproximado de PI: " + pi);
    }
}

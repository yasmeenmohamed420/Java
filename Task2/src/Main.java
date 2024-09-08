public class Main {
    public static void main(String[] args)
    {
        String[] Names= {"apple", "bat", "car", "dog", "elephant"};

        for (int i = 0; i < Names.length; i++)
        {
            for (int j = i + 1; j < Names.length; j++)
            {
                if (Names[j].length() < Names[i].length() || (Names[j].length() == Names[i].length() && Names[j].compareTo(Names[i]) < 0)) {
                    String temp = Names[i];
                    Names[i] = Names[j];
                    Names[j] = temp;
                }
            }
        }

        for (int l = 0; l<Names.length;l++)
        {
            System.out.println(Names[l]);
        }
    }
}
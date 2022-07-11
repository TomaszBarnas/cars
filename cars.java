package samochody;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


public class Samochody {


    public static void main(String[] args) {
        int rozmiar = 0;
        int kierunek[];

        try {
            File myObj = new File("1.txt");
            Scanner myReader = new Scanner(myObj);
            int line = 0;
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] dataline = data.split(" ");
                switch (line) {
                    case 0:
                        rozmiar = Integer.parseInt(data);
                        break;
                    case 1:

                        kierunek = new int[rozmiar];
                        for (int i = 0; i < rozmiar; i++) {
                            kierunek[i] = Integer.parseInt(dataline[i]);
                        }

                        for (int i : kierunek) {
                            System.out.println(i);
                        }


                        sollution alfa = new sollution();


                        alfa.LiczbaSamochodow(rozmiar, kierunek);

                        break;
                }
                line++;

            }



            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


    }
}

class sollution {

    int LiczbaSamochodow(int n, int kierunek[]) {

        int i = 0;
        int wynik = 0;
        int wschod = 0;
        while (i < n) {
            if (kierunek[i] == 0)
                wschod = wschod + 1;
            else
                wynik = wynik + wschod;
            i++;

        }
        System.out.println(wynik);
        return wynik;
    }
}
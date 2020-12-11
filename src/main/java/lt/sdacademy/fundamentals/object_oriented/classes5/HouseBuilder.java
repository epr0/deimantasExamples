package lt.sdacademy.fundamentals.object_oriented.classes5;

public class HouseBuilder {

    public static void main(String[] args) {
        //Pamatas pamatas = new Pamatas();
        //pamatas.plotis = 10;
        //pamatas.ilgis = 15;
        Pamatas pamatas = new Pamatas(5, 5);
        PlotoSkaiciuokle skaiciuokle = new PlotoSkaiciuokle();

        System.out.println("Pamato plotas: " +
                skaiciuokle.skaiciuotiPlota(pamatas.plotis, pamatas.ilgis));

        House pirmasNamas = new House(pamatas, 2020);
        System.out.println(pirmasNamas.statybosMetai);
        System.out.println("pirmo namo pamato ilgis yra " + pirmasNamas.pamatas.ilgis);

        Pamatas pamatas1 = new Pamatas();
        pamatas1.ilgis = 50;
        Pamatas kitasPamatas = new Pamatas(10, 10);
        House antrasNamas = new House(kitasPamatas, 2021);
        System.out.println(antrasNamas.statybosMetai);
        System.out.println("pirmo namo pamato ilgis yra " + antrasNamas.pamatas.ilgis);
        antrasNamas.pamatas.ilgis = 15;
        System.out.println(antrasNamas.pamatas.ilgis);




        //Siena siena = new Siena(4, 6);
       /* Siena siena = new Siena();
        siena.plotis = 5;
        siena.ilgis = 6;
        System.out.println("Sienos plotas: " + 4 * siena.skaiciuotiSienosPlota());

        Stogas stogas = new Stogas();
        stogas.ilgis = 10;
        stogas.plotis = 15;
        System.out.println("Stogo plotas: " + stogas.skaiciuotiStogoPlota());

        int bendrasPlotas = pamatas.skaiciuotiPlota()+ siena.skaiciuotiSienosPlota() + stogas.skaiciuotiStogoPlota();
        System.out.println("Bendras pamato, sieno ir stogo plotas: "+ bendrasPlotas);
*/
        //House house = new House(Pamatas, Siena, Stogas);

    }
}

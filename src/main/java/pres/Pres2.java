package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("config.txt"));

        String daoClassName = sc.nextLine();
        Class daoClass = Class.forName(daoClassName);
        IDao dao = (IDao) daoClass.newInstance();

        String metierClassName = sc.nextLine();
        Class metierClass = Class.forName(metierClassName);
        IMetier metier = (IMetier) metierClass.getConstructor(IDao.class)
                .newInstance(dao);
        System.out.println("Resultat= "+metier.calcul());
    }
}

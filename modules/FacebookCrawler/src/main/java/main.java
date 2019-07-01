
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author u137679
 */
public class main {

    public static void main (String [ ] args) {
        fbCrawler fbcrawler = new fbCrawler();
        //mail,contrasenya
        List<String> friends = fbcrawler.loginandCrawl("","");
        StaticGexfGraph graph = new StaticGexfGraph();
        graph.listToFile(friends);
    }
    
    
}

package pl.KonradTysper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String url = "https://www.taniaksiazka.pl/";

        try {
            Document document = Jsoup.connect(url).get();
            Elements books = document.select(".product-main");

            System.out.println("=================================");

            for (Element book : books) {
                String title = book.select("h3 > a").text();
                String price = book.select(".product-price ").text();

                String actualPrice = price.substring(0, price.length() - 3).replace(",",".");
//
//
                if (Double.parseDouble(actualPrice) < 40.00) {
                    System.out.println(title + " - " + price);
                    }else {
                    continue;
                    }
                    System.out.println("=================================");
                }

            }catch(IOException e){
                e.printStackTrace();
                }
        }


    }







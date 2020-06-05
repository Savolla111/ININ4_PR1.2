package com.company.devices;

import com.company.creatures.Human;
import com.company.Saleable;

import java.net.MalformedURLException;
import java.net.URL;

public class Phone extends Device implements Saleable{
    Double screenSize;

    public Phone(String model, String producer, double screenSize) {
        super(producer, model);
        this.screenSize = screenSize;
    }

    final static String host = "https://ourAppStore/";
    final static String protocol = "https";
    final static String version = "1.0";

    public String toString() {
        return "Phone " + this.producer + " " + this.model + " " + this.screenSize;
    }
    public void turnOn() {
        System.out.println("turn on Phone");
    }

    public void sell(Human seller, Human buyer, Double price) throws Exception {
        try {
            super.sell(seller, buyer, price);

            buyer.phone = this;
            if (seller.phone == this) {
                seller.phone = null;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    /*public void installAnApp(String appName) throws MalformedURLException {
        this.installAnApp(appName, "latest");
    }

    public void installAnApp(String appName, String version) throws MalformedURLException {
        URL url = new URL("https", "https://ourAppStore/" + "/" + version, 443, appName);
        this.installAnApp(url);
    }

    public void installAnApp(URL url) {
        System.out.println("App installed" + url.getFile());
    }

    public void installAnApp(String[] appNames) throws MalformedURLException {
        for (String appName : appNames) {
            installAnApp(appName);
        }
    }*/
}


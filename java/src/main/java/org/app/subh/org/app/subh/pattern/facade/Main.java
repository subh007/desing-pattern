package org.app.subh.org.app.subh.pattern.facade;

/**
 * Created by subh on 17/04/17.
 */
public class Main {

    /**
     * Facade design patter allow the user to interact with
     * subsystem easily by  providing unified interface.
     * @param args
     */
    public static void main(String[] args) {

        HealperFacade healperFacade = new HealperFacade();
        healperFacade.generateReport(DbType.MYSQL, ReportType.PDF);
        healperFacade.generateReport(DbType.ORACLE, ReportType.HTML);
    }
}

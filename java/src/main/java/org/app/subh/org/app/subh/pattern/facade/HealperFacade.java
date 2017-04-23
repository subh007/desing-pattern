package org.app.subh.org.app.subh.pattern.facade;

/**
 * Created by subh on 17/04/17.
 */
public class HealperFacade {
    public static void generateReport(DbType dbType, ReportType reportType) {
        switch (dbType) {
            case MYSQL:
                MySqlHealper mySqlHealper = new MySqlHealper();
                switch (reportType) {
                    case HTML:
                        mySqlHealper.generateHtmlReport();
                        break;
                    case PDF:
                        mySqlHealper.generatePdfReport();
                        break;
                }
                break;
            case ORACLE:
                OracleHealper oracleHealper = new OracleHealper();
                switch (reportType) {
                    case HTML:
                        oracleHealper.generateHtmlReport();
                        break;
                    case PDF:
                        oracleHealper.generatePdfReport();
                        break;
                }
        }
    }
}

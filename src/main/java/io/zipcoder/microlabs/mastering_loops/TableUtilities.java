package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String smallMT = "";
        for(int i=1; i<=5; i++) {
            for(int j=1; j<=5; j++) {
                if((i*j) < 10) {
                    smallMT += ("  "+(i*j)+ " |");
                    if(j==5) {
                        smallMT += "\n";
                    }
                }
                else if((i*j) >= 10) {
                    smallMT += (" "+(i*j)+ " |");
                    if(j==5) {
                        smallMT += "\n";
                    }
                }

            }
        }
        System.out.println(smallMT);
        return smallMT;
    }

    public static String getLargeMultiplicationTable() {
        String largeMT = "";
        for(int i=1; i<=10; i++) {
            for(int j=1; j<=10; j++) {
                if((i*j)<10) {
                    largeMT += ("  "+(i*j)+" |");
                }
                else if((i*j)>=10 && (i*j)<=99) {
                    largeMT += (" "+(i*j)+" |");
                    if(j==10) {
                        largeMT += "\n";
                    }
                }
                else if((i*j)>99) {
                    largeMT += ((i*j)+" |");
                    if(j==10) {
                        largeMT += "\n";
                    }
                }
            }
        }
        return largeMT;
    }

    public static String getMultiplicationTable(int tableSize) {
        String table = "";
        for(int i=1; i<=tableSize; i++) {
            for(int j=1; j<=tableSize; j++) {
                if((i*j)<10) {
                    table += ("  "+(i*j)+" |");
                }
                else if((i*j)>=10 && (i*j)<=99) {
                    table += (" "+(i*j)+" |");
                    if(j==tableSize) {
                        table += "\n";
                    }
                }
                else if((i*j)>99) {
                    table += ((i*j)+" |");
                    if(j==tableSize) {
                        table += "\n";
                    }
                }
            }
        }
        return table;
    }
}

package home_work;

public class LogicalOpTable {
    public static int boolToInt(boolean foo) {
        int bar = 0;
        if (foo) {
            bar = 1;
        }
        return bar;

    }

    public static void printLogicRes( boolean p, boolean q) {
        int res1 = LogicalOpTable.boolToInt((p&q));
        int res2 = LogicalOpTable.boolToInt((p|q));
        int res3 = LogicalOpTable.boolToInt((p^q));

        System.out.print(LogicalOpTable.boolToInt(p) + "\t" + LogicalOpTable.boolToInt(q) + "\t");
        System.out.print(res1 + "\t" + res2 + "\t");
        System.out.println(res3 + "\t" + LogicalOpTable.boolToInt((!p)));
    }
    public static void main(String[] args) {

        boolean p, q;
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        p = true;
        q = true;
        LogicalOpTable.printLogicRes(p,q);

        p = true;
        q = false;
        LogicalOpTable.printLogicRes(p,q);
        p = false;
        q = true;
        LogicalOpTable.printLogicRes(p,q);
        p = false;
        q = false;
        LogicalOpTable.printLogicRes(p,q);

    }

}


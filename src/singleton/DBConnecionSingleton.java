package singleton;

class DBConnecionSingleton {

    private static DBConnecionSingleton dbConnecionSingleton;

    private DBConnecionSingleton(String dbConnectionString) {
        System.out.println("In parameterized constructor");

    }

   private DBConnecionSingleton() {
        System.out.println("In parameterized constructor");
    }



    public static DBConnecionSingleton getDbConnectionStringInstance() {

//        if(this.dbConnecionSingleton == null){java: non-static variable this cannot be referenced from a static context, because "this" refers to object
//        and here we are in static block and no concept of object.

        if (dbConnecionSingleton == null) {
            dbConnecionSingleton = new DBConnecionSingleton("jdbc:host/port");
        }

        return dbConnecionSingleton;
    }


}
class AccessSingleTonFromHere {

    public static void main(String[] args) {
        AccessSingleTonFromHere accessSingleTonFromHere = new AccessSingleTonFromHere();
        accessSingleTonFromHere.tryToCreateSingleTonObject();


    }

    void tryToCreateSingleTonObject() {
//        DBConnecionSingleton dbConnecionSingleton = new DBConnecionSingleton("");

//        DBConnecionSingleton dbConnecionSingleton1 = new DBConnecionSingleton(); NO CONSTRUCTOR MUST BE PUBLIC, BE IT DEFAULT OR PARAMETERIZED

    }
}

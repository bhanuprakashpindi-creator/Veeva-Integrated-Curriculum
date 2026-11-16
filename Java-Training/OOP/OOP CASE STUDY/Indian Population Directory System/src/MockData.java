import java.util.HashMap;

public class MockData {

    public HashMap<String, HashMap<String, Long>> fetchMockData() {

        HashMap<String, HashMap<String, Long>> populationManager = new HashMap<>();

        // Andhra Pradesh
        HashMap<String, Long> andhra = new HashMap<>();
        andhra.put("Visakhapatnam", 2035922L);
        andhra.put("Vijayawada", 1034358L);
        andhra.put("Guntur", 647508L);
        andhra.put("Tirupati", 461900L);
        andhra.put("Kurnool", 484327L);

        // Telangana
        HashMap<String, Long> telangana = new HashMap<>();
        telangana.put("Hyderabad", 6993262L);
        telangana.put("Warangal", 704570L);
        telangana.put("Nizamabad", 311152L);
        telangana.put("Karimnagar", 297447L);
        telangana.put("Khammam", 262308L);

        // Maharashtra
        HashMap<String, Long> maharashtra = new HashMap<>();
        maharashtra.put("Mumbai", 12478447L);
        maharashtra.put("Pune", 3124458L);
        maharashtra.put("Nagpur", 2405665L);
        maharashtra.put("Nashik", 1486053L);
        maharashtra.put("Thane", 1841488L);

        // Karnataka
        HashMap<String, Long> karnataka = new HashMap<>();
        karnataka.put("Bengaluru", 8443675L);
        karnataka.put("Mysuru", 893062L);
        karnataka.put("Hubballi", 943788L);
        karnataka.put("Mangaluru", 484785L);
        karnataka.put("Belagavi", 490045L);

        // Tamil Nadu
        HashMap<String, Long> tamilNadu = new HashMap<>();
        tamilNadu.put("Chennai", 4646732L);
        tamilNadu.put("Coimbatore", 1050721L);
        tamilNadu.put("Madurai", 1017865L);
        tamilNadu.put("Tiruchirappalli", 916857L);
        tamilNadu.put("Salem", 829267L);

        // Uttar Pradesh
        HashMap<String, Long> uttarPradesh = new HashMap<>();
        uttarPradesh.put("Lucknow", 2817105L);
        uttarPradesh.put("Kanpur", 2765348L);
        uttarPradesh.put("Agra", 1585704L);
        uttarPradesh.put("Varanasi", 1198491L);
        uttarPradesh.put("Prayagraj", 1117094L);

        // Gujarat
        HashMap<String, Long> gujarat = new HashMap<>();
        gujarat.put("Ahmedabad", 5577940L);
        gujarat.put("Surat", 4467797L);
        gujarat.put("Vadodara", 1670806L);
        gujarat.put("Rajkot", 1286678L);
        gujarat.put("Bhavnagar", 593768L);

        // Rajasthan
        HashMap<String, Long> rajasthan = new HashMap<>();
        rajasthan.put("Jaipur", 3046163L);
        rajasthan.put("Jodhpur", 1033918L);
        rajasthan.put("Kota", 1001694L);
        rajasthan.put("Bikaner", 647804L);
        rajasthan.put("Ajmer", 542321L);

        // Kerala
        HashMap<String, Long> kerala = new HashMap<>();
        kerala.put("Kochi", 677381L);
        kerala.put("Kozhikode", 609224L);
        kerala.put("Thrissur", 315957L);
        kerala.put("Kollam", 397419L);
        kerala.put("Kannur", 232486L);

        // West Bengal
        HashMap<String, Long> westBengal = new HashMap<>();
        westBengal.put("Kolkata", 4496694L);
        westBengal.put("Howrah", 1077075L);
        westBengal.put("Durgapur", 581409L);
        westBengal.put("Asansol", 563917L);
        westBengal.put("Siliguri", 513264L);

        // Store all states
        populationManager.put("Andhra Pradesh", andhra);
        populationManager.put("Telangana", telangana);
        populationManager.put("Maharashtra", maharashtra);
        populationManager.put("Karnataka", karnataka);
        populationManager.put("Tamil Nadu", tamilNadu);
        populationManager.put("Uttar Pradesh", uttarPradesh);
        populationManager.put("Gujarat", gujarat);
        populationManager.put("Rajasthan", rajasthan);
        populationManager.put("Kerala", kerala);
        populationManager.put("West Bengal", westBengal);

        return populationManager;
    }
}
public class BuddyInfo {
    private String name;
    private String address;
    private String number;

    public BuddyInfo(){
        this.name = "Sam";
    }
    public BuddyInfo(String name,String address,String number) {
        this.name = name;
        this.address = address;
        this.number = number;

    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        BuddyInfo obj = new BuddyInfo("Homer","address","1231312313123");
        System.out.println("Hello "+obj.getName());

    }
}

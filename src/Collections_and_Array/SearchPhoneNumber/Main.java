package Collections_and_Array.SearchPhoneNumber;

public class Main {
    public static void main(String[] args) {
        PhoneDictionary phoneDictionary = new PhoneDictionary();
        var list = phoneDictionary.find("nn");
        list.forEach(it -> {
            System.out.print(it.getName()+" ");
                    System.out.print(it.getSurName()+" ");
                    System.out.print(it.getAddress()+" ");
                    System.out.println(it.getNumperPhone());
        }
        );

    }
}

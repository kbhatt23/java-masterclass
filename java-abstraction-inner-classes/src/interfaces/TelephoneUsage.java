package interfaces;
//cleint calss
//-> framework dev class will not be seeing the issue sin client class
//better to follow an interface whihc restrict both client adn framework dev to stick to method contract and follwo overridng rules
public class TelephoneUsage {
public static void main(String[] args) {
	ITelephone phone = new MobilePhone();
	phone.powerOn();
	phone.call("9206457373");
}
}

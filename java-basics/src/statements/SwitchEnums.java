package statements;

public class SwitchEnums {
public static void main(String[] args) {
	EnumForSwithch enumToSiwth = EnumForSwithch.FIRST;
	switch (enumToSiwth) {
	case FIRST:
		System.out.println("first wala jai shree ram");
		break;
	case SECOND:
		System.out.println("second wala jai shree ram");
		break;
	case THIRD:
		System.out.println("third wala jai shree ram");
		break;
	case FOURTH:
		System.out.println("fourth wala jai shree ram");
		break;

	default:
		break;
	}
}


}

enum EnumForSwithch{
	FIRST,SECOND,THIRD,FOURTH
}

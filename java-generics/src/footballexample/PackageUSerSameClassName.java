package footballexample;

import footballexample._switch.FakeClass;

public class PackageUSerSameClassName {
public static void main(String[] args) {
	FakeClass class1 = new FakeClass();
	
	//fullyqialoified name is package.clasname
	footballexample._switch.inner.FakeClass class2  =new footballexample._switch.inner.FakeClass();
}
}

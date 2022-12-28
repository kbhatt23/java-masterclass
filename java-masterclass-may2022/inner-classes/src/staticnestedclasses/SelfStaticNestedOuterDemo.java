package staticnestedclasses;

import staticnestedclasses.SelfStaticNestedOuter.SelfStaticNestedInner;

public class SelfStaticNestedOuterDemo {
	public static void main(String[] args) {
		// independent
		SelfStaticNestedOuter outer = new SelfStaticNestedOuter("outer");
		
		SelfStaticNestedInner selfStaticNestedInner = new SelfStaticNestedOuter.SelfStaticNestedInner("inner");
		
		selfStaticNestedInner.printNames();
	}
}

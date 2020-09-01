package interfaces;

import abstractclasses.AbstractClassSample;

public class AbstractImplementorSeperatePAckage extends AbstractClassSample{

	public AbstractImplementorSeperatePAckage(String userName) {
		super(userName);
	}
	@Override
	public void fakeMethod() {
		// TODO Auto-generated method stub
		
	}
	//in interface we did not have otpion of protected acces modifier
	//its forced to be public, hence we can not restrict extension of class or usages of clalss within some package
	@Override
	protected void defaultMethodtype() {
		// TODO Auto-generated method stub
		
	}

}

package interfaces.challenge;

import java.util.List;

public interface ISaveable {

	List<String> save();
	void load(List<String> savedObject);
}

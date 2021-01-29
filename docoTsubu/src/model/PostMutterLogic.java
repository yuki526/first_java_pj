package model;

import java.util.List;

public class PostMutterLogic {
	public void exesute(Mutter mutter, List<Mutter> mutterList) {
		mutterList.add(0, mutter);
	}

}

package amidst.mojangapi.file.json.version;

import amidst.documentation.GsonConstructor;
import amidst.documentation.Immutable;

@Immutable
public class LibraryRuleJson {
	private static final String ACTION_ALLOW = "allow";

	private volatile String action;
	private volatile LibraryRuleOsJson os;

	@GsonConstructor
	public LibraryRuleJson() {
	}

	public boolean isApplicable(String os) {
		return this.os == null || this.os.getName().equals(os);
	}

	public boolean isAllowed() {
		return action.equals(ACTION_ALLOW);
	}
}

package de.tuberlin.tkn.lit.model.activities;

import de.tuberlin.tkn.lit.model.Activity;

public class Ignore extends Activity {
    private static final String type = "Ignore";

    public Ignore() {
    }

    public Ignore(Activity activity) {
        super(activity);
    }
    public String getType() {
        return type;
    }
}

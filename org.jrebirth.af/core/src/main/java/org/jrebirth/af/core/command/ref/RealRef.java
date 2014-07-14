package org.jrebirth.af.core.command.ref;

import org.jrebirth.af.core.command.Command;
import org.jrebirth.af.core.key.UniqueKey;

public class RealRef implements Ref {

    private UniqueKey<? extends Command> commandKey;

    public static RealRef create() {
        return new RealRef();
    }

    public UniqueKey<? extends Command> key() {
        return this.commandKey;
    }

    public RealRef key(final UniqueKey<? extends Command> commandKey) {
        this.commandKey = commandKey;
        return this;
    }
}

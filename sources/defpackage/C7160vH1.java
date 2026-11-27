package defpackage;

import io.sentry.protocol.u;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vH1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7160vH1 {

    @NotNull
    public final u a;

    @NotNull
    public final C4401iO1 b;

    @Nullable
    public final Boolean c;

    static {
        Pattern.compile("^[ \\t]*([0-9a-f]{32})-([0-9a-f]{16})(-[01])?[ \\t]*$", 2);
    }

    public C7160vH1(@NotNull u uVar, @NotNull C4401iO1 c4401iO1, @Nullable Boolean bool) {
        this.a = uVar;
        this.b = c4401iO1;
        this.c = bool;
    }

    @NotNull
    public final String a() {
        C4401iO1 c4401iO1 = this.b;
        u uVar = this.a;
        Boolean bool = this.c;
        if (bool == null) {
            return uVar + "-" + c4401iO1;
        }
        return uVar + "-" + c4401iO1 + "-" + (bool.booleanValue() ? "1" : "0");
    }
}

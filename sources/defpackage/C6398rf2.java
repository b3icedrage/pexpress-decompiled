package defpackage;

import io.sentry.protocol.u;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rf2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6398rf2 {

    @NotNull
    public final u a;

    @NotNull
    public final C4401iO1 b;

    @Nullable
    public final Boolean c;

    public C6398rf2(@NotNull u uVar, @NotNull C4401iO1 c4401iO1, @Nullable Boolean bool) {
        this.a = uVar;
        this.b = c4401iO1;
        this.c = bool;
    }

    @NotNull
    public final String a() {
        Boolean bool = this.c;
        return "00-" + this.a + "-" + this.b + "-" + ((bool == null || !bool.booleanValue()) ? "00" : "01");
    }
}

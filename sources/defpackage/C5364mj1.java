package defpackage;

import io.sentry.protocol.u;
import io.sentry.util.A;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5364mj1 {

    @NotNull
    public final u a;

    @NotNull
    public final C4401iO1 b;

    @NotNull
    public final C2171Up c;

    public C5364mj1() {
        this(new u(), new C4401iO1(), null);
    }

    public C5364mj1(@NotNull u uVar, @NotNull C4401iO1 c4401iO1, @Nullable C2171Up c2171Up) {
        this.a = uVar;
        this.b = c4401iO1;
        this.c = A.a(c2171Up, null, null, null);
    }

    public C5364mj1(@NotNull C5364mj1 c5364mj1) {
        this(c5364mj1.a, c5364mj1.b, c5364mj1.c);
    }
}

package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: fu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3878fu<T> {

    @NotNull
    public final GP1 a;

    @NotNull
    public final C1699On1 b;

    public AbstractC3878fu() {
        GP1 gp1I = C1589Ne.i(null);
        this.a = gp1I;
        this.b = C4466ii.f(gp1I);
    }

    public final void a(T t) {
        this.a.setValue(t);
    }
}

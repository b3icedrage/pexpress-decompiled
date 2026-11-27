package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: wr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7491wr0 extends C1043Gd1<Object, C3032br0> {

    @NotNull
    public static final C1277Jd1 f = new C1277Jd1("Before");

    @NotNull
    public static final C1277Jd1 g = new C1277Jd1("State");

    @NotNull
    public static final C1277Jd1 h = new C1277Jd1("Monitoring");

    @NotNull
    public static final C1277Jd1 i = new C1277Jd1("Engine");

    @NotNull
    public static final C1277Jd1 j = new C1277Jd1("Receive");
    public final boolean e;

    public C7491wr0(boolean z) {
        super(f, g, h, i, j);
        this.e = z;
    }

    @Override // defpackage.C1043Gd1
    public final boolean d() {
        return this.e;
    }
}

package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: rr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6440rr0 extends C1043Gd1<C5601nr0, C2250Vp0> {

    @NotNull
    public static final C1277Jd1 f = new C1277Jd1("Receive");

    @NotNull
    public static final C1277Jd1 g = new C1277Jd1("Parse");

    @NotNull
    public static final C1277Jd1 h = new C1277Jd1("Transform");

    @NotNull
    public static final C1277Jd1 i = new C1277Jd1("State");

    @NotNull
    public static final C1277Jd1 j = new C1277Jd1("After");
    public final boolean e;

    public C6440rr0(boolean z) {
        super(f, g, h, i, j);
        this.e = z;
    }

    @Override // defpackage.C1043Gd1
    public final boolean d() {
        return this.e;
    }
}

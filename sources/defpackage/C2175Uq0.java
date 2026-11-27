package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Uq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2175Uq0 extends C1043Gd1<AbstractC5391mr0, Unit> {

    @NotNull
    public static final C1277Jd1 f = new C1277Jd1("Before");

    @NotNull
    public static final C1277Jd1 g = new C1277Jd1("State");

    @NotNull
    public static final C1277Jd1 h = new C1277Jd1("After");
    public final boolean e;

    public C2175Uq0(boolean z) {
        super(f, g, h);
        this.e = z;
    }

    @Override // defpackage.C1043Gd1
    public final boolean d() {
        return this.e;
    }
}

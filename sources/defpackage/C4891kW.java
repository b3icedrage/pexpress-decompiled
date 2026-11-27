package defpackage;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4891kW {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    @NotNull
    public final ArrayList e;

    static {
        new C4891kW(true, true, true, true);
        new C4891kW(false, false, false, false);
    }

    public C4891kW() {
        this(0);
    }

    public C4891kW(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = new ArrayList();
    }

    public /* synthetic */ C4891kW(int i) {
        this(true, false, false, false);
    }
}

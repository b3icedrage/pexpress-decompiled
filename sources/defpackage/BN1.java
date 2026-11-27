package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class BN1 {
    public final boolean a;

    @NotNull
    public final GP1 b;

    @NotNull
    public final GP1 c;

    @NotNull
    public final Q2 d;

    @NotNull
    public final GP1 e;

    @NotNull
    public final C1699On1 f;
    public int g;
    public boolean h;

    public BN1(boolean z, @NotNull GP1 shared, @NotNull GP1 selectedReadiness, @NotNull Q2 realSelected) {
        Intrinsics.checkNotNullParameter(shared, "shared");
        Intrinsics.checkNotNullParameter(selectedReadiness, "selectedReadiness");
        Intrinsics.checkNotNullParameter(realSelected, "realSelected");
        this.a = z;
        this.b = shared;
        this.c = selectedReadiness;
        this.d = realSelected;
        GP1 gp1I = C1589Ne.i(null);
        this.e = gp1I;
        this.f = C4466ii.f(gp1I);
        this.g = 0;
    }

    public final void a(boolean z) {
        MN1 mn1;
        if (this.a != z) {
            return;
        }
        if (this.h) {
            mn1 = MN1.e;
        } else {
            mn1 = this.e.getValue() == EnumC3495e41.h ? MN1.g : MN1.d;
        }
        GP1 gp1 = this.c;
        gp1.getClass();
        gp1.m(null, mn1);
    }
}

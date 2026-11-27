package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: dS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3364dS1 implements UB0 {

    @NotNull
    public final C1237Iq0 a;

    @NotNull
    public final C1237Iq0 b;

    public C3364dS1() {
        C1237Iq0.a a = C1237Iq0.a.d;
        C1315Jq0 logger = C1237Iq0.b.a;
        Intrinsics.checkNotNullParameter(a, "level");
        Intrinsics.checkNotNullParameter(logger, "logger");
        C1237Iq0 c1237Iq0 = new C1237Iq0(logger);
        Intrinsics.checkNotNullParameter(a, "<set-?>");
        c1237Iq0.c = a;
        this.a = c1237Iq0;
        C1237Iq0 c1237Iq1 = new C1237Iq0(logger);
        C1237Iq0.a b = C1237Iq0.a.e;
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        a = a.compareTo(b) > 0 ? b : a;
        Intrinsics.checkNotNullParameter(a, "<set-?>");
        c1237Iq1.c = a;
        this.b = c1237Iq1;
    }

    @Override // defpackage.UB0
    @NotNull
    public final C0857Dt1 a(@NotNull C5593no1 chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        YC0 yc0 = (YC0) chain.e.c(YC0.class);
        return ((yc0 == null || !yc0.a.isAnnotationPresent(InterfaceC3154cS1.class)) ? this.a : this.b).a(chain);
    }
}

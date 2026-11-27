package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Vy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2276Vy implements Function1 {
    public static final C2276Vy e = new C2276Vy(0);
    public static final C2276Vy g = new C2276Vy(1);
    public static final C2276Vy h = new C2276Vy(2);
    public final /* synthetic */ int d;

    public /* synthetic */ C2276Vy(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                P92 p92 = (P92) obj;
                Intrinsics.checkNotNull(p92);
                Intrinsics.checkNotNullParameter(p92, "<this>");
                return Boolean.valueOf(p92.V0() instanceof InterfaceC2540Yy);
            case 1:
                int i = C2964bZ.f;
                return "";
            default:
                InterfaceC7571xE0 it = (InterfaceC7571xE0) obj;
                int i2 = TO0.p;
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.i());
        }
    }
}

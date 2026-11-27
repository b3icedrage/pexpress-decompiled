package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: wx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7508wx implements Function1 {
    public static final C7508wx e = new C7508wx(0);
    public static final C7508wx g = new C7508wx(1);
    public static final C7508wx h = new C7508wx(2);
    public final /* synthetic */ int d;

    public /* synthetic */ C7508wx(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                Class it = (Class) obj;
                UH uh = C0633Ax.a;
                Intrinsics.checkNotNullParameter(it, "it");
                return new C3545eJ0(it);
            case 1:
                QY0 it2 = (QY0) obj;
                int i = TO0.p;
                Intrinsics.checkNotNullParameter(it2, "it");
                return it2.c();
            default:
                RK0 rk0 = (RK0) obj;
                AbstractC2527Yt1.a aVar = AbstractC2527Yt1.a.c;
                Intrinsics.checkNotNullParameter(rk0, "<this>");
                rk0.getClass();
                AbstractC5706oM1 abstractC5706oM1S = rk0.s(EnumC6405rh1.BOOLEAN);
                Intrinsics.checkNotNullExpressionValue(abstractC5706oM1S, "getBooleanType(...)");
                return abstractC5706oM1S;
        }
    }
}

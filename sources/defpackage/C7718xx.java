package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7718xx implements Function1 {
    public static final C7718xx e = new C7718xx(0);
    public static final C7718xx g = new C7718xx(1);
    public static final C7718xx h = new C7718xx(2);
    public final /* synthetic */ int d;

    public /* synthetic */ C7718xx(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                Class it = (Class) obj;
                UH uh = C0633Ax.a;
                Intrinsics.checkNotNullParameter(it, "it");
                return new FJ0(it);
            case 1:
                InterfaceC3383dZ withOptions = (InterfaceC3383dZ) obj;
                int i = C2964bZ.f;
                Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
                withOptions.e(C5907pJ1.d(withOptions.k(), WE.f(C4194hP1.a.p, C4194hP1.a.q)));
                return Unit.a;
            default:
                RK0 rk0 = (RK0) obj;
                AbstractC2527Yt1.b bVar = AbstractC2527Yt1.b.c;
                Intrinsics.checkNotNullParameter(rk0, "<this>");
                rk0.getClass();
                AbstractC5706oM1 abstractC5706oM1S = rk0.s(EnumC6405rh1.INT);
                Intrinsics.checkNotNullExpressionValue(abstractC5706oM1S, "getIntType(...)");
                return abstractC5706oM1S;
        }
    }
}

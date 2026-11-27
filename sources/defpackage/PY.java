package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PY implements Function1 {
    public static final PY e = new PY(0);
    public static final PY g = new PY(1);
    public final /* synthetic */ int d;

    public /* synthetic */ PY(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                InterfaceC3383dZ withOptions = (InterfaceC3383dZ) obj;
                C2964bZ c2964bZ = XY.a;
                Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
                withOptions.j();
                withOptions.d(C6702t60.d);
                return Unit.a;
            default:
                InterfaceC2076Tj0 Checks = (InterfaceC2076Tj0) obj;
                U91 u91 = U91.a;
                Intrinsics.checkNotNullParameter(Checks, "$this$Checks");
                List<Xc2> listJ = Checks.j();
                Intrinsics.checkNotNullExpressionValue(listJ, "getValueParameters(...)");
                Xc2 xc2 = (Xc2) CollectionsKt.N(listJ);
                if (xc2 == null || C4900kZ.a(xc2) || xc2.q0() != null) {
                    return "last parameter should not have a default value or be a vararg";
                }
                return null;
        }
    }
}

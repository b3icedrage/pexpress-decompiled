package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class TY implements Function1 {
    public static final TY e = new TY(0);
    public static final TY g = new TY(1);
    public final /* synthetic */ int d;

    public /* synthetic */ TY(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                InterfaceC3383dZ withOptions = (InterfaceC3383dZ) obj;
                C2964bZ c2964bZ = XY.a;
                Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
                withOptions.d(EnumC3173cZ.e);
                return Unit.a;
            default:
                P92 it = (P92) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                InterfaceC5044lD interfaceC5044lDC = it.V0().c();
                return Boolean.valueOf(interfaceC5044lDC != null && ((interfaceC5044lDC instanceof InterfaceC3714f62) || (interfaceC5044lDC instanceof H62)));
        }
    }
}

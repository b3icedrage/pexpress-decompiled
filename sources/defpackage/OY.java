package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class OY implements Function1 {
    public static final OY e = new OY(0);
    public static final OY g = new OY(1);
    public final /* synthetic */ int d;

    public /* synthetic */ OY(int i) {
        this.d = i;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        InterfaceC1490Lx interfaceC1490LxB;
        String builtinSignature;
        switch (this.d) {
            case 0:
                InterfaceC3383dZ withOptions = (InterfaceC3383dZ) obj;
                C2964bZ c2964bZ = XY.a;
                Intrinsics.checkNotNullParameter(withOptions, "$this$withOptions");
                withOptions.j();
                return Unit.a;
            default:
                InterfaceC1490Lx it = (InterfaceC1490Lx) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (RK0.z(it)) {
                    int i = C1095Gv.l;
                    Intrinsics.checkNotNullParameter(it, "<this>");
                    C6132qO1.b bVar = null;
                    if (C6132qO1.e.contains(it.getName()) && (interfaceC1490LxB = C4900kZ.b(it, C1017Fv.e)) != null && (builtinSignature = C3689f01.b(interfaceC1490LxB)) != null) {
                        Intrinsics.checkNotNullParameter(builtinSignature, "builtinSignature");
                        if (C6132qO1.b.contains(builtinSignature)) {
                            bVar = C6132qO1.b.d;
                        } else {
                            bVar = ((C6132qO1.c) PW0.d(C6132qO1.d, builtinSignature)) == C6132qO1.c.e ? C6132qO1.b.g : C6132qO1.b.e;
                        }
                    }
                    if (bVar != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
        }
    }
}

package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ma1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1501Ma1 implements Function1 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ C1501Ma1(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003e  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.d) {
            case 0:
                InterfaceC1490Lx interfaceC1490Lx = (InterfaceC1490Lx) obj;
                if (C5323mZ.e(interfaceC1490Lx.d())) {
                    z = false;
                } else {
                    FC fc = (FC) this.e;
                    if (fc == null) {
                        C5323mZ.a(3);
                        throw null;
                    }
                    if (C5323mZ.c(C5323mZ.m, interfaceC1490Lx, fc) == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            default:
                QL1.a.C0130a function = (QL1.a.C0130a) obj;
                Intrinsics.checkNotNullParameter(function, "$this$function");
                function.a((String) this.e, C4719jg1.b);
                return Unit.a;
        }
    }
}

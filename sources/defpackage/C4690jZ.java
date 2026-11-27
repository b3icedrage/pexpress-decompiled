package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4690jZ implements Function1 {
    public static final C4690jZ e = new C4690jZ(0);
    public static final C4690jZ g = new C4690jZ(1);
    public final /* synthetic */ int d;

    public /* synthetic */ C4690jZ(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AbstractC4649jL0 type;
        switch (this.d) {
            case 0:
                InterfaceC4675jU it = (InterfaceC4675jU) obj;
                int i = C4900kZ.a;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.e();
            case 1:
                S01 module = (S01) obj;
                Object obj2 = XD0.a;
                Intrinsics.checkNotNullParameter(module, "module");
                Xc2 xc2M = UE.m(VD0.b, module.t().i(C4194hP1.a.t));
                return (xc2M == null || (type = xc2M.getType()) == null) ? R70.c(Q70.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
            default:
                return (InterfaceC1490Lx) obj;
        }
    }
}

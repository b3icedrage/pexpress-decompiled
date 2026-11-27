package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3846fk0 implements Function1 {
    public static final C3846fk0 e = new C3846fk0(0);
    public static final C3846fk0 g = new C3846fk0(1);
    public static final C3846fk0 h = new C3846fk0(2);
    public final /* synthetic */ int d;

    public /* synthetic */ C3846fk0(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                return Boolean.TRUE;
            case 1:
                InterfaceC1490Lx it = (InterfaceC1490Lx) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                AbstractC4649jL0 abstractC4649jL0N = it.n();
                Intrinsics.checkNotNull(abstractC4649jL0N);
                return abstractC4649jL0N;
            default:
                InterfaceC4675jU it2 = (InterfaceC4675jU) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return Boolean.valueOf(!(it2 instanceof InterfaceC3550eL));
        }
    }
}

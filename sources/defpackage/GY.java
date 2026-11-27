package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class GY implements InterfaceC4859kL0.a {
    public final boolean a;
    public final InterfaceC1335Jx b;
    public final InterfaceC1335Jx c;

    public GY(InterfaceC1335Jx interfaceC1335Jx, InterfaceC1335Jx interfaceC1335Jx2, boolean z) {
        this.a = z;
        this.b = interfaceC1335Jx;
        this.c = interfaceC1335Jx2;
    }

    @Override // defpackage.InterfaceC4859kL0.a
    public final boolean a(InterfaceC6494s62 c1, InterfaceC6494s62 c2) {
        Intrinsics.checkNotNullParameter(c1, "c1");
        Intrinsics.checkNotNullParameter(c2, "c2");
        if (Intrinsics.a(c1, c2)) {
            return true;
        }
        InterfaceC5044lD interfaceC5044lDC = c1.c();
        InterfaceC5044lD interfaceC5044lDC2 = c2.c();
        if (!(interfaceC5044lDC instanceof H62) || !(interfaceC5044lDC2 instanceof H62)) {
            return false;
        }
        return IY.a.b((H62) interfaceC5044lDC, (H62) interfaceC5044lDC2, this.a, new HY(this.b, this.c));
    }
}

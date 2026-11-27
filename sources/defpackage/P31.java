package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class P31 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 1;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1454Lk1 c;

    public P31(C5208m0 c5208m0, InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1454Lk1 interfaceC1454Lk2) {
        this.b = interfaceC1454Lk1;
        this.c = interfaceC1454Lk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                C6102qE1 sdkContext = (C6102qE1) ((InterfaceC1454Lk1) this.b).get();
                EK1 storage = (EK1) this.c.get();
                Intrinsics.checkNotNullParameter(sdkContext, "sdkContext");
                Intrinsics.checkNotNullParameter(storage, "storage");
                C6711t81.a aVar = new C6711t81.a();
                TimeUnit unit = TimeUnit.SECONDS;
                Intrinsics.checkNotNullParameter(unit, "unit");
                aVar.x = C6806tc2.b("timeout", 30L, unit);
                Intrinsics.checkNotNullParameter(unit, "unit");
                aVar.w = C6806tc2.b("timeout", 30L, unit);
                aVar.a(new C1655Nz(storage));
                aVar.a(new Ra2(sdkContext.a));
                C1237Iq0 c1237Iq0 = new C1237Iq0(C1237Iq0.b.a);
                C1237Iq0.a aVar2 = C1237Iq0.a.d;
                Intrinsics.checkNotNullParameter(aVar2, "<set-?>");
                c1237Iq0.c = aVar2;
                aVar.a(c1237Iq0);
                return new C6711t81(aVar);
            default:
                return new C7040ui2((Context) this.b.get(), (Kh2) ((C0843Dp) this.c).get(), new C2286Wa(), new C3180cb());
        }
    }

    public P31(InterfaceC1531Mk1 interfaceC1531Mk1, C0843Dp c0843Dp) {
        this.b = interfaceC1531Mk1;
        this.c = c0843Dp;
    }
}

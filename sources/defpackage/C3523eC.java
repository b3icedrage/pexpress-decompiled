package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: eC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3523eC implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;

    public /* synthetic */ C3523eC(InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C3314dC((InterfaceC1442Lg1) this.b.get());
            case 1:
                return new C1354Kd0((InterfaceC1442Lg1) this.b.get());
            case 2:
                return new C6715t91((InterfaceC1442Lg1) this.b.get());
            case 3:
                return new C0656Be1((InterfaceC1442Lg1) this.b.get());
            default:
                L32 tradingRepository = (L32) this.b.get();
                Intrinsics.checkNotNullParameter(tradingRepository, "tradingRepository");
                return new C7074us1(tradingRepository);
        }
    }
}

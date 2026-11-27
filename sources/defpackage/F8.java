package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class F8 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;

    public /* synthetic */ F8(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new E8((M8) ((InterfaceC1454Lk1) this.b).get(), (InterfaceC5321mY0) ((InterfaceC1454Lk1) this.c).get());
            case 1:
                return new C1140Hk((InterfaceC1153Ho0) ((InterfaceC1454Lk1) this.b).get(), (AF1) ((InterfaceC1454Lk1) this.c).get());
            default:
                AbstractC7004uZ1 timeSelectionsProvider = (AbstractC7004uZ1) this.b.get();
                J22 assetsProvider = (J22) this.c.get();
                Intrinsics.checkNotNullParameter(timeSelectionsProvider, "timeSelectionsProvider");
                Intrinsics.checkNotNullParameter(assetsProvider, "assetsProvider");
                return new C4351i81(timeSelectionsProvider, assetsProvider);
        }
    }
}

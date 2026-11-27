package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Bp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0687Bp implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1454Lk1 b;
    public final InterfaceC1531Mk1 c;

    public /* synthetic */ C0687Bp(int i, InterfaceC5331mb0 interfaceC5331mb0, InterfaceC1531Mk1 interfaceC1531Mk1) {
        this.a = i;
        this.c = interfaceC1531Mk1;
        this.b = interfaceC5331mb0;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                C4923kf appDataRepository = (C4923kf) this.c.get();
                AbstractC5328ma1 originProvider = (AbstractC5328ma1) this.b.get();
                Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
                Intrinsics.checkNotNullParameter(originProvider, "originProvider");
                return new C6197qh2(appDataRepository, originProvider);
            case 1:
                return new KD((M8) this.b.get(), (InterfaceC5321mY0) ((InterfaceC1454Lk1) this.c).get());
            case 2:
                return new C4328i22((AbstractC5463nB1) this.c.get(), (InterfaceC3951gE1) ((OW) this.b).get());
            default:
                return new T32((K22) ((WT1) this.c).get(), (InterfaceC4833kC1) ((C0609Ap) this.b).get());
        }
    }

    public C0687Bp(InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1454Lk1 interfaceC1454Lk2) {
        this.a = 1;
        this.b = interfaceC1454Lk1;
        this.c = interfaceC1454Lk2;
    }

    public C0687Bp(C0957Fb c0957Fb, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1454Lk1 interfaceC1454Lk1) {
        this.a = 0;
        this.c = interfaceC1531Mk1;
        this.b = interfaceC1454Lk1;
    }
}

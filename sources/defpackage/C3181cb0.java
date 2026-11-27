package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3181cb0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1454Lk1 b;

    public /* synthetic */ C3181cb0(InterfaceC1454Lk1 interfaceC1454Lk1, int i) {
        this.a = i;
        this.b = interfaceC1454Lk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C2972bb0((C1432Ld0) this.b.get());
            case 1:
                C2263Vt1 retrofit = (C2263Vt1) this.b.get();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Object objB = retrofit.b(InterfaceC3432dl1.class);
                Intrinsics.checkNotNullExpressionValue(objB, "retrofit.create(PushApi::class.java)");
                InterfaceC3432dl1 interfaceC3432dl1 = (InterfaceC3432dl1) objB;
                C0957Fb.i(interfaceC3432dl1);
                return interfaceC3432dl1;
            default:
                return new GX1((InterfaceC0565Aa0) this.b.get(), new HX1());
        }
    }

    public C3181cb0(C5208m0 c5208m0, InterfaceC1454Lk1 interfaceC1454Lk1) {
        this.a = 1;
        this.b = interfaceC1454Lk1;
    }
}

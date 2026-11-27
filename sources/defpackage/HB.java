package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class HB implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ HB(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new GB((InterfaceC1131Hh) ((C2147Uh) this.b).get());
            case 1:
                return new C0835Dm0((InterfaceC1442Lg1) ((InterfaceC1531Mk1) this.b).get());
            case 2:
                C2263Vt1 retrofit = (C2263Vt1) ((InterfaceC1454Lk1) this.b).get();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Object objB = retrofit.b(InterfaceC4430iY0.class);
                Intrinsics.checkNotNullExpressionValue(objB, "retrofit.create(MediaApi::class.java)");
                InterfaceC4430iY0 interfaceC4430iY0 = (InterfaceC4430iY0) objB;
                C0957Fb.i(interfaceC4430iY0);
                return interfaceC4430iY0;
            default:
                return ((C4724jh2) this.b).a;
        }
    }

    public HB(C5208m0 c5208m0, InterfaceC1454Lk1 interfaceC1454Lk1) {
        this.a = 2;
        this.b = interfaceC1454Lk1;
    }
}

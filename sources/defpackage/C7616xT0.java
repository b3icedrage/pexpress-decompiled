package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: xT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7616xT0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1454Lk1 b;

    public /* synthetic */ C7616xT0(Object obj, InterfaceC1454Lk1 interfaceC1454Lk1, int i) {
        this.a = i;
        this.b = interfaceC1454Lk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C7406wT0((InterfaceC5889pD1) this.b.get());
            case 1:
                C2263Vt1 retrofit = (C2263Vt1) this.b.get();
                Intrinsics.checkNotNullParameter(retrofit, "retrofit");
                Object objB = retrofit.b(InterfaceC5049lE1.class);
                Intrinsics.checkNotNullExpressionValue(objB, "retrofit.create(SdkApi::class.java)");
                InterfaceC5049lE1 interfaceC5049lE1 = (InterfaceC5049lE1) objB;
                C0957Fb.i(interfaceC5049lE1);
                return interfaceC5049lE1;
            default:
                Oc2 emailValidator = (Oc2) this.b.get();
                Intrinsics.checkNotNullParameter(emailValidator, "emailValidator");
                return new C1273Jc0(emailValidator);
        }
    }

    public C7616xT0(InterfaceC1454Lk1 interfaceC1454Lk1) {
        this.a = 0;
        this.b = interfaceC1454Lk1;
    }
}

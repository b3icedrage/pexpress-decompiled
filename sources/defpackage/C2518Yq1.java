package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Yq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2518Yq1 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 1;
    public final InterfaceC1454Lk1 b;

    public C2518Yq1(LL ll, InterfaceC1454Lk1 interfaceC1454Lk1) {
        this.b = interfaceC1454Lk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C2440Xq1((InterfaceC5862p6) this.b.get());
            default:
                C3903g11 moshi = (C3903g11) this.b.get();
                Intrinsics.checkNotNullParameter(moshi, "moshi");
                return new C4081gr1(moshi);
        }
    }

    public C2518Yq1(InterfaceC1454Lk1 interfaceC1454Lk1) {
        this.b = interfaceC1454Lk1;
    }
}

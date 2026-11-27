package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: n6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5442n6 implements InterfaceC5331mb0<C5232m6> {
    public final InterfaceC1531Mk1<C4923kf> a;
    public final InterfaceC1531Mk1<AbstractC5045lD0> b;

    public C5442n6(InterfaceC1531Mk1<C4923kf> interfaceC1531Mk1, InterfaceC1531Mk1<AbstractC5045lD0> interfaceC1531Mk2) {
        this.a = interfaceC1531Mk1;
        this.b = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        C4923kf appData = this.a.get();
        AbstractC5045lD0 isShowValueUseCase = this.b.get();
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(isShowValueUseCase, "isShowValueUseCase");
        return new C5232m6(appData, isShowValueUseCase);
    }
}

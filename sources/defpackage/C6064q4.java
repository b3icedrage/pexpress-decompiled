package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: q4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6064q4 implements InterfaceC5331mb0<C5854p4> {
    public final InterfaceC1531Mk1<C4923kf> a;
    public final InterfaceC1531Mk1<InterfaceC2865b4> b;
    public final C6963uM c;
    public final InterfaceC1531Mk1<AbstractC2167Un1> d;
    public final InterfaceC1531Mk1<O3> e;

    public C6064q4(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, C6963uM c6963uM, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4) {
        this.a = interfaceC1531Mk1;
        this.b = interfaceC1531Mk2;
        this.c = c6963uM;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        C4923kf appData = this.a.get();
        InterfaceC2865b4 accountSelectionCallback = this.b.get();
        EE1 selectAccountUseCaseApi = (EE1) this.c.get();
        AbstractC2167Un1 realAccountIdUseCase = this.d.get();
        O3 accountModeSelectionUseCase = this.e.get();
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(accountSelectionCallback, "accountSelectionCallback");
        Intrinsics.checkNotNullParameter(selectAccountUseCaseApi, "selectAccountUseCaseApi");
        Intrinsics.checkNotNullParameter(realAccountIdUseCase, "realAccountIdUseCase");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        return new C5854p4(appData, accountSelectionCallback, selectAccountUseCaseApi, realAccountIdUseCase, accountModeSelectionUseCase);
    }
}

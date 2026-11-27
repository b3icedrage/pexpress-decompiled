package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Cp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0765Cp implements InterfaceC5331mb0<O1> {
    public final InterfaceC1531Mk1<AbstractC5328ma1> a;
    public final InterfaceC1531Mk1<C4923kf> b;
    public final InterfaceC1531Mk1<C3314dC> c;
    public final C0609Ap d;
    public final InterfaceC1454Lk1 e;

    public C0765Cp(C0957Fb c0957Fb, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, C0609Ap c0609Ap, InterfaceC1454Lk1 interfaceC1454Lk1) {
        this.a = interfaceC1531Mk1;
        this.b = interfaceC1531Mk2;
        this.c = interfaceC1531Mk3;
        this.d = c0609Ap;
        this.e = interfaceC1454Lk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        AbstractC5328ma1 originProvider = this.a.get();
        C4923kf appDataRepository = this.b.get();
        C0648Bc responseCookiesInterceptor = new C0648Bc();
        C3314dC ciSessionProviderImpl = this.c.get();
        Sa2 userAgentProvideBase = (Sa2) this.d.get();
        InterfaceC3207ch2 requestIdProvider = (InterfaceC3207ch2) this.e.get();
        Intrinsics.checkNotNullParameter(originProvider, "originProvider");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(responseCookiesInterceptor, "responseCookiesInterceptor");
        Intrinsics.checkNotNullParameter(ciSessionProviderImpl, "ciSessionProviderImpl");
        Intrinsics.checkNotNullParameter(userAgentProvideBase, "userAgentProvideBase");
        Intrinsics.checkNotNullParameter(requestIdProvider, "requestIdProvider");
        return new P1(originProvider, appDataRepository, responseCookiesInterceptor, ciSessionProviderImpl, userAgentProvideBase, requestIdProvider);
    }
}

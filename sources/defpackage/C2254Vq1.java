package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Vq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2254Vq1 implements InterfaceC5331mb0<InterfaceC7699xq1> {
    public final InterfaceC1531Mk1<C7278vq1> a;
    public final InterfaceC1531Mk1<VS0> b;
    public final InterfaceC1531Mk1<C6306rD> c;
    public final InterfaceC1531Mk1<C7566xC1> d;
    public final InterfaceC1531Mk1<C1221Il> e;
    public final InterfaceC1531Mk1<C5581nl0> f;
    public final InterfaceC1531Mk1<C4607j8> g;
    public final InterfaceC1531Mk1<InterfaceC6211ql0> h;
    public final InterfaceC1531Mk1<C3966gJ1> i;
    public final InterfaceC1531Mk1<InterfaceC0720Ca> j;
    public final InterfaceC1531Mk1<TU1> k;
    public final InterfaceC1531Mk1<TM1> l;
    public final InterfaceC1531Mk1<C5176lq1> m;
    public final InterfaceC1531Mk1<InterfaceC1900Rc1> n;
    public final WQ o;

    public C2254Vq1(C0957Fb c0957Fb, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, InterfaceC1531Mk1 interfaceC1531Mk5, InterfaceC1531Mk1 interfaceC1531Mk6, InterfaceC1531Mk1 interfaceC1531Mk7, InterfaceC1531Mk1 interfaceC1531Mk8, InterfaceC1531Mk1 interfaceC1531Mk9, InterfaceC1531Mk1 interfaceC1531Mk10, InterfaceC1531Mk1 interfaceC1531Mk11, InterfaceC1531Mk1 interfaceC1531Mk12, InterfaceC1531Mk1 interfaceC1531Mk13, InterfaceC1531Mk1 interfaceC1531Mk14, WQ wq) {
        this.a = interfaceC1531Mk1;
        this.b = interfaceC1531Mk2;
        this.c = interfaceC1531Mk3;
        this.d = interfaceC1531Mk4;
        this.e = interfaceC1531Mk5;
        this.f = interfaceC1531Mk6;
        this.g = interfaceC1531Mk7;
        this.h = interfaceC1531Mk8;
        this.i = interfaceC1531Mk9;
        this.j = interfaceC1531Mk10;
        this.k = interfaceC1531Mk11;
        this.l = interfaceC1531Mk12;
        this.m = interfaceC1531Mk13;
        this.n = interfaceC1531Mk14;
        this.o = wq;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        C7278vq1 registerRequestUseCase = this.a.get();
        VS0 loginRequestUseCase = this.b.get();
        C6306rD clearDataUseCase = this.c.get();
        C7566xC1 saveDataUseCase = this.d.get();
        C1221Il authenticateUseCase = this.e.get();
        C5581nl0 getPlatformUserUseCase = this.f.get();
        C4607j8 addUserUseCase = this.g.get();
        InterfaceC6211ql0 getOurUserUseCase = this.h.get();
        C3966gJ1 setConversionUseCase = this.i.get();
        InterfaceC0720Ca analyticsUseCase = this.j.get();
        TU1 successRegisterUseCase = this.k.get();
        TM1 skipTutorialUseCase = this.l.get();
        C5176lq1 registerAndLoginParamsUseCase = this.m.get();
        InterfaceC1900Rc1 pendingAddUser = this.n.get();
        InterfaceC3448dq1 refreshConfigUseCase = (InterfaceC3448dq1) this.o.get();
        Intrinsics.checkNotNullParameter(registerRequestUseCase, "registerRequestUseCase");
        Intrinsics.checkNotNullParameter(loginRequestUseCase, "loginRequestUseCase");
        Intrinsics.checkNotNullParameter(clearDataUseCase, "clearDataUseCase");
        Intrinsics.checkNotNullParameter(saveDataUseCase, "saveDataUseCase");
        Intrinsics.checkNotNullParameter(authenticateUseCase, "authenticateUseCase");
        Intrinsics.checkNotNullParameter(getPlatformUserUseCase, "getPlatformUserUseCase");
        Intrinsics.checkNotNullParameter(addUserUseCase, "addUserUseCase");
        Intrinsics.checkNotNullParameter(getOurUserUseCase, "getOurUserUseCase");
        Intrinsics.checkNotNullParameter(setConversionUseCase, "setConversionUseCase");
        Intrinsics.checkNotNullParameter(analyticsUseCase, "analyticsUseCase");
        Intrinsics.checkNotNullParameter(successRegisterUseCase, "successRegisterUseCase");
        Intrinsics.checkNotNullParameter(skipTutorialUseCase, "skipTutorialUseCase");
        Intrinsics.checkNotNullParameter(registerAndLoginParamsUseCase, "registerAndLoginParamsUseCase");
        Intrinsics.checkNotNullParameter(pendingAddUser, "pendingAddUser");
        Intrinsics.checkNotNullParameter(refreshConfigUseCase, "refreshConfigUseCase");
        return new C1316Jq1(registerRequestUseCase, loginRequestUseCase, clearDataUseCase, saveDataUseCase, authenticateUseCase, getPlatformUserUseCase, addUserUseCase, getOurUserUseCase, setConversionUseCase, analyticsUseCase, successRegisterUseCase, skipTutorialUseCase, registerAndLoginParamsUseCase, pendingAddUser, refreshConfigUseCase);
    }
}

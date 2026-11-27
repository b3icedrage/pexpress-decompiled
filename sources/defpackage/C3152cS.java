package defpackage;

import com.base.app.services.OneSignalNotificationOpenedHandler;
import com.impl.core.backend.DepositMadeWorker;
import com.impl.core.backend.a;

/* JADX INFO: renamed from: cS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3152cS implements InterfaceC1356Ke {
    public final C1763Pj A;
    public final InterfaceC1454Lk1<C5072lM0> B;
    public final InterfaceC1454Lk1<C3989gR0> C;
    public final InterfaceC1454Lk1<C2860b22> D;
    public final InterfaceC1454Lk1<DA> E;
    public final InterfaceC1454Lk1<C4667jR0> F;
    public final InterfaceC1454Lk1<C7641xb0> G;
    public final InterfaceC1454Lk1<C0854Ds1> H;
    public final InterfaceC1454Lk1<NA> I;
    public final InterfaceC1454Lk1<C2938bQ0> J;
    public final InterfaceC1454Lk1<C4464ih1> K;
    public final InterfaceC1454Lk1<T7> L;
    public final InterfaceC1454Lk1<C11> M;
    public final C2544Yz0 N;
    public final InterfaceC1454Lk1<E11> O;
    public final C2666aA0 P;
    public final C3362dS a;
    public final InterfaceC1454Lk1<M52> c;
    public final TA0 d;
    public final InterfaceC1454Lk1<C4652jM0> f;
    public final InterfaceC1454Lk1<C4953km1> g;
    public final InterfaceC1454Lk1<C3556eN> h;
    public final C3557eN0 i;
    public final VM1 j;
    public final X01 k;
    public final C3653ep l;
    public final OA1 m;
    public final C6512sB1 n;
    public final C5837p o;
    public final C4729jj p;
    public final C3653ep q;
    public final C2456Xw r;
    public final WU0 s;
    public final IB1 t;
    public final IB1 u;
    public final KJ1 v;
    public final Ii2 w;
    public final BA x;
    public final InterfaceC1454Lk1<C6038px> y;
    public final InterfaceC1454Lk1<LQ> z;
    public final C3152cS b = this;
    public final InterfaceC1454Lk1<TK1> e = Y20.b(UK1.a.a);

    public C3152cS(C3362dS c3362dS, C6621sj c6621sj) {
        this.a = c3362dS;
        this.c = Y20.b(new C0906Ek(c3362dS.f, 4));
        this.d = new TA0(new a(new PX(c3362dS.j, c3362dS.t2, c3362dS.P0, c3362dS.Z)));
        this.f = Y20.b(new IX(c3362dS.f, 1));
        this.g = Y20.b(new C5376mm1(c3362dS.O2, 0));
        InterfaceC1454Lk1<C3556eN> interfaceC1454Lk1B = Y20.b(new K6(c6621sj, 2));
        this.h = interfaceC1454Lk1B;
        InterfaceC1454Lk1<T32> interfaceC1454Lk1 = c3362dS.F0;
        C3523eC c3523eC = c3362dS.P2;
        InterfaceC1454Lk1<C4923kf> interfaceC1454Lk2 = c3362dS.j;
        InterfaceC1454Lk1<H22> interfaceC1454Lk3 = c3362dS.w1;
        C3557eN0 c3557eN0 = new C3557eN0(interfaceC1454Lk1, c3523eC, interfaceC1454Lk2, interfaceC1454Lk3);
        this.i = c3557eN0;
        C4948kl0 c4948kl0 = c3362dS.Q2;
        InterfaceC1454Lk1<C4953km1> interfaceC1454Lk4 = this.g;
        this.j = new VM1(c3523eC, c4948kl0, interfaceC1454Lk4, interfaceC1454Lk1B, interfaceC1454Lk3, c3557eN0, c3362dS.e1);
        this.k = new X01(c3523eC, c4948kl0, interfaceC1454Lk4, interfaceC1454Lk1B, interfaceC1454Lk3, c3557eN0, c3362dS.f1);
        this.l = new C3653ep(c3523eC, c4948kl0, (InterfaceC1531Mk1) interfaceC1454Lk4, (InterfaceC1454Lk1) interfaceC1454Lk1B, (InterfaceC1531Mk1) interfaceC1454Lk3, c3557eN0, c3362dS.g1);
        this.m = new OA1(c3523eC, c4948kl0, interfaceC1454Lk4, interfaceC1454Lk1B, interfaceC1454Lk3, c3557eN0, c3362dS.h1);
        this.n = new C6512sB1(c3362dS.P2, c3362dS.Q2, (InterfaceC1531Mk1) this.g, (InterfaceC1454Lk1) interfaceC1454Lk1B, (InterfaceC1531Mk1) interfaceC1454Lk3, this.i, c3362dS.i1);
        this.o = new C5837p(c3362dS.P2, c3362dS.Q2, this.g, this.h, c3362dS.w1, this.i, c3362dS.j1);
        this.p = new C4729jj(c3362dS.P2, c3362dS.Q2, this.g, this.h, c3362dS.w1, this.i, c3362dS.k1);
        this.q = new C3653ep(c3362dS.P2, c3362dS.Q2, (InterfaceC1531Mk1) this.g, (InterfaceC1531Mk1) this.h, (InterfaceC1531Mk1) c3362dS.w1, this.i, c3362dS.l1);
        this.r = new C2456Xw(c3362dS.P2, c3362dS.Q2, this.g, this.h, c3362dS.w1, this.i, c3362dS.m1);
        this.s = new WU0(c3362dS.P2, c3362dS.Q2, this.g, this.h, c3362dS.w1, this.i, c3362dS.n1);
        this.t = new IB1(c3362dS.P2, c3362dS.Q2, this.g, this.h, c3362dS.w1, this.i, c3362dS.o1, 0);
        this.u = new IB1(c3362dS.P2, c3362dS.Q2, this.g, this.h, c3362dS.w1, this.i, c3362dS.p1, 1);
        this.v = new KJ1(c3362dS.P2, c3362dS.Q2, this.g, this.h, c3362dS.w1, this.i, c3362dS.q1);
        this.w = new Ii2(c3362dS.P2, c3362dS.Q2, this.g, this.h, c3362dS.w1, this.i, c3362dS.r1);
        this.x = new BA(c3362dS.w1, c3362dS.K1);
        InterfaceC1454Lk1<C6038px> interfaceC1454Lk1B2 = Y20.b(C6248qx.a.a);
        this.y = interfaceC1454Lk1B2;
        this.z = Y20.b(new MQ(interfaceC1454Lk1B2, 0));
        this.A = new C1763Pj(c3362dS.F0, 4);
        InterfaceC1454Lk1<C5072lM0> interfaceC1454Lk1B3 = Y20.b(C5285mM0.a.a);
        this.B = interfaceC1454Lk1B3;
        this.C = Y20.b(new C4199hR0(c3362dS.j, this.i, this.A, c3362dS.P2, this.y, interfaceC1454Lk1B3));
        InterfaceC1454Lk1<C2860b22> interfaceC1454Lk1B4 = Y20.b(new C3680ey(c3362dS.K1, 1));
        this.D = interfaceC1454Lk1B4;
        this.E = Y20.b(new EA(c3362dS.K1, this.x, interfaceC1454Lk1B4, this.z, c3362dS.W0));
        this.F = Y20.b(new C5510nR0(c3362dS.w1, c3362dS.K1, c3362dS.j, this.x, this.z, this.C, this.B, this.E, c3362dS.o0));
        InterfaceC1454Lk1<C7641xb0> interfaceC1454Lk1B5 = Y20.b(new C7851yb0(this.i, 0));
        this.G = interfaceC1454Lk1B5;
        this.H = Y20.b(new C6448ru(2, c3362dS.P2, interfaceC1454Lk1B5));
        this.I = Y20.b(OA.a.a);
        InterfaceC1454Lk1<C2938bQ0> interfaceC1454Lk1B6 = Y20.b(new C3147cQ0(c3362dS.d, 0));
        this.J = interfaceC1454Lk1B6;
        this.K = Y20.b(new C5015l5(interfaceC1454Lk1B6, this.I));
        this.L = Y20.b(new M4(this.J, this.I, 1));
        this.M = Y20.b(new D11(this.I, 0));
        this.N = new C2544Yz0(this.I, this.K, this.L, this.M, 0);
        this.O = Y20.b(new C3216ck(this.I, 1));
        this.P = new C2666aA0(this.I, this.K, this.L, this.O, 0);
    }

    @Override // defpackage.InterfaceC1356Ke
    public final void a(ApplicationC0963Fd applicationC0963Fd) {
        C3362dS c3362dS = this.a;
        applicationC0963Fd.d = c3362dS.y1.get();
        applicationC0963Fd.e = c3362dS.L.get();
        applicationC0963Fd.g = c3362dS.S1.get();
        applicationC0963Fd.h = c3362dS.S.get();
        applicationC0963Fd.i = new OneSignalNotificationOpenedHandler(c3362dS.S.get());
        applicationC0963Fd.j = c3362dS.j.get();
        applicationC0963Fd.k = c3362dS.M.get();
        applicationC0963Fd.l = c3362dS.s2.get();
        applicationC0963Fd.m = c3362dS.P.get();
        applicationC0963Fd.n = c3362dS.U1.get();
        applicationC0963Fd.o = c3362dS.h.get();
        applicationC0963Fd.p = c3362dS.g.get();
        applicationC0963Fd.q = new C1435Le0(c3362dS.f.get());
        this.c.get();
        applicationC0963Fd.r = c3362dS.P.get();
        applicationC0963Fd.s = c3362dS.K.get();
        applicationC0963Fd.t = new C2594Zq((DepositMadeWorker.a) this.d.a);
        applicationC0963Fd.u = c3362dS.v2.get();
        new C1085Gr1();
        applicationC0963Fd.v = c3362dS.w2.get();
        applicationC0963Fd.w = c3362dS.R.get();
        applicationC0963Fd.x = c3362dS.i.get();
    }

    @Override // defpackage.InterfaceC1356Ke
    public final C3571eS b() {
        return new C3571eS(this.a, this.b);
    }
}

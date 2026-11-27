package com.pexpress.tool;

import android.os.SystemClock;
import defpackage.ApplicationC0963Fd;
import defpackage.BB1;
import defpackage.C0957Fb;
import defpackage.C1050Gg;
import defpackage.C1128Hg;
import defpackage.C1206Ig;
import defpackage.C1284Jg;
import defpackage.C1362Kg;
import defpackage.C1440Lg;
import defpackage.C1517Mg;
import defpackage.C1598Ng;
import defpackage.C1676Og;
import defpackage.C1754Pg;
import defpackage.C1832Qg;
import defpackage.C1910Rg;
import defpackage.C1988Sg;
import defpackage.C2066Tg;
import defpackage.C2144Ug;
import defpackage.C2222Vg;
import defpackage.C2304Wg;
import defpackage.C2408Xg;
import defpackage.C2486Yg;
import defpackage.C2564Zg;
import defpackage.C2702aM0;
import defpackage.C2771ah;
import defpackage.C2951bU1;
import defpackage.C2995bh;
import defpackage.C3204ch;
import defpackage.C3362dS;
import defpackage.C3414dh;
import defpackage.C3623eh;
import defpackage.C3784fT;
import defpackage.C3833fh;
import defpackage.C3916g42;
import defpackage.C4043gh;
import defpackage.C4253hh;
import defpackage.C4462ih;
import defpackage.C4466ii;
import defpackage.C4718jg0;
import defpackage.C4721jh;
import defpackage.C4923kf;
import defpackage.C4931kh;
import defpackage.C5141lh;
import defpackage.C5189lv;
import defpackage.C5207m;
import defpackage.C5354mh;
import defpackage.C5564nh;
import defpackage.C5774oh;
import defpackage.C5984ph;
import defpackage.C6403rh;
import defpackage.C6613sh;
import defpackage.C6741tI;
import defpackage.C6823th;
import defpackage.C7033uh;
import defpackage.C7243vh;
import defpackage.C7279vr;
import defpackage.C7700xr;
import defpackage.EM;
import defpackage.U0;
import defpackage.ZF1;
import io.sentry.android.core.C4502m;
import io.sentry.android.core.Z;
import io.sentry.android.core.performance.h;
import io.sentry.android.core.performance.i;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/pexpress/tool/AppImpl;", "LFd;", "<init>", "()V", "app_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppImpl extends ApplicationC0963Fd {
    public static final /* synthetic */ int G = 0;

    @Override // defpackage.ApplicationC0963Fd, android.app.Application
    public final void onCreate() {
        h hVar = h.u;
        long jUptimeMillis = SystemClock.uptimeMillis();
        h hVarC = h.c();
        i iVar = hVarC.j;
        if (iVar.g == 0) {
            iVar.f(jUptimeMillis);
            hVarC.h(this);
        }
        Intrinsics.checkNotNullParameter(this, "context");
        if (C7279vr.d == null) {
            C7279vr.d = new C3362dS(new C7700xr(this), new C0957Fb(), new U0(10), new C7279vr(), new C5207m());
        }
        C3362dS c3362dS = C7279vr.d;
        Intrinsics.checkNotNull(c3362dS);
        Set<String> set = ZF1.a;
        BB1 snapshotProvider = (BB1) c3362dS.n0.get();
        Intrinsics.checkNotNullParameter(this, "application");
        Intrinsics.checkNotNullParameter(snapshotProvider, "snapshotProvider");
        if (!StringsKt.I("https://148c024c2c12933d4d50be31f6c9e3d5@sentry.pbotservices.com/9")) {
            Z.b(new C6741tI(snapshotProvider), this, new C4502m());
        }
        super.onCreate();
        C3916g42 c3916g42 = c3362dS.o0.get();
        U0.l = new C1050Gg(c3916g42);
        U0.m = new C1206Ig(c3916g42, 0);
        U0.n = new C2144Ug(c3916g42);
        U0.o = new C3414dh(c3916g42);
        U0.p = new C3623eh(c3916g42, 0);
        U0.q = new C3833fh(c3916g42);
        U0.r = new C4043gh(c3916g42);
        U0.s = new C4253hh(c3916g42);
        U0.t = new C4462ih(c3916g42);
        U0.u = new C4721jh(c3916g42);
        U0.v = new C1910Rg(c3916g42);
        U0.w = new C3204ch(c3916g42);
        U0.x = new C4931kh(c3916g42);
        U0.y = new C5141lh(c3916g42);
        U0.z = new C5354mh(c3916g42);
        U0.A = new C5564nh(c3916g42);
        U0.B = new C5774oh(c3916g42);
        U0.C = new C5984ph(c3916g42, 0);
        U0.L = new C1206Ig(c3916g42, 1);
        U0.D = new C1128Hg(c3916g42);
        U0.E = new C1284Jg(c3916g42);
        U0.F = new C1362Kg(c3916g42);
        U0.G = new C1440Lg(c3916g42);
        U0.I = new C1517Mg(c3916g42);
        U0.J = new C1598Ng(c3916g42);
        U0.K = new C1676Og(c3916g42, 0);
        U0.M = new C1754Pg(c3916g42);
        U0.N = new C1832Qg(c3916g42);
        U0.O = new C1988Sg(c3916g42);
        U0.R = new C2066Tg(c3916g42);
        U0.S = new C2222Vg(c3916g42, 0);
        U0.T = new C2304Wg(c3916g42, 0);
        U0.P = new C2408Xg(c3916g42);
        U0.Q = new C2486Yg(c3916g42);
        U0.H = new C2564Zg(c3916g42);
        U0.U = new C2771ah(c3916g42);
        U0.V = new C2995bh(c3916g42);
        C2702aM0 c2702aM0 = new C2702aM0(c3362dS.f.get());
        C2951bU1 c2951bU1 = c3362dS.L.get();
        C4923kf c4923kf = c3362dS.j.get();
        C4718jg0 c4718jg0 = new C4718jg0(C4466ii.m(C4466ii.l(c4923kf.k, new C6403rh(c4923kf.f, 0), c4923kf.d, c4923kf.e, new C6613sh(5, null))), new C6823th(2, null));
        EM em = C3784fT.a;
        C4466ii.v(em, c4718jg0);
        C5189lv.k(em, null, new C7033uh(c2951bU1, null), 3);
        C4466ii.v(em, new C4718jg0(C4466ii.m(c2702aM0.l()), new C7243vh(2, null)));
        h.d(this);
    }
}

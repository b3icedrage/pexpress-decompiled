package io.sentry.util;

import defpackage.C2171Up;
import defpackage.C2688aH1;
import defpackage.C5364mj1;
import defpackage.InterfaceC1015Fu0;
import defpackage.KD1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z implements KD1.a {
    public final /* synthetic */ InterfaceC1015Fu0 d;
    public final /* synthetic */ C2688aH1 e;

    public /* synthetic */ z(InterfaceC1015Fu0 interfaceC1015Fu0, C2688aH1 c2688aH1) {
        this.d = interfaceC1015Fu0;
        this.e = c2688aH1;
    }

    @Override // KD1.a
    public final void a(C5364mj1 c5364mj1) {
        C2171Up c2171Up = c5364mj1.c;
        if (c2171Up.f) {
            InterfaceC1015Fu0 interfaceC1015Fu0 = this.d;
            C5364mj1 c5364mj1Y = interfaceC1015Fu0.y();
            io.sentry.protocol.u uVarK = interfaceC1015Fu0.k();
            c2171Up.d("sentry-trace_id", c5364mj1Y.a.toString());
            C2688aH1 c2688aH1 = this.e;
            c2171Up.d("sentry-public_key", c2688aH1.retrieveParsedDsn().b);
            c2171Up.d("sentry-release", c2688aH1.getRelease());
            c2171Up.d("sentry-environment", c2688aH1.getEnvironment());
            if (!io.sentry.protocol.u.e.equals(uVarK)) {
                c2171Up.d("sentry-replay_id", uVarK.toString());
            }
            c2171Up.d("sentry-transaction", null);
            if (c2171Up.f) {
                c2171Up.c = null;
            }
            c2171Up.d("sentry-sampled", null);
            c2171Up.f = false;
        }
    }
}

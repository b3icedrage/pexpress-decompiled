package defpackage;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Wf2 extends G1 {
    public final /* synthetic */ C5686oG e;
    public final /* synthetic */ Zf2 f;
    public final /* synthetic */ C6251qy g;
    public final /* synthetic */ List<InterfaceC7414wW<C5686oG>> h;

    public Wf2(C5686oG c5686oG, Zf2 zf2, C6251qy c6251qy, List list) {
        this.e = c5686oG;
        this.f = zf2;
        this.g = c6251qy;
        this.h = list;
    }

    @Override // defpackage.G1
    public final void n(C7483wo1 webSocket, Exception t, C0857Dt1 c0857Dt1) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(t, "t");
        super.n(webSocket, t, c0857Dt1);
        webSocket.c(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, "NEED_TO_STOP");
        C5686oG c5686oG = this.e;
        if (c5686oG.c == null) {
            c5686oG.c = Boolean.FALSE;
        }
        ConcurrentHashMap<String, String> concurrentHashMap = this.f.d;
        Class<?> cls = t.getClass();
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        String strF = c2251Vp1.b(cls).f();
        if (strF == null) {
            strF = "Throwable";
        }
        String strConcat = "failed:".concat(strF);
        String str = c5686oG.a;
        concurrentHashMap.put(str, strConcat);
        t.getMessage();
        C1754Pg c1754Pg = U0.M;
        if (c1754Pg != null) {
            String strF2 = c2251Vp1.b(t.getClass()).f();
            c1754Pg.invoke(str, strF2 != null ? strF2 : "Throwable");
        }
        this.g.l(t);
    }

    @Override // defpackage.G1
    public final void s(Qf2 webSocket, C0857Dt1 response) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(response, "response");
        C5686oG c5686oG = this.e;
        String str = c5686oG.a;
        super.s(webSocket, response);
        Zf2 zf2 = this.f;
        String str2 = c5686oG.a;
        C0857Dt1 c0857Dt1 = response.l;
        ConcurrentHashMap<String, String> concurrentHashMap = zf2.d;
        if (c0857Dt1 == null) {
            concurrentHashMap.put(str2, "no_network_response");
            return;
        }
        concurrentHashMap.put(str2, "ok");
        c5686oG.b = c0857Dt1.p - c0857Dt1.o;
        webSocket.c(CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT, "NEED_TO_STOP");
        c5686oG.c = Boolean.TRUE;
        C1717Ot1.a aVar = C1717Ot1.e;
        this.g.resumeWith(c5686oG);
        List<InterfaceC7414wW<C5686oG>> list = this.h;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC7414wW) it.next()).l(null);
            }
        }
    }
}

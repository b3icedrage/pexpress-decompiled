package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.lifecycle.LiveData;
import com.jivosite.sdk.model.pojo.response.Response;
import io.sentry.android.core.internal.util.a;
import io.sentry.util.C4527a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class DF0 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ DF0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [ML0, kotlin.jvm.functions.Function0] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                SF0 this$0 = (SF0) this.e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EY0<SF0.c> ey0 = this$0.x;
                SF0.c cVarD = ey0.d();
                ey0.k(cVarD != null ? SF0.c.a(cVarD, null, true, null, null, null, null, null, null, null, null, 2043) : null);
                return;
            case 1:
                final Z31 this$1 = (Z31) this.e;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                EY0<C3457dt1<Object>> ey1 = this$1.a;
                ey1.k(new C3457dt1<>(0, null, null, null, 31));
                final LiveData<S> liveData = (LiveData) this$1.b.invoke();
                ey1.l(liveData, new InterfaceC4819k81() { // from class: Y31
                    /* JADX WARN: Type inference failed for: r0v5, types: [ML0, kotlin.jvm.functions.Function1] */
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // defpackage.InterfaceC4819k81
                    public final void d(Object obj) {
                        C4705jd c4705jd = (C4705jd) obj;
                        Z31 this$2 = this$1;
                        Intrinsics.checkNotNullParameter(this$2, "this$0");
                        LiveData apiSource = liveData;
                        Intrinsics.checkNotNullParameter(apiSource, "$apiSource");
                        this$2.a.m(apiSource);
                        EY0<C3457dt1<Object>> ey2 = this$2.a;
                        if (c4705jd == null) {
                            C6104qF0.b("There is something wrong in NetworkResource");
                            ey2.k(new C3457dt1<>(2, null, null, null, 6));
                            return;
                        }
                        int i = c4705jd.a;
                        if (200 > i || i >= 300) {
                            C4201hS c4201hS = C6104qF0.a;
                            StringBuilder sb = new StringBuilder("There is something wrong, code = ");
                            sb.append(i);
                            sb.append(", error = ");
                            Throwable th = c4705jd.d;
                            sb.append(th != null ? th.getLocalizedMessage() : null);
                            C6104qF0.b(sb.toString());
                            if (th != null) {
                                th.getLocalizedMessage();
                            }
                            ey2.k(new C3457dt1<>(2, null, null, th, 6));
                            return;
                        }
                        Object obj2 = c4705jd.b;
                        if (!(obj2 instanceof Response)) {
                            if (obj2 != null) {
                                C6104qF0.h("Body response is Empty");
                                return;
                            } else {
                                C6104qF0.b("There is something wrong in body response");
                                ey2.k(new C3457dt1<>(2, null, null, null, 6));
                                return;
                            }
                        }
                        Response response = (Response) obj2;
                        if (response.a() == null) {
                            ey2.k(new C3457dt1<>(1, null, this$2.c.invoke(obj2), null, 26));
                            return;
                        }
                        HashMap map = new HashMap();
                        List<String> listA = response.a();
                        if (listA != null) {
                            Iterator<T> it = listA.iterator();
                            while (it.hasNext()) {
                                map.put((String) it.next(), "");
                            }
                        }
                        C6313rF0 c6313rF0 = new C6313rF0(map);
                        c6313rF0.getLocalizedMessage();
                        ey2.k(new C3457dt1<>(2, null, null, c6313rF0, 6));
                    }
                });
                return;
            case 2:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC4727ji1((Context) this.e, 0));
                return;
            case 3:
                C8025zP1.m39scheduleStart$lambda2((C8025zP1) this.e);
                return;
            default:
                a aVar = (a) this.e;
                aVar.A(null);
                InterfaceC4761js0.a aVarL = aVar.l();
                if (aVarL == InterfaceC4761js0.a.DISCONNECTED) {
                    aVar.o.set(false);
                    C4527a.C0404a c0404aA = a.r.a();
                    try {
                        Iterator it = a.s.iterator();
                        while (it.hasNext()) {
                            ((ConnectivityManager.NetworkCallback) it.next()).onLost(null);
                        }
                        c0404aA.close();
                    } catch (Throwable th) {
                        try {
                            c0404aA.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                C4527a.C0404a c0404aA2 = aVar.j.a();
                try {
                    Iterator it2 = aVar.i.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC4761js0.b) it2.next()).c(aVarL);
                    }
                    c0404aA2.close();
                    aVar.k();
                    return;
                } catch (Throwable th3) {
                    try {
                        c0404aA2.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
        }
    }
}

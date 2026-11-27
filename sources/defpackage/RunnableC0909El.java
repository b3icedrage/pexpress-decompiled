package defpackage;

import androidx.fragment.app.FragmentManager;
import com.api.feature.telemetry.exceptions.RobotTelemetryException;
import com.base.feature.robot.robot.common.screens.RobotCommonFragment;
import com.impl.feature.activation.register.ReRegistrationFragmentImpl;
import io.sentry.android.core.AppState;
import io.sentry.android.core.internal.util.a;
import io.sentry.util.C4527a;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: El, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0909El implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC0909El(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                C0831Dl.b bVar = (C0831Dl.b) this.e;
                if (bVar.c.e()) {
                    return;
                }
                C0831Dl.a aVar = bVar.a;
                aVar.getClass();
                String step = bVar.b;
                Intrinsics.checkNotNullParameter(step, "step");
                String flow = aVar.a;
                Map mapE = PW0.e(new Pair("flow", flow), new Pair("step", step));
                NG1 ng1 = NG1.WARNING;
                WF1.a("auth", "auth.step_stuck", ng1, mapE);
                C4059gl c4059gl = aVar.j.a;
                c4059gl.getClass();
                Intrinsics.checkNotNullParameter(flow, "flow");
                Intrinsics.checkNotNullParameter(step, "step");
                List listF = WE.f("auth-step-stuck", flow, step);
                Object c3849fl = !c4059gl.c.a(CollectionsKt.J(listF, "|", null, null, null, 62)) ? C3639el.a : new C3849fl(ng1, listF);
                if (c3849fl instanceof C3849fl) {
                    Intrinsics.checkNotNullParameter(flow, "flow");
                    Intrinsics.checkNotNullParameter(step, "step");
                    QF1.a(new RobotTelemetryException.AuthStepStuck(C4694ja0.a("Auth ", flow, " stuck at ", step, " for 20000ms"), null), new C7259vl(aVar, (C3849fl) c3849fl, step));
                    return;
                }
                return;
            case 1:
                ReRegistrationFragmentImpl reRegistrationFragmentImpl = (ReRegistrationFragmentImpl) this.e;
                Object obj = reRegistrationFragmentImpl.i;
                Intrinsics.checkNotNull(obj);
                C7059un1 c7059un1 = (C7059un1) obj;
                FragmentManager fragmentManager = reRegistrationFragmentImpl.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(fragmentManager, "getChildFragmentManager(...)");
                int id = reRegistrationFragmentImpl.t.a().getId();
                c7059un1.getClass();
                Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
                c7059un1.O.a(fragmentManager, id);
                return;
            case 2:
                int i = RobotCommonFragment.r;
                ((InterfaceC3907g21) this.e).setValue(Boolean.TRUE);
                return;
            default:
                a aVar2 = (a) this.e;
                aVar2.v(true);
                C4527a.C0404a c0404aA = a.r.a();
                try {
                    a.s.clear();
                    c0404aA.close();
                    C4527a.C0404a c0404aA2 = a.p.a();
                    try {
                        a.q = null;
                        c0404aA2.close();
                        AppState.i.k(aVar2);
                        return;
                    } catch (Throwable th) {
                        try {
                            c0404aA2.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        c0404aA.close();
                        throw th3;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                        throw th3;
                    }
                }
        }
    }
}

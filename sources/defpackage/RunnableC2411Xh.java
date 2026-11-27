package defpackage;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.impl.feature.registration.screens.authorization.AuthorizationFragmentImpl;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import io.sentry.android.replay.screenshot.e;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2411Xh implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC2411Xh(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                AppStartTrace appStartTrace = (AppStartTrace) this.e;
                if (appStartTrace.s != null) {
                    return;
                }
                appStartTrace.s = new QZ1();
                I02.a aVarP = I02.P();
                aVarP.x("_experiment_preDrawFoQ");
                aVarP.v(appStartTrace.c().d);
                aVarP.w(appStartTrace.c().b(appStartTrace.s));
                I02 i02N = aVarP.n();
                I02.a aVar = appStartTrace.h;
                aVar.s(i02N);
                appStartTrace.e(aVar);
                return;
            case 1:
                AuthorizationFragmentImpl authorizationFragmentImpl = (AuthorizationFragmentImpl) this.e;
                Object obj = authorizationFragmentImpl.i;
                Intrinsics.checkNotNull(obj);
                C2084Tm c2084Tm = (C2084Tm) obj;
                FragmentManager fragmentManager = authorizationFragmentImpl.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(fragmentManager, "getChildFragmentManager(...)");
                int id = authorizationFragmentImpl.n.a().getId();
                c2084Tm.getClass();
                Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
                c2084Tm.g0.a(fragmentManager, id);
                return;
            case 2:
                ((Toolbar) this.e).m();
                return;
            case 3:
                SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = (SystemEventsBreadcrumbsIntegration) this.e;
                systemEventsBreadcrumbsIntegration.l(systemEventsBreadcrumbsIntegration.g);
                return;
            default:
                e eVar = (e) this.e;
                if (!eVar.f.isRecycled()) {
                    synchronized (eVar.f) {
                        try {
                            if (!eVar.f.isRecycled()) {
                                eVar.f.recycle();
                            }
                            Unit unit = Unit.a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                eVar.i.close();
                return;
        }
    }
}

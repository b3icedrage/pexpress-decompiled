package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.work.CoroutineWorker;
import com.google.firebase.perf.metrics.AppStartTrace;
import io.sentry.metrics.d;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Yd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2477Yd implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC2477Yd(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                if (Build.VERSION.SDK_INT >= 33) {
                    Context context = (Context) this.e;
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (AbstractC2759ae.g().a.a.isEmpty()) {
                            String strB = C0585Ah.b(context);
                            Object systemService = context.getSystemService("locale");
                            if (systemService != null) {
                                AbstractC2759ae.b.b(systemService, AbstractC2759ae.a.a(strB));
                            }
                        }
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                AbstractC2759ae.j = true;
                break;
            case 1:
                AppStartTrace appStartTrace = (AppStartTrace) this.e;
                if (appStartTrace.t == null) {
                    appStartTrace.t = new QZ1();
                    I02.a aVarP = I02.P();
                    aVarP.x("_experiment_onDrawFoQ");
                    aVarP.v(appStartTrace.c().d);
                    aVarP.w(appStartTrace.c().b(appStartTrace.t));
                    I02 i02N = aVarP.n();
                    I02.a aVar = appStartTrace.h;
                    aVar.s(i02N);
                    if (appStartTrace.k != null) {
                        I02.a aVarP2 = I02.P();
                        aVarP2.x("_experiment_procStart_to_classLoad");
                        aVarP2.v(appStartTrace.c().d);
                        aVarP2.w(appStartTrace.c().b(appStartTrace.a()));
                        aVar.s(aVarP2.n());
                    }
                    String str = appStartTrace.y ? "true" : "false";
                    aVar.p();
                    I02.A((I02) aVar.e).put("systemDeterminedForeground", str);
                    aVar.t("onDrawCount", appStartTrace.w);
                    C5970pd1 c5970pd1A = appStartTrace.u.a();
                    aVar.p();
                    I02.B((I02) aVar.e, c5970pd1A);
                    appStartTrace.e(aVar);
                    break;
                }
                break;
            case 2:
                CoroutineWorker._init_$lambda$0((CoroutineWorker) this.e);
                break;
            case 3:
                ArrayList transitioningViews = (ArrayList) this.e;
                Intrinsics.checkNotNullParameter(transitioningViews, "$transitioningViews");
                C1213Ii0.c(4, transitioningViews);
                break;
            default:
                d dVar = (d) this.e;
                dVar.h.a(dVar.d.getShutdownTimeoutMillis());
                break;
        }
    }
}

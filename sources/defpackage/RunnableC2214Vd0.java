package defpackage;

import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import com.appsflyer.AFLogger;
import com.appsflyer.f;
import io.sentry.android.core.C4508t;
import io.sentry.cache.m;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Vd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2214Vd0 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC2214Vd0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.e;
        switch (this.d) {
            case 0:
                ((C2296Wd0) obj).a();
                break;
            case 1:
                ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.m;
                ProcessLifecycleOwner this$0 = (ProcessLifecycleOwner) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int i = this$0.e;
                l lVar = this$0.j;
                if (i == 0) {
                    this$0.g = true;
                    lVar.f(g.a.ON_PAUSE);
                }
                if (this$0.d == 0 && this$0.g) {
                    lVar.f(g.a.ON_STOP);
                    this$0.h = true;
                    break;
                }
                break;
            case 2:
                C2688aH1 c2688aH1 = (C2688aH1) obj;
                for (InterfaceC4089gu0 interfaceC4089gu0 : c2688aH1.getOptionsObservers()) {
                    interfaceC4089gu0.g(c2688aH1.getRelease());
                    interfaceC4089gu0.f(c2688aH1.getProguardUuid());
                    interfaceC4089gu0.b(c2688aH1.getSdkVersion());
                    interfaceC4089gu0.c(c2688aH1.getDist());
                    interfaceC4089gu0.e(c2688aH1.getEnvironment());
                    interfaceC4089gu0.a(c2688aH1.getTags());
                    interfaceC4089gu0.d(c2688aH1.getSessionReplay().e);
                }
                m mVarFindPersistingScopeObserver = c2688aH1.findPersistingScopeObserver();
                if (mVarFindPersistingScopeObserver != null) {
                    try {
                        mVarFindPersistingScopeObserver.b.a().clear();
                    } catch (IOException e) {
                        mVarFindPersistingScopeObserver.a.getLogger().d(NG1.ERROR, "Failed to clear breadcrumbs from file queue", e);
                    }
                    mVarFindPersistingScopeObserver.a("user.json");
                    mVarFindPersistingScopeObserver.a("level.json");
                    mVarFindPersistingScopeObserver.a("request.json");
                    mVarFindPersistingScopeObserver.a("fingerprint.json");
                    mVarFindPersistingScopeObserver.a("contexts.json");
                    mVarFindPersistingScopeObserver.a("extras.json");
                    mVarFindPersistingScopeObserver.a("tags.json");
                    mVarFindPersistingScopeObserver.a("trace.json");
                    mVarFindPersistingScopeObserver.a("transaction.json");
                }
                break;
            case 3:
                AFLogger.unregisterClient((f) obj);
                break;
            default:
                ((C4508t) obj).a(null, true);
                break;
        }
    }
}

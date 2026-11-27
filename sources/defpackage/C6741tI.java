package defpackage;

import com.appsflyer.sdk_base.BuildConfig;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.remoteconfig.internal.a;
import com.impl.core.backend.abstractModels.http.HttpPlatformResponse;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.util.l;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: tI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6741tI implements SuccessContinuation, OnSuccessListener, QF1.a, InterfaceC3981gO1, Continuation, l.a {
    public final /* synthetic */ Object d;

    public /* synthetic */ C6741tI(Object obj) {
        this.d = obj;
    }

    @Override // QF1.a
    public void a(C2688aH1 c2688aH1) {
        SentryAndroidOptions options = (SentryAndroidOptions) c2688aH1;
        Intrinsics.checkNotNullParameter(options, "options");
        options.setDsn("https://148c024c2c12933d4d50be31f6c9e3d5@sentry.pbotservices.com/9");
        options.setEnvironment("production");
        Set<String> set = ZF1.a;
        options.setDebug(set.contains(BuildConfig.BUILD_TYPE));
        options.setRelease("com.pexpress.tool@2.6.0+1792495702");
        options.setTag("app_name", "pocketbot");
        options.setTracesSampler(new RF0(set.contains(BuildConfig.BUILD_TYPE) ? new ZF1.a(1.0d, 1.0d, 1.0d, 1.0d) : new ZF1.a(0.33d, 0.5d, 0.2d, 0.1d)));
        options.setSendDefaultPii(true);
        options.setAttachScreenshot(false);
        options.setAttachViewHierarchy(false);
        options.setMaxBreadcrumbs(HttpPlatformResponse.MAX_MESSAGE_LENGTH);
        options.setAnrEnabled(true);
        options.setAnrTimeoutIntervalMillis(5000L);
        options.setEnableAutoSessionTracking(true);
        options.setEnableActivityLifecycleBreadcrumbs(true);
        options.setEnableNetworkEventBreadcrumbs(true);
        options.setEnableAutoActivityLifecycleTracing(true);
        options.setTracePropagationTargets(VE.c(C2688aH1.DEFAULT_PROPAGATION_TARGETS));
        options.setBeforeSend(new C6634sm0(new C6018pq0(), 6));
        options.setBeforeBreadcrumb(new C4904ka0(4));
        options.addEventProcessor(new C2685aG1((BB1) this.d));
    }

    @Override // io.sentry.util.l.a
    public Object b() {
        return ((SentryAndroidOptions) this.d).getExecutorService();
    }

    @Override // defpackage.InterfaceC3981gO1
    public void c(C3352dO1 c3352dO1) {
        C7581xH1 c7581xH1 = (C7581xH1) this.d;
        JH jh = c7581xH1.q;
        if (jh != null) {
            jh.f(c3352dO1);
        }
        C7581xH1.b bVar = c7581xH1.f;
        C5437n42 c5437n42 = c7581xH1.r;
        if (c5437n42.g == null) {
            if (bVar.a) {
                c7581xH1.r(bVar.b, null);
                return;
            }
            return;
        }
        if (c5437n42.f) {
            ListIterator listIterator = c7581xH1.c.listIterator();
            while (listIterator.hasNext()) {
                C3352dO1 c3352dO2 = (C3352dO1) listIterator.next();
                if (!c3352dO2.g && c3352dO2.b == null) {
                    return;
                }
            }
        }
        c7581xH1.u();
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        boolean z;
        B02 b02 = (B02) obj;
        if (!((FirebaseMessaging) this.d).g.a() || b02.h.a() == null) {
            return;
        }
        synchronized (b02) {
            z = b02.g;
        }
        if (z) {
            return;
        }
        b02.f(0L);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean zIsSuccessful = task.isSuccessful();
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
        if (zIsSuccessful) {
            taskCompletionSource.trySetResult(task.getResult());
            return null;
        }
        Exception exception = task.getException();
        Objects.requireNonNull(exception);
        taskCompletionSource.trySetException(exception);
        return null;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult((a.C0317a) this.d);
    }
}

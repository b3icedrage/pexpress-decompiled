package defpackage;

import android.content.DialogInterface;
import android.view.Choreographer;
import com.api.core.bottomsheetdialogfragment.AbstractBottomSheetDialogFragment;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.bottomsheet.b;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.a;
import com.google.firebase.perf.metrics.AppStartTrace;
import io.sentry.android.core.C4502m;
import io.sentry.android.core.internal.util.v;
import io.sentry.cache.m;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class P implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ P(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.g;
        Object obj2 = this.e;
        switch (this.d) {
            case 0:
                DialogInterface dialogInterface = (DialogInterface) obj2;
                Intrinsics.c(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                ((b) dialogInterface).f().C(((AbstractBottomSheetDialogFragment) obj).d);
                break;
            case 1:
                QZ1 qz1 = AppStartTrace.z;
                AppStartTrace appStartTrace = (AppStartTrace) obj2;
                appStartTrace.getClass();
                appStartTrace.e.c(((I02.a) obj).n(), EnumC1134Hi.FOREGROUND_BACKGROUND);
                break;
            case 2:
                AI1 stateContext = (AI1) obj2;
                Intrinsics.checkNotNullParameter(stateContext, "$stateContext");
                L70 this$0 = (L70) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                stateContext.c(C5720oR0.class);
                this$0.e.a(AbstractC4645jK.f.a);
                this$0.c.a();
                break;
            case 3:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                a aVar = FirebaseMessaging.n;
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) obj2;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
                break;
            case 4:
                v vVar = (v) obj2;
                vVar.getClass();
                try {
                    vVar.n = Choreographer.getInstance();
                } catch (Throwable th) {
                    ((C4502m) obj).d(NG1.ERROR, "Error retrieving Choreographer instance. Slow and frozen frames will not be reported.", th);
                    return;
                }
                break;
            default:
                ((m) obj2).f((List) obj, "fingerprint.json");
                break;
        }
    }
}

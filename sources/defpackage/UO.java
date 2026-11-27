package defpackage;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import io.sentry.android.core.b0;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class UO implements SuccessContinuation {
    public final Object d;
    public final Object e;

    public UO(@NotNull Activity activity, @NotNull ViewTreeObserverOnGlobalLayoutListenerC7168vK0 globalLayoutListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(globalLayoutListener, "globalLayoutListener");
        this.d = new WeakReference(activity);
        this.e = new WeakReference(globalLayoutListener);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    @NonNull
    public Task then(Object obj) {
        if (((C6326rJ1) obj) == null) {
            b0.f("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return Tasks.forResult(null);
        }
        YO yo = ((VO) this.e).i;
        return Tasks.whenAll((Task<?>[]) new Task[]{YO.b(yo), yo.l.d(null, (ExecutorService) this.d)});
    }

    public UO(VO vo, ExecutorService executorService, String str) {
        this.e = vo;
        this.d = executorService;
    }
}

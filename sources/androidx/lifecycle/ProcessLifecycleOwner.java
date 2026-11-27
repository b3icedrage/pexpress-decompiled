package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import defpackage.FP0;
import defpackage.R51;
import defpackage.RunnableC2214Vd0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "LFP0;", "<init>", "()V", R51.PUSH_ADDITIONAL_DATA_KEY, "lifecycle-process_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ProcessLifecycleOwner implements FP0 {

    @NotNull
    public static final ProcessLifecycleOwner m = new ProcessLifecycleOwner();
    public int d;
    public int e;

    @Nullable
    public Handler i;
    public boolean g = true;
    public boolean h = true;

    @NotNull
    public final l j = new l(this);

    @NotNull
    public final RunnableC2214Vd0 k = new RunnableC2214Vd0(this, 1);

    @NotNull
    public final b l = new b();

    public static final class a {
        public static final void a(@NotNull Activity activity, @NotNull Application.ActivityLifecycleCallbacks callback) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    public static final class b {
        public b() {
        }
    }

    private ProcessLifecycleOwner() {
    }

    public final void a() {
        int i = this.e + 1;
        this.e = i;
        if (i == 1) {
            if (this.g) {
                this.j.f(g.a.ON_RESUME);
                this.g = false;
            } else {
                Handler handler = this.i;
                Intrinsics.checkNotNull(handler);
                handler.removeCallbacks(this.k);
            }
        }
    }

    @Override // defpackage.FP0
    @NotNull
    public final g getLifecycle() {
        return this.j;
    }
}

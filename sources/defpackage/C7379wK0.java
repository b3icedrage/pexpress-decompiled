package defpackage;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7379wK0 implements Application.ActivityLifecycleCallbacks {
    public final Activity d;
    public final /* synthetic */ UO e;

    public C7379wK0(UO uo, Activity targetActivity) {
        this.e = uo;
        Intrinsics.checkNotNullParameter(targetActivity, "targetActivity");
        this.d = targetActivity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Activity activity2 = this.d;
        if (activity == activity2) {
            activity2.getApplication().unregisterActivityLifecycleCallbacks(this);
            UO uo = this.e;
            WeakReference weakReference = (WeakReference) uo.d;
            Activity activity3 = (Activity) weakReference.get();
            WeakReference weakReference2 = (WeakReference) uo.e;
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) weakReference2.get();
            if (activity3 != null && onGlobalLayoutListener != null) {
                Intrinsics.checkNotNullParameter(activity3, "activity");
                View viewFindViewById = activity3.findViewById(R.id.content);
                Intrinsics.checkNotNullExpressionValue(viewFindViewById, "activity.findViewById(android.R.id.content)");
                View rootView = ((ViewGroup) viewFindViewById).getRootView();
                Intrinsics.checkNotNullExpressionValue(rootView, "getContentRoot(activity).rootView");
                rootView.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            weakReference.clear();
            weakReference2.clear();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }
}

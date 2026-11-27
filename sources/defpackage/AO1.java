package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import com.google.android.gms.common.api.Api;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AO1 implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ BO1 d;
    public final /* synthetic */ ActivityC6781tV0 e;

    public AO1(BO1 bo1, ActivityC6781tV0 activityC6781tV0) {
        this.d = bo1;
        this.e = activityC6781tV0;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(@Nullable View view, @Nullable View view2) {
        if (C7812yO1.a(view2)) {
            SplashScreenView child = C8022zO1.a(view2);
            this.d.getClass();
            Intrinsics.checkNotNullParameter(child, "child");
            WindowInsets windowInsetsBuild = C7602xO1.a().build();
            Intrinsics.checkNotNullExpressionValue(windowInsetsBuild, "Builder().build()");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER);
            if (windowInsetsBuild == child.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect)) {
                rect.isEmpty();
            }
            ((ViewGroup) this.e.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(@Nullable View view, @Nullable View view2) {
    }
}

package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

/* JADX INFO: renamed from: Di0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0823Di0 extends FragmentManager.FragmentLifecycleCallbacks {
    public final /* synthetic */ Fragment a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ FragmentStateAdapter c;

    public C0823Di0(FragmentStateAdapter fragmentStateAdapter, Fragment fragment, FrameLayout frameLayout) {
        this.c = fragmentStateAdapter;
        this.a = fragment;
        this.b = frameLayout;
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentViewCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull View view, Bundle bundle) {
        if (fragment == this.a) {
            fragmentManager.d0(this);
            this.c.getClass();
            FragmentStateAdapter.o(view, this.b);
        }
    }
}

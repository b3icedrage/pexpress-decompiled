package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager2.adapter.FragmentStateAdapter;

/* JADX INFO: renamed from: Ci0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC0745Ci0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ FrameLayout d;
    public final /* synthetic */ C1995Si0 e;
    public final /* synthetic */ FragmentStateAdapter g;

    public ViewOnLayoutChangeListenerC0745Ci0(FragmentStateAdapter fragmentStateAdapter, FrameLayout frameLayout, C1995Si0 c1995Si0) {
        this.g = fragmentStateAdapter;
        this.d = frameLayout;
        this.e = c1995Si0;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        FrameLayout frameLayout = this.d;
        if (frameLayout.getParent() != null) {
            frameLayout.removeOnLayoutChangeListener(this);
            this.g.t(this.e);
        }
    }
}

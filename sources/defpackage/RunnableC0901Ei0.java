package defpackage;

import androidx.viewpager2.adapter.FragmentStateAdapter;

/* JADX INFO: renamed from: Ei0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0901Ei0 implements Runnable {
    public final /* synthetic */ FragmentStateAdapter d;

    public RunnableC0901Ei0(FragmentStateAdapter fragmentStateAdapter) {
        this.d = fragmentStateAdapter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FragmentStateAdapter fragmentStateAdapter = this.d;
        fragmentStateAdapter.j = false;
        fragmentStateAdapter.r();
    }
}

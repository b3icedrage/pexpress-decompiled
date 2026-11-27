package androidx.viewpager2.widget;

/* JADX INFO: loaded from: classes.dex */
public final class d extends ViewPager2.e {
    public final /* synthetic */ ViewPager2 a;

    public d(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void a(int i) {
        if (i == 0) {
            this.a.e();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void c(int i) {
        ViewPager2 viewPager2 = this.a;
        if (viewPager2.h != i) {
            viewPager2.h = i;
            viewPager2.x.a();
        }
    }
}

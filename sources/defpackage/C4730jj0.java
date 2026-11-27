package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.base.feature.stories.screens.full.FullStoriesFragmentBase;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: jj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4730jj0 extends ViewPager2.e {
    public final /* synthetic */ FullStoriesFragmentBase a;

    public C4730jj0(FullStoriesFragmentBase fullStoriesFragmentBase) {
        this.a = fullStoriesFragmentBase;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void a(int i) {
        FullStoriesFragmentBase fullStoriesFragmentBase = this.a;
        if (i == 0) {
            Object obj = fullStoriesFragmentBase.i;
            Intrinsics.checkNotNull(obj);
            ((C5783oj0) obj).e();
        } else {
            if (i != 1) {
                return;
            }
            Object obj2 = fullStoriesFragmentBase.i;
            Intrinsics.checkNotNull(obj2);
            ((C5783oj0) obj2).b();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.e
    public final void c(int i) {
        Object obj = this.a.i;
        Intrinsics.checkNotNull(obj);
        ((C5783oj0) obj).d.a(i);
    }
}

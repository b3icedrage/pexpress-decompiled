package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: renamed from: ii0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4467ii0 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final ViewPager2 e;

    public C4467ii0(@NonNull ConstraintLayout constraintLayout, @NonNull ViewPager2 viewPager2) {
        this.d = constraintLayout;
        this.e = viewPager2;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

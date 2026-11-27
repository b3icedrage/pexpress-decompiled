package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: renamed from: uu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7078uu implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final ImageView e;

    @NonNull
    public final TabLayout g;

    @NonNull
    public final TextView h;

    @NonNull
    public final ViewPager2 i;

    public C7078uu(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull TabLayout tabLayout, @NonNull TextView textView, @NonNull ViewPager2 viewPager2) {
        this.d = constraintLayout;
        this.e = imageView;
        this.g = tabLayout;
        this.h = textView;
        this.i = viewPager2;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

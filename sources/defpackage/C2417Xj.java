package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.switchmaterial.SwitchMaterial;

/* JADX INFO: renamed from: Xj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2417Xj implements InterfaceC7441wd2 {

    @NonNull
    public final FrameLayout d;

    @NonNull
    public final ImageView e;

    @NonNull
    public final TextView g;

    @NonNull
    public final SwitchMaterial h;

    @NonNull
    public final MotionLayout i;

    @NonNull
    public final TextView j;

    @NonNull
    public final RecyclerView k;

    public C2417Xj(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull SwitchMaterial switchMaterial, @NonNull MotionLayout motionLayout, @NonNull TextView textView2, @NonNull RecyclerView recyclerView) {
        this.d = frameLayout;
        this.e = imageView;
        this.g = textView;
        this.h = switchMaterial;
        this.i = motionLayout;
        this.j = textView2;
        this.k = recyclerView;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

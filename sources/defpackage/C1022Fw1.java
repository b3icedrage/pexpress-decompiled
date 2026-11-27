package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: Fw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1022Fw1 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final C7568xD0 e;

    @NonNull
    public final C7568xD0 g;

    @NonNull
    public final TextView h;

    @NonNull
    public final ImageView i;

    @NonNull
    public final TextView j;

    public C1022Fw1(@NonNull ConstraintLayout constraintLayout, @NonNull C7568xD0 c7568xD0, @NonNull C7568xD0 c7568xD1, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2) {
        this.d = constraintLayout;
        this.e = c7568xD0;
        this.g = c7568xD1;
        this.h = textView;
        this.i = imageView;
        this.j = textView2;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

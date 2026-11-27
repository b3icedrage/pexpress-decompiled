package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;

/* JADX INFO: renamed from: uD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6937uD0 implements InterfaceC7441wd2 {

    @NonNull
    public final LinearLayout d;

    @NonNull
    public final TextView e;

    @NonNull
    public final LinearLayout g;

    @NonNull
    public final TextView h;

    @NonNull
    public final AppCompatImageView i;

    @NonNull
    public final TextView j;

    public C6937uD0(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout2, @NonNull TextView textView2, @NonNull AppCompatImageView appCompatImageView, @NonNull TextView textView3) {
        this.d = linearLayout;
        this.e = textView;
        this.g = linearLayout2;
        this.h = textView2;
        this.i = appCompatImageView;
        this.j = textView3;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

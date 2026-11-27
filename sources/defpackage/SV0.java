package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes.dex */
public final class SV0 implements InterfaceC7441wd2 {

    @NonNull
    public final MaterialCardView d;

    @NonNull
    public final TextView e;

    @NonNull
    public final TextView g;

    @NonNull
    public final TextView h;

    @NonNull
    public final ImageView i;

    @NonNull
    public final ProgressBar j;

    public SV0(@NonNull MaterialCardView materialCardView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ImageView imageView, @NonNull ProgressBar progressBar) {
        this.d = materialCardView;
        this.e = textView;
        this.g = textView2;
        this.h = textView3;
        this.i = imageView;
        this.j = progressBar;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

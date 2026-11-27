package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;

/* JADX INFO: renamed from: hy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4311hy0 implements InterfaceC7441wd2 {

    @NonNull
    public final CardView d;

    @NonNull
    public final ImageView e;

    @NonNull
    public final LinearLayout g;

    @NonNull
    public final TextView h;

    public C4311hy0(@NonNull CardView cardView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull TextView textView) {
        this.d = cardView;
        this.e = imageView;
        this.g = linearLayout;
        this.h = textView;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

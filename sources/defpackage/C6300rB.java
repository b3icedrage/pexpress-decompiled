package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;

/* JADX INFO: renamed from: rB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6300rB implements InterfaceC7441wd2 {

    @NonNull
    public final CardView d;

    @NonNull
    public final ImageView e;

    @NonNull
    public final TextView g;

    public C6300rB(@NonNull CardView cardView, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.d = cardView;
        this.e = imageView;
        this.g = textView;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: tD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6727tD0 implements InterfaceC7441wd2 {

    @NonNull
    public final LinearLayout d;

    @NonNull
    public final ImageView e;

    @NonNull
    public final TextView g;

    public C6727tD0(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.d = linearLayout;
        this.e = imageView;
        this.g = textView;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

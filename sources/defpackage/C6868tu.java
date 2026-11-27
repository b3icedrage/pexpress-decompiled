package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: tu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6868tu implements InterfaceC7441wd2 {

    @NonNull
    public final LinearLayout d;

    @NonNull
    public final ImageView e;

    @NonNull
    public final ImageView g;

    @NonNull
    public final RecyclerView h;

    @NonNull
    public final TextView i;

    public C6868tu(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.d = linearLayout;
        this.e = imageView;
        this.g = imageView2;
        this.h = recyclerView;
        this.i = textView;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

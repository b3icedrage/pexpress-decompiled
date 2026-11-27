package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: renamed from: jy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4779jy0 implements InterfaceC7441wd2 {

    @NonNull
    public final LinearLayout d;

    @NonNull
    public final ImageView e;

    @NonNull
    public final TextView g;

    @NonNull
    public final MaterialButton h;

    @NonNull
    public final MaterialButton i;

    @NonNull
    public final RecyclerView j;

    public C4779jy0(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull MaterialButton materialButton, @NonNull MaterialButton materialButton2, @NonNull RecyclerView recyclerView) {
        this.d = linearLayout;
        this.e = imageView;
        this.g = textView;
        this.h = materialButton;
        this.i = materialButton2;
        this.j = recyclerView;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

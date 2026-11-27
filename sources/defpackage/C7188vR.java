package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: vR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7188vR implements InterfaceC7441wd2 {

    @NonNull
    public final LinearLayout d;

    public C7188vR(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2) {
        this.d = linearLayout;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

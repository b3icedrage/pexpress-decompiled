package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.radiobutton.MaterialRadioButton;

/* JADX INFO: renamed from: zD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7988zD0 implements InterfaceC7441wd2 {

    @NonNull
    public final LinearLayout d;

    @NonNull
    public final LinearLayout e;

    @NonNull
    public final ImageView g;

    @NonNull
    public final MaterialRadioButton h;

    @NonNull
    public final TextView i;

    @NonNull
    public final TextView j;

    public C7988zD0(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull MaterialRadioButton materialRadioButton, @NonNull TextView textView, @NonNull TextView textView2) {
        this.d = linearLayout;
        this.e = linearLayout2;
        this.g = imageView;
        this.h = materialRadioButton;
        this.i = textView;
        this.j = textView2;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

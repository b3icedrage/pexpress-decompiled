package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: renamed from: Jw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1334Jw1 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final TextView e;

    @NonNull
    public final MaterialCardView g;

    @NonNull
    public final EditText h;

    @NonNull
    public final TextView i;

    @NonNull
    public final MaterialCardView j;

    @NonNull
    public final ImageView k;

    @NonNull
    public final View l;

    public C1334Jw1(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull MaterialCardView materialCardView, @NonNull EditText editText, @NonNull TextView textView2, @NonNull MaterialCardView materialCardView2, @NonNull ImageView imageView, @NonNull View view) {
        this.d = constraintLayout;
        this.e = textView;
        this.g = materialCardView;
        this.h = editText;
        this.i = textView2;
        this.j = materialCardView2;
        this.k = imageView;
        this.l = view;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

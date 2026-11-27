package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: mi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5360mi1 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final TextView e;

    @NonNull
    public final EditText g;

    @NonNull
    public final ImageView h;

    public C5360mi1(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull EditText editText, @NonNull ImageView imageView) {
        this.d = constraintLayout;
        this.e = textView;
        this.g = editText;
        this.h = imageView;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

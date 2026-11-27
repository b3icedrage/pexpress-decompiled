package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes.dex */
public final class IQ1 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final MaterialButton e;

    @NonNull
    public final MaterialButton g;

    @NonNull
    public final C3452ds h;

    @NonNull
    public final ImageView i;

    @NonNull
    public final AppCompatTextView j;

    public IQ1(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialButton materialButton, @NonNull MaterialButton materialButton2, @NonNull C3452ds c3452ds, @NonNull ImageView imageView, @NonNull AppCompatTextView appCompatTextView) {
        this.d = constraintLayout;
        this.e = materialButton;
        this.g = materialButton2;
        this.h = c3452ds;
        this.i = imageView;
        this.j = appCompatTextView;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

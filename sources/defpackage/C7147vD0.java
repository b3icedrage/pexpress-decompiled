package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: vD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7147vD0 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final AppCompatImageView e;

    @NonNull
    public final TextView g;

    @NonNull
    public final ConstraintLayout h;

    public C7147vD0(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2) {
        this.d = constraintLayout;
        this.e = appCompatImageView;
        this.g = textView;
        this.h = constraintLayout2;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

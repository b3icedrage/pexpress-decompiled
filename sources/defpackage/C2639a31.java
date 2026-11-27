package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: a31, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2639a31 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final C6300rB e;

    @NonNull
    public final TextView g;

    public C2639a31(@NonNull ConstraintLayout constraintLayout, @NonNull C6300rB c6300rB, @NonNull TextView textView) {
        this.d = constraintLayout;
        this.e = c6300rB;
        this.g = textView;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: hi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4259hi1 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final TextView e;

    public C4259hi1(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView) {
        this.d = constraintLayout;
        this.e = textView;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

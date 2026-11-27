package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: Wx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2356Wx0 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    public C2356Wx0(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView) {
        this.d = constraintLayout;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

package defpackage;

import android.view.View;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: to0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6851to0 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final ProgressBar e;

    public C6851to0(@NonNull ConstraintLayout constraintLayout, @NonNull ProgressBar progressBar) {
        this.d = constraintLayout;
        this.e = progressBar;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

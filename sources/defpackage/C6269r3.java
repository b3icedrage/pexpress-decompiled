package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6269r3 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final L2 e;

    public C6269r3(@NonNull ConstraintLayout constraintLayout, @NonNull L2 l2) {
        this.d = constraintLayout;
        this.e = l2;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

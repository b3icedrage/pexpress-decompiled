package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: Iw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1256Iw1 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final C3702f32 e;

    public C1256Iw1(@NonNull ConstraintLayout constraintLayout, @NonNull C3702f32 c3702f32) {
        this.d = constraintLayout;
        this.e = c3702f32;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

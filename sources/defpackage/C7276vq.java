package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: vq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7276vq implements InterfaceC7441wd2 {

    @NonNull
    public final FrameLayout d;

    @NonNull
    public final FrameLayout e;

    public C7276vq(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.d = frameLayout;
        this.e = frameLayout2;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

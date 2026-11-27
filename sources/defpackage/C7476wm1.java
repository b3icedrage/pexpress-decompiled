package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: renamed from: wm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7476wm1 implements InterfaceC7441wd2 {

    @NonNull
    public final MaterialButton d;

    @NonNull
    public final MaterialButton e;

    public C7476wm1(@NonNull MaterialButton materialButton, @NonNull MaterialButton materialButton2) {
        this.d = materialButton;
        this.e = materialButton2;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

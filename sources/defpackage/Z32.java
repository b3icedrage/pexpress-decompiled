package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes.dex */
public final class Z32 implements InterfaceC7441wd2 {

    @NonNull
    public final LinearLayout d;

    @NonNull
    public final MaterialButton e;

    @NonNull
    public final MaterialButton g;

    @NonNull
    public final IR1 h;

    public Z32(@NonNull LinearLayout linearLayout, @NonNull MaterialButton materialButton, @NonNull MaterialButton materialButton2, @NonNull IR1 ir1) {
        this.d = linearLayout;
        this.e = materialButton;
        this.g = materialButton2;
        this.h = ir1;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

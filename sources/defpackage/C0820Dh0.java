package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.api.resources.CenteredToolbar;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: Dh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0820Dh0 implements InterfaceC7441wd2 {

    @NonNull
    public final FrameLayout d;

    @NonNull
    public final FA0 e;

    @NonNull
    public final TextInputLayout g;

    @NonNull
    public final TextInputEditText h;

    @NonNull
    public final MaterialButton i;

    @NonNull
    public final CenteredToolbar j;

    @NonNull
    public final SpinKitView k;

    public C0820Dh0(@NonNull FrameLayout frameLayout, @NonNull FA0 fa0, @NonNull TextInputLayout textInputLayout, @NonNull TextInputEditText textInputEditText, @NonNull MaterialButton materialButton, @NonNull CenteredToolbar centeredToolbar, @NonNull SpinKitView spinKitView) {
        this.d = frameLayout;
        this.e = fa0;
        this.g = textInputLayout;
        this.h = textInputEditText;
        this.i = materialButton;
        this.j = centeredToolbar;
        this.k = spinKitView;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes.dex */
public final class G5 implements InterfaceC7441wd2 {

    @NonNull
    public final MaterialButton d;

    public G5(@NonNull MaterialButton materialButton) {
        this.d = materialButton;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

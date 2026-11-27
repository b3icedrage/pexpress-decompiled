package defpackage;

import android.view.View;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import com.api.resources.CheckableImageView;

/* JADX INFO: renamed from: Qx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1884Qx0 implements InterfaceC7441wd2 {

    @NonNull
    public final C1806Px0 d;

    @NonNull
    public final CheckableImageView e;

    @NonNull
    public final CheckedTextView g;

    public C1884Qx0(@NonNull C1806Px0 c1806Px0, @NonNull CheckableImageView checkableImageView, @NonNull CheckedTextView checkedTextView) {
        this.d = c1806Px0;
        this.e = checkableImageView;
        this.g = checkedTextView;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: renamed from: gB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3941gB0 implements InterfaceC7441wd2 {

    @NonNull
    public final MaterialCardView d;

    @NonNull
    public final TextView e;

    @NonNull
    public final TextView g;

    public C3941gB0(@NonNull MaterialCardView materialCardView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.d = materialCardView;
        this.e = textView;
        this.g = textView2;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

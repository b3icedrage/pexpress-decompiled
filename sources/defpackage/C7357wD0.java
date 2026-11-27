package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: renamed from: wD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7357wD0 implements InterfaceC7441wd2 {

    @NonNull
    public final MaterialCardView d;

    @NonNull
    public final TextView e;

    @NonNull
    public final AppCompatImageView g;

    public C7357wD0(@NonNull MaterialCardView materialCardView, @NonNull TextView textView, @NonNull AppCompatImageView appCompatImageView) {
        this.d = materialCardView;
        this.e = textView;
        this.g = appCompatImageView;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.base.feature.alertdialog.screen.StarViewGroup;

/* JADX INFO: renamed from: qm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6216qm1 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final Button e;

    @NonNull
    public final ImageView g;

    @NonNull
    public final StarViewGroup h;

    public C6216qm1(@NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull ImageView imageView, @NonNull StarViewGroup starViewGroup) {
        this.d = constraintLayout;
        this.e = button;
        this.g = imageView;
        this.h = starViewGroup;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.api.resources.CenteredToolbar;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: renamed from: ai0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2776ai0 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final RecyclerView e;

    @NonNull
    public final CenteredToolbar g;

    @NonNull
    public final MaterialButton h;

    public C2776ai0(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull CenteredToolbar centeredToolbar, @NonNull MaterialButton materialButton) {
        this.d = constraintLayout;
        this.e = recyclerView;
        this.g = centeredToolbar;
        this.h = materialButton;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

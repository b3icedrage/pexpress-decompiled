package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.base.feature.stub.usecases.StubGameLineChart;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: renamed from: eT1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3576eT1 implements InterfaceC7441wd2 {

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final TextView e;

    @NonNull
    public final MaterialButton g;

    @NonNull
    public final MaterialButton h;

    @NonNull
    public final StubGameLineChart i;

    @NonNull
    public final FrameLayout j;

    public C3576eT1(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull MaterialButton materialButton, @NonNull MaterialButton materialButton2, @NonNull StubGameLineChart stubGameLineChart, @NonNull FrameLayout frameLayout) {
        this.d = constraintLayout;
        this.e = textView;
        this.g = materialButton;
        this.h = materialButton2;
        this.i = stubGameLineChart;
        this.j = frameLayout;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}

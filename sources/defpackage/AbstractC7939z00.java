package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: renamed from: z00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7939z00 extends ViewDataBinding {
    public static final /* synthetic */ int C = 0;
    public OD A;
    public QD B;

    @NonNull
    public final AppCompatImageView y;

    @NonNull
    public final ConstraintLayout z;

    public AbstractC7939z00(InterfaceC5089lS interfaceC5089lS, View view, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout) {
        super(interfaceC5089lS, view, 3);
        this.y = appCompatImageView;
        this.z = constraintLayout;
    }

    public abstract void A(OD od);

    public abstract void B(QD qd);
}

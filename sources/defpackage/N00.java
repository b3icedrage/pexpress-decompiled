package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes3.dex */
public abstract class N00 extends ViewDataBinding {
    public static final /* synthetic */ int A = 0;

    @NonNull
    public final ConstraintLayout y;
    public Ha2 z;

    public N00(InterfaceC5089lS interfaceC5089lS, View view, ConstraintLayout constraintLayout) {
        super(interfaceC5089lS, view, 1);
        this.y = constraintLayout;
    }

    public abstract void A(Ha2 ha2);
}

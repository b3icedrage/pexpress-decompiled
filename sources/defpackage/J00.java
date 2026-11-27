package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.jivosite.sdk.ui.views.ExpandableTextView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class J00 extends ViewDataBinding {
    public static final /* synthetic */ int B = 0;
    public H92 A;

    @NonNull
    public final ExpandableTextView y;

    @NonNull
    public final ConstraintLayout z;

    public J00(InterfaceC5089lS interfaceC5089lS, View view, ExpandableTextView expandableTextView, ConstraintLayout constraintLayout) {
        super(interfaceC5089lS, view, 1);
        this.y = expandableTextView;
        this.z = constraintLayout;
    }

    public abstract void A(H92 h92);
}

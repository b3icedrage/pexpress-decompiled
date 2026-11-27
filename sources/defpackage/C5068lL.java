package defpackage;

import android.view.View;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: lL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5068lL extends H7<RA> {

    @NotNull
    public final C6960uL u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5068lL(@NotNull View itemView, @NotNull FP0 lifecycleOwner, @NotNull C6960uL viewModel) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.u = viewModel;
        int i = D00.E;
        DataBinderMapperImpl dataBinderMapperImpl = C5302mS.a;
        D00 d00 = (D00) ViewDataBinding.n(null, itemView, R.layout.dg_item_contact_form);
        d00.A(viewModel);
        d00.x(lifecycleOwner);
        viewModel.m.e(lifecycleOwner, new C4648jL(0, d00, this));
        viewModel.o.e(lifecycleOwner, new C4858kL(0, d00, this));
    }

    @Override // defpackage.H7
    public final void q(@NotNull F7<RA> item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.q(item);
        RA raA = item.a();
        if (raA instanceof C3970gL) {
            this.u.j(raA);
        }
    }
}

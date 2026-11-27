package defpackage;

import android.view.View;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Ga2 extends EZ0<C8059za2> {

    @NotNull
    public final Ha2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ga2(@NotNull View itemView, @NotNull FP0 lifecycleOwner, @NotNull Ha2 viewModel) {
        super(itemView, viewModel);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.v = viewModel;
        int i = N00.A;
        DataBinderMapperImpl dataBinderMapperImpl = C5302mS.a;
        N00 n00 = (N00) ViewDataBinding.n(null, itemView, R.layout.dg_item_uploading_image);
        n00.getClass();
        n00.A(viewModel);
        n00.x(lifecycleOwner);
    }

    @Override // defpackage.H7
    public final void q(@NotNull F7<RA> item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.q(item);
        RA raA = item.a();
        if (raA instanceof C8059za2) {
            this.v.j(raA);
        }
    }
}

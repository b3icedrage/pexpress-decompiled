package defpackage;

import android.view.View;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class G92 extends H7<RA> {

    @NotNull
    public final H92 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G92(@NotNull View itemView, @NotNull FP0 lifecycleOwner, @NotNull H92 viewModel) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.u = viewModel;
        int i = J00.B;
        DataBinderMapperImpl dataBinderMapperImpl = C5302mS.a;
        J00 j00 = (J00) ViewDataBinding.n(null, itemView, R.layout.dg_item_unsupported);
        j00.A(viewModel);
        j00.x(lifecycleOwner);
    }

    @Override // defpackage.H7
    public final void q(@NotNull F7<RA> item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.q(item);
        RA raA = item.a();
        if (raA instanceof D92) {
            this.u.d.k((D92) raA);
        }
    }
}

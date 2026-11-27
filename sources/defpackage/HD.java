package defpackage;

import android.view.View;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class HD extends C4898kY0<TD> {

    @NotNull
    public final KD w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HD(@NotNull View itemView, @NotNull FP0 lifecycleOwner, @NotNull KD viewModel) {
        super(itemView, viewModel);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.w = viewModel;
        int i = AbstractC7519x00.F;
        DataBinderMapperImpl dataBinderMapperImpl = C5302mS.a;
        AbstractC7519x00 abstractC7519x00 = (AbstractC7519x00) ViewDataBinding.n(null, itemView, R.layout.dg_item_client_file);
        abstractC7519x00.A(this);
        abstractC7519x00.B(viewModel);
        abstractC7519x00.x(lifecycleOwner);
    }

    @Override // defpackage.H7
    public final void q(@NotNull F7<RA> item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.q(item);
        RA raA = item.a();
        if (raA instanceof TD) {
            this.w.j(raA);
        }
    }
}

package defpackage;

import android.view.View;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class C8 extends C4898kY0<L8> {

    @NotNull
    public final E8 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8(@NotNull View itemView, @NotNull FP0 lifecycleOwner, @NotNull E8 viewModel) {
        super(itemView, viewModel);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.w = viewModel;
        int i = AbstractC6258r00.H;
        DataBinderMapperImpl dataBinderMapperImpl = C5302mS.a;
        AbstractC6258r00 abstractC6258r00 = (AbstractC6258r00) ViewDataBinding.n(null, itemView, R.layout.dg_item_agent_file);
        abstractC6258r00.A(this);
        abstractC6258r00.B(viewModel);
        abstractC6258r00.x(lifecycleOwner);
    }

    @Override // defpackage.H7
    public final void q(@NotNull F7<RA> item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.q(item);
        RA raA = item.a();
        if (raA instanceof L8) {
            this.w.j(raA);
        }
    }
}

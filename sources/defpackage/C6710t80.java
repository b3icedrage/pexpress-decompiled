package defpackage;

import android.view.View;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.ViewDataBinding;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: t80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6710t80 extends H7<RA> {

    @NotNull
    public final C6920u80 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6710t80(@NotNull View itemView, @NotNull FP0 lifecycleOwner, @NotNull C6920u80 viewModel) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.u = viewModel;
        int i = F00.A;
        DataBinderMapperImpl dataBinderMapperImpl = C5302mS.a;
        F00 f00 = (F00) ViewDataBinding.n(null, itemView, R.layout.dg_item_event);
        f00.A(viewModel);
        f00.x(lifecycleOwner);
    }

    @Override // defpackage.H7
    public final void q(@NotNull F7<RA> item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.q(item);
        RA raA = item.a();
        if (raA instanceof C5241m80) {
            this.u.d.k((C5241m80) raA);
        }
    }
}

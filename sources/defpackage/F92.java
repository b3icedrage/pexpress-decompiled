package defpackage;

import android.view.View;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class F92 extends D7<RA> {

    @NotNull
    public final FP0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F92(@NotNull FP0 lifecycleOwner) {
        super(16, R.layout.dg_item_unsupported);
        I92 viewModelProvider = I92.a.a;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        this.c = lifecycleOwner;
    }

    @Override // defpackage.D7
    @NotNull
    public final H7<RA> a(@NotNull View itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        H92 h92 = new H92();
        Intrinsics.checkNotNullExpressionValue(h92, "viewModelProvider.get()");
        return new G92(itemView, this.c, h92);
    }
}

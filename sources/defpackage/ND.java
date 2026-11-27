package defpackage;

import android.view.View;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ND extends D7<RA> {

    @NotNull
    public final FP0 c;

    @NotNull
    public final RD d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ND(@NotNull FP0 lifecycleOwner, @NotNull RD viewModelProvider) {
        super(7, R.layout.dg_item_client_image);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        this.c = lifecycleOwner;
        this.d = viewModelProvider;
    }

    @Override // defpackage.D7
    @NotNull
    public final H7<RA> a(@NotNull View itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Object obj = this.d.get();
        Intrinsics.checkNotNullExpressionValue(obj, "viewModelProvider.get()");
        return new OD(itemView, this.c, (QD) obj);
    }
}

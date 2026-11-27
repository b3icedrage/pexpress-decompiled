package defpackage;

import android.view.View;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class H8 extends D7<RA> {

    @NotNull
    public final FP0 c;

    @NotNull
    public final K8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H8(@NotNull FP0 lifecycleOwner, @NotNull K8 viewModelProvider) {
        super(9, R.layout.dg_item_agent_image);
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
        return new I8(itemView, this.c, (J8) obj);
    }
}

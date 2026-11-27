package defpackage;

import android.view.View;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class B8 extends D7<RA> {

    @NotNull
    public final FP0 c;

    @NotNull
    public final F8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B8(@NotNull FP0 lifecycleOwner, @NotNull F8 viewModelProvider) {
        super(12, R.layout.dg_item_agent_file);
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
        return new C8(itemView, this.c, (E8) obj);
    }
}

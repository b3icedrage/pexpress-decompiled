package defpackage;

import android.view.View;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Fa2 extends D7<RA> {

    @NotNull
    public final FP0 c;

    @NotNull
    public final C5664o9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fa2(@NotNull FP0 lifecycleOwner, @NotNull C5664o9 viewModelProvider) {
        super(10, R.layout.dg_item_uploading_image);
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
        return new Ga2(itemView, this.c, (Ha2) obj);
    }
}

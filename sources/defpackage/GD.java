package defpackage;

import android.view.View;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class GD extends D7<RA> {

    @NotNull
    public final FP0 c;

    @NotNull
    public final C0687Bp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GD(@NotNull FP0 lifecycleOwner, @NotNull C0687Bp viewModelProvider) {
        super(13, R.layout.dg_item_client_file);
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
        return new HD(itemView, this.c, (KD) obj);
    }
}

package defpackage;

import android.view.View;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: s80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6500s80 extends D7<RA> {

    @NotNull
    public final FP0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6500s80(@NotNull FP0 lifecycleOwner) {
        super(5, R.layout.dg_item_event);
        C7130v80 viewModelProvider = C7130v80.a.a;
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        this.c = lifecycleOwner;
    }

    @Override // defpackage.D7
    @NotNull
    public final H7<RA> a(@NotNull View itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        C6920u80 c6920u80 = new C6920u80();
        Intrinsics.checkNotNullExpressionValue(c6920u80, "viewModelProvider.get()");
        return new C6710t80(itemView, this.c, c6920u80);
    }
}

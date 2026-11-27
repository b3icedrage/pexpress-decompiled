package defpackage;

import android.view.View;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Bm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0680Bm1 extends D7<RA> {

    @NotNull
    public final FP0 c;

    @NotNull
    public final C1550Mr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0680Bm1(@NotNull FP0 lifecycleOwner, @NotNull C1550Mr itemViewModelProvider) {
        super(17, R.layout.dg_item_rating);
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(itemViewModelProvider, "itemViewModelProvider");
        this.c = lifecycleOwner;
        this.d = itemViewModelProvider;
    }

    @Override // defpackage.D7
    @NotNull
    public final H7<RA> a(@NotNull View itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Object obj = this.d.get();
        Intrinsics.checkNotNullExpressionValue(obj, "itemViewModelProvider.get()");
        return new C0758Cm1(itemView, this.c, (C6845tm1) obj);
    }
}

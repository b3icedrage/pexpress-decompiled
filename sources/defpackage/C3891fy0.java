package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.card.MaterialCardView;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fy0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3891fy0 implements InterfaceC3681ey0<C3702f32> {

    @Nullable
    public C3702f32 d;

    @Override // defpackage.InterfaceC6856tq
    public final void E() {
        this.d = null;
    }

    @Override // defpackage.InterfaceC6856tq
    @NotNull
    public final View V(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        C3702f32 c3702f32B = C3702f32.b(inflater.inflate(R.layout.trading_indicator_inner_info, viewGroup, false));
        this.d = c3702f32B;
        Intrinsics.checkNotNull(c3702f32B);
        MaterialCardView materialCardView = c3702f32B.d;
        Intrinsics.checkNotNullExpressionValue(materialCardView, "getRoot(...)");
        return materialCardView;
    }

    @Override // defpackage.InterfaceC3681ey0
    public final C3702f32 W() {
        C3702f32 c3702f32 = this.d;
        Intrinsics.checkNotNull(c3702f32);
        return c3702f32;
    }
}

package defpackage;

import android.content.Context;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Ay1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0638Ay1 implements InterfaceC8143zy1 {

    @NotNull
    public final Context a;

    public C0638Ay1(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    @Override // defpackage.InterfaceC8143zy1
    @NotNull
    public final String a() {
        String string = this.a.getString(R.string.unavailable_trading_description);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // defpackage.InterfaceC8143zy1
    @NotNull
    public final String b() {
        String string = this.a.getString(R.string.unavailable_trading_tittle);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // defpackage.InterfaceC8143zy1
    public final int c(boolean z) {
        return z ? R.color.surface : R.color.background;
    }
}

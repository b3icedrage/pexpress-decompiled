package defpackage;

import android.content.Context;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4329i3 implements InterfaceC4119h3 {

    @NotNull
    public final Context a;

    public C4329i3(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    @Override // defpackage.InterfaceC4119h3
    @NotNull
    public final String a() {
        String string = this.a.getString(R.string.main_robot_real_account_text);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // defpackage.InterfaceC4119h3
    @NotNull
    public final String b() {
        String string = this.a.getString(R.string.main_robot_demo_account_text);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}

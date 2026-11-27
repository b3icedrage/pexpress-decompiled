package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.pexpress.tool.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: qf2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6189qf2 implements InterfaceC5979pf2 {

    @NotNull
    public final Context a;

    public C6189qf2(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context;
    }

    @Override // defpackage.InterfaceC5979pf2
    @NotNull
    public final List<String> a() {
        Resources resources = this.a.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        Intrinsics.checkNotNullParameter(resources, "<this>");
        String[] stringArray = resources.getStringArray(R.array.vpn_instruction_steps_highlight);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        return C1526Mj.F(stringArray);
    }

    @Override // defpackage.InterfaceC5979pf2
    @NotNull
    public final List<String> b() {
        Resources resources = this.a.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        Intrinsics.checkNotNullParameter(resources, "<this>");
        String[] stringArray = resources.getStringArray(R.array.vpn_instruction_steps);
        Intrinsics.checkNotNullExpressionValue(stringArray, "getStringArray(...)");
        return C1526Mj.F(stringArray);
    }
}

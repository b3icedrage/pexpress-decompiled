package defpackage;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class K31 extends JK<C3705f41> {
    static {
        Intrinsics.checkNotNullExpressionValue(AS0.d("NetworkMeteredCtrlr"), "tagWithPrefix(\"NetworkMeteredCtrlr\")");
    }

    @Override // defpackage.JK
    public final boolean b(@NotNull Bk2 workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.j.a == EnumC4593j41.i;
    }

    @Override // defpackage.JK
    public final boolean c(C3705f41 c3705f41) {
        C3705f41 value = c3705f41;
        Intrinsics.checkNotNullParameter(value, "value");
        if (Build.VERSION.SDK_INT >= 26) {
            return (value.a && value.c) ? false : true;
        }
        AS0.c().getClass();
        return !value.a;
    }
}

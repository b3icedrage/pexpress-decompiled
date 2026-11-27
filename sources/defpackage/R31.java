package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class R31 extends JK<C3705f41> {
    static {
        Intrinsics.checkNotNullExpressionValue(AS0.d("NetworkNotRoamingCtrlr"), "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
    }

    @Override // defpackage.JK
    public final boolean b(@NotNull Bk2 workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        return workSpec.j.a == EnumC4593j41.h;
    }

    @Override // defpackage.JK
    public final boolean c(C3705f41 c3705f41) {
        C3705f41 value = c3705f41;
        Intrinsics.checkNotNullParameter(value, "value");
        return (value.a && value.d) ? false : true;
    }
}

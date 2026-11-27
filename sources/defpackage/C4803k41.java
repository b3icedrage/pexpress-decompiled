package defpackage;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: k41, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4803k41 extends JK<C3705f41> {
    @Override // defpackage.JK
    public final boolean b(@NotNull Bk2 workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        EnumC4593j41 enumC4593j41 = workSpec.j.a;
        if (enumC4593j41 != EnumC4593j41.g) {
            return Build.VERSION.SDK_INT >= 30 && enumC4593j41 == EnumC4593j41.j;
        }
        return true;
    }

    @Override // defpackage.JK
    public final boolean c(C3705f41 c3705f41) {
        C3705f41 value = c3705f41;
        Intrinsics.checkNotNullParameter(value, "value");
        return !value.a || value.c;
    }
}

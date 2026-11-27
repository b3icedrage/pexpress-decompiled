package androidx.lifecycle;

import defpackage.FP0;
import defpackage.JM;
import defpackage.KN;
import defpackage.LN;
import defpackage.MN;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class RepeatOnLifecycleKt {
    @Nullable
    public static final Object a(@NotNull FP0 fp0, @NotNull g.b bVar, @NotNull Function2<? super KN, ? super JM<? super Unit>, ? extends Object> function2, @NotNull JM<? super Unit> jm) {
        Object objB = b(fp0.getLifecycle(), bVar, function2, jm);
        return objB == MN.d ? objB : Unit.a;
    }

    @Nullable
    public static final Object b(@NotNull g gVar, @NotNull g.b bVar, @NotNull Function2<? super KN, ? super JM<? super Unit>, ? extends Object> function2, @NotNull JM<? super Unit> jm) {
        if (bVar == g.b.e) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        if (gVar.b() == g.b.d) {
            return Unit.a;
        }
        Object objD = LN.d(new RepeatOnLifecycleKt$repeatOnLifecycle$3(gVar, bVar, function2, null), jm);
        return objD == MN.d ? objD : Unit.a;
    }
}

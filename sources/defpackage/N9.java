package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class N9 {
    @NotNull
    public static final M9 a(@NotNull Function1<? super M9.a, Unit> receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        M9.a aVar = new M9.a();
        receiver.invoke(aVar);
        M9 m9 = new M9();
        aVar.c(m9);
        return m9;
    }
}

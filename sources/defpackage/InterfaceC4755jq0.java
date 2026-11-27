package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: jq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC4755jq0<TConfig, TPlugin> {
    void a(@NotNull TPlugin tplugin, @NotNull C1782Pp0 c1782Pp0);

    @NotNull
    TPlugin b(@NotNull Function1<? super TConfig, Unit> function1);

    @NotNull
    C2498Yk<TPlugin> getKey();
}

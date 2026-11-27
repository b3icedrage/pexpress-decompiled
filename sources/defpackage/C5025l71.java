package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: l71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5025l71<T> implements InterfaceC4605j71<T> {

    @NotNull
    public final Object b;

    @NotNull
    public final C2720aS0.j c;

    public C5025l71(@NotNull Map<C1758Ph0, ? extends T> states) {
        Intrinsics.checkNotNullParameter(states, "states");
        this.b = states;
        C2720aS0.j jVarF = new C2720aS0("Java nullability annotation states").f(new C4815k71(this, 0));
        Intrinsics.checkNotNullExpressionValue(jVarF, "createMemoizedFunctionWithNullableValues(...)");
        this.c = jVarF;
    }
}

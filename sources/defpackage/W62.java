package defpackage;

import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class W62 implements Function1<C1758Ph0, Boolean> {
    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(@NotNull C1758Ph0 c1758Ph0) {
        C1758Ph0 c1758Ph1 = c1758Ph0;
        if (c1758Ph1 != null) {
            return Boolean.valueOf(!c1758Ph1.equals(C4194hP1.a.y));
        }
        throw new IllegalArgumentException("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class AK<Receiver> extends AbstractC6497s71<Receiver> {

    @NotNull
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AK(@NotNull String expected) {
        super(Integer.valueOf(expected.length()), "the predefined string ".concat(expected));
        Intrinsics.checkNotNullParameter(expected, "expected");
        this.c = expected;
    }

    @Override // defpackage.AbstractC6497s71
    @Nullable
    public final InterfaceC6707t71 a(InterfaceC2928bN interfaceC2928bN, @NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        String str = this.c;
        if (Intrinsics.a(input, str)) {
            return null;
        }
        return new InterfaceC6707t71.e(str);
    }
}

package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Sh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1992Sh0<Receiver> extends AbstractC6497s71<Receiver> {

    @Nullable
    public final Integer c;

    @Nullable
    public final Integer d;

    @NotNull
    public final InterfaceC6475s2 e;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1992Sh0(@Nullable Integer num, @Nullable Integer num2, @NotNull InterfaceC6475s2 setter, @NotNull String name) {
        Intrinsics.checkNotNullParameter(setter, "setter");
        Intrinsics.checkNotNullParameter(name, "name");
        Integer num3 = num.equals(num2) ? num : null;
        super(num3, name);
        this.c = num;
        this.d = num2;
        this.e = setter;
        if (new IntRange(1, 9, 1).e(num.intValue())) {
            return;
        }
        throw new IllegalArgumentException(("Invalid length for field " + name + ": " + num3).toString());
    }

    @Override // defpackage.AbstractC6497s71
    @Nullable
    public final InterfaceC6707t71 a(InterfaceC2928bN interfaceC2928bN, @NotNull String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Integer num = this.c;
        if (num != null && input.length() < num.intValue()) {
            return new InterfaceC6707t71.c(num.intValue());
        }
        Integer num2 = this.d;
        if (num2 != null && input.length() > num2.intValue()) {
            return new InterfaceC6707t71.d(num2.intValue());
        }
        Integer intOrNull = StringsKt.toIntOrNull(input);
        if (intOrNull == null) {
            return new InterfaceC6707t71.d(9);
        }
        Field fieldC = this.e.c(interfaceC2928bN, new C3997gU(intOrNull.intValue(), input.length()));
        if (fieldC == 0) {
            return null;
        }
        return new InterfaceC6707t71.a(fieldC);
    }
}

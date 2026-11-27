package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Gj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1059Gj extends CK<List<? extends CK<?>>> {

    @NotNull
    public final Function1<S01, AbstractC4649jL0> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1059Gj(@NotNull List<? extends CK<?>> value, @NotNull Function1<? super S01, ? extends AbstractC4649jL0> computeType) {
        super(value);
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(computeType, "computeType");
        this.b = computeType;
    }

    @Override // defpackage.CK
    @NotNull
    public final AbstractC4649jL0 a(@NotNull S01 module) {
        Intrinsics.checkNotNullParameter(module, "module");
        AbstractC4649jL0 abstractC4649jL0Invoke = this.b.invoke(module);
        if (!RK0.y(abstractC4649jL0Invoke) && !RK0.F(abstractC4649jL0Invoke) && !RK0.B(abstractC4649jL0Invoke, C4194hP1.a.W.i()) && !RK0.B(abstractC4649jL0Invoke, C4194hP1.a.X.i()) && !RK0.B(abstractC4649jL0Invoke, C4194hP1.a.Y.i())) {
            RK0.B(abstractC4649jL0Invoke, C4194hP1.a.Z.i());
        }
        return abstractC4649jL0Invoke;
    }
}

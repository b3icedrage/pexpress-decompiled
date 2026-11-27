package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Uz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2201Uz<T> extends AbstractC2123Tz<T> {

    @NotNull
    public final AW1 h;

    /* JADX WARN: Multi-variable type inference failed */
    public C2201Uz(@NotNull Function2<? super InterfaceC1133Hh1<? super T>, ? super JM<? super Unit>, ? extends Object> function2, @NotNull CoroutineContext coroutineContext, int i, @NotNull EnumC1796Pu enumC1796Pu) {
        super(coroutineContext, i, enumC1796Pu);
        this.h = (AW1) function2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC2123Tz
    @Nullable
    public Object j(@NotNull InterfaceC1133Hh1<? super T> interfaceC1133Hh1, @NotNull JM<? super Unit> jm) {
        Object objInvoke = this.h.invoke(interfaceC1133Hh1, jm);
        return objInvoke == MN.d ? objInvoke : Unit.a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.AbstractC2123Tz
    @NotNull
    public AbstractC2123Tz<T> k(@NotNull CoroutineContext coroutineContext, int i, @NotNull EnumC1796Pu enumC1796Pu) {
        return new C2201Uz(this.h, coroutineContext, i, enumC1796Pu);
    }

    @Override // defpackage.AbstractC2123Tz
    @NotNull
    public final String toString() {
        return "block[" + this.h + "] -> " + super.toString();
    }
}

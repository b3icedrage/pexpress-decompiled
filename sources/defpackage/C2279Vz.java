package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Vz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", l = {148}, m = "invokeSuspend")
public final class C2279Vz extends AW1 implements Function2<InterfaceC6606sf0<Object>, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ AbstractC2361Wz<Object, Object> g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2279Vz(AbstractC2361Wz<Object, Object> abstractC2361Wz, JM<? super C2279Vz> jm) {
        super(2, jm);
        this.g = abstractC2361Wz;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        C2279Vz c2279Vz = new C2279Vz(this.g, jm);
        c2279Vz.e = obj;
        return c2279Vz;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC6606sf0<Object> interfaceC6606sf0, JM<? super Unit> jm) {
        return ((C2279Vz) create(interfaceC6606sf0, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            InterfaceC6606sf0<? super Object> interfaceC6606sf0 = (InterfaceC6606sf0) this.e;
            this.d = 1;
            if (this.g.n(interfaceC6606sf0, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Unit.a;
    }
}

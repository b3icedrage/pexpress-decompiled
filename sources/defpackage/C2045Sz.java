package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Sz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {56}, m = "invokeSuspend")
public final class C2045Sz extends AW1 implements Function2<InterfaceC1133Hh1<Object>, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ AbstractC2123Tz<Object> g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2045Sz(AbstractC2123Tz<Object> abstractC2123Tz, JM<? super C2045Sz> jm) {
        super(2, jm);
        this.g = abstractC2123Tz;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        C2045Sz c2045Sz = new C2045Sz(this.g, jm);
        c2045Sz.e = obj;
        return c2045Sz;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1133Hh1<Object> interfaceC1133Hh1, JM<? super Unit> jm) {
        return ((C2045Sz) create(interfaceC1133Hh1, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            InterfaceC1133Hh1<? super Object> interfaceC1133Hh1 = (InterfaceC1133Hh1) this.e;
            this.d = 1;
            if (this.g.j(interfaceC1133Hh1, this) == mn) {
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

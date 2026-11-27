package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Rz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {119}, m = "invokeSuspend")
public final class C1967Rz extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ InterfaceC6606sf0<Object> g;
    public final /* synthetic */ AbstractC2123Tz<Object> h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1967Rz(InterfaceC6606sf0<Object> interfaceC6606sf0, AbstractC2123Tz<Object> abstractC2123Tz, JM<? super C1967Rz> jm) {
        super(2, jm);
        this.g = interfaceC6606sf0;
        this.h = abstractC2123Tz;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        C1967Rz c1967Rz = new C1967Rz(this.g, this.h, jm);
        c1967Rz.e = obj;
        return c1967Rz;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1967Rz) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object obj2 = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            InterfaceC0764Co1<Object> interfaceC0764Co1M = this.h.m((KN) this.e);
            this.d = 1;
            Object objA = C0736Cf0.a(this.g, interfaceC0764Co1M, true, this);
            if (objA != obj2) {
                objA = Unit.a;
            }
            if (objA == obj2) {
                return obj2;
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

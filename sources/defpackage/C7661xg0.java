package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", l = {80}, m = "invokeSuspend")
public final class C7661xg0 extends AW1 implements Function2<InterfaceC2941bR0<Object>, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ InterfaceC6396rf0<Object> g;

    /* JADX INFO: renamed from: xg0$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ InterfaceC2941bR0<T> d;

        public a(InterfaceC2941bR0<T> interfaceC2941bR0) {
            this.d = interfaceC2941bR0;
        }

        @Override // defpackage.InterfaceC6606sf0
        @Nullable
        public final Object a(T t, @NotNull JM<? super Unit> jm) {
            Object objA = this.d.a(t, jm);
            return objA == MN.d ? objA : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7661xg0(InterfaceC6396rf0<Object> interfaceC6396rf0, JM<? super C7661xg0> jm) {
        super(2, jm);
        this.g = interfaceC6396rf0;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        C7661xg0 c7661xg0 = new C7661xg0(this.g, jm);
        c7661xg0.e = obj;
        return c7661xg0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC2941bR0<Object> interfaceC2941bR0, JM<? super Unit> jm) {
        return ((C7661xg0) create(interfaceC2941bR0, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a((InterfaceC2941bR0) this.e);
            this.d = 1;
            if (this.g.c(aVar, this) == mn) {
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

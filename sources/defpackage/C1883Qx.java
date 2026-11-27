package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Qx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1883Qx<T> extends C2201Uz<T> {

    @NotNull
    public final AW1 i;

    /* JADX INFO: renamed from: Qx$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {330}, m = "collectTo")
    public static final class a extends LM {
        public InterfaceC1133Hh1 d;
        public /* synthetic */ Object e;
        public int h;

        public a(LM lm) {
            super(lm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.h |= Integer.MIN_VALUE;
            return C1883Qx.this.j(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1883Qx(@NotNull Function2<? super InterfaceC1133Hh1<? super T>, ? super JM<? super Unit>, ? extends Object> function2, @NotNull CoroutineContext coroutineContext, int i, @NotNull EnumC1796Pu enumC1796Pu) {
        super(function2, coroutineContext, i, enumC1796Pu);
        this.i = (AW1) function2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.C2201Uz, defpackage.AbstractC2123Tz
    @Nullable
    public final Object j(@NotNull InterfaceC1133Hh1<? super T> interfaceC1133Hh1, @NotNull JM<? super Unit> jm) {
        a aVar;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.h = i - Integer.MIN_VALUE;
            } else {
                aVar = new a((LM) jm);
            }
        } else {
            aVar = new a((LM) jm);
        }
        Object obj = aVar.e;
        MN mn = MN.d;
        int i2 = aVar.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            aVar.d = interfaceC1133Hh1;
            aVar.h = 1;
            if (super.j(interfaceC1133Hh1, aVar) == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC1133Hh1 = aVar.d;
            C1795Pt1.b(obj);
        }
        if (interfaceC1133Hh1.o()) {
            return Unit.a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.C2201Uz, defpackage.AbstractC2123Tz
    @NotNull
    public final AbstractC2123Tz<T> k(@NotNull CoroutineContext coroutineContext, int i, @NotNull EnumC1796Pu enumC1796Pu) {
        return new C1883Qx(this.i, coroutineContext, i, enumC1796Pu);
    }
}

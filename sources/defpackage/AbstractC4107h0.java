package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4107h0<T> implements InterfaceC6396rf0<T>, InterfaceC6460ry<T> {

    /* JADX INFO: renamed from: h0$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {226}, m = "collect")
    public static final class a extends LM {
        public C2897bC1 d;
        public /* synthetic */ Object e;
        public final /* synthetic */ AbstractC4107h0<T> g;
        public int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC4107h0<T> abstractC4107h0, JM<? super a> jm) {
            super(jm);
            this.g = abstractC4107h0;
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.h |= Integer.MIN_VALUE;
            return this.g.c(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v5, types: [AW1, kotlin.jvm.functions.Function2] */
    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super T> interfaceC6606sf0, @NotNull JM<? super Unit> jm) throws Throwable {
        a aVar;
        Throwable th;
        C2897bC1 c2897bC1;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.h = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, jm);
            }
        } else {
            aVar = new a(this, jm);
        }
        Object obj = aVar.e;
        Object obj2 = MN.d;
        int i2 = aVar.h;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2897bC1 = aVar.d;
            try {
                C1795Pt1.b(obj);
                c2897bC1.releaseIntercepted();
                return Unit.a;
            } catch (Throwable th2) {
                th = th2;
                c2897bC1.releaseIntercepted();
                throw th;
            }
        }
        C1795Pt1.b(obj);
        C2897bC1 c2897bC2 = new C2897bC1(interfaceC6606sf0, aVar.getContext());
        try {
            aVar.d = c2897bC2;
            aVar.h = 1;
            Object objInvoke = ((C3735fC1) this).d.invoke(c2897bC2, aVar);
            if (objInvoke != obj2) {
                objInvoke = Unit.a;
            }
            if (objInvoke == obj2) {
                return obj2;
            }
            c2897bC1 = c2897bC2;
            c2897bC1.releaseIntercepted();
            return Unit.a;
        } catch (Throwable th3) {
            th = th3;
            c2897bC1 = c2897bC2;
            c2897bC1.releaseIntercepted();
            throw th;
        }
    }
}

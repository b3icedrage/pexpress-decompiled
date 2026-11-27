package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qU1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6150qU1<T> implements InterfaceC6606sf0<T> {
    @Override // defpackage.InterfaceC6606sf0
    @Nullable
    public final Object a(T t, @NotNull JM<? super Unit> jm) {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v1, types: [LM, int] */
    @Nullable
    public final Unit b(@NotNull LM lm) {
        C5940pU1 c5940pU1;
        if (lm instanceof C5940pU1) {
            c5940pU1 = (C5940pU1) lm;
            int i = c5940pU1.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5940pU1.i = i - Integer.MIN_VALUE;
            } else {
                c5940pU1 = new C5940pU1(this, lm);
            }
        } else {
            c5940pU1 = new C5940pU1(this, lm);
        }
        Object obj = c5940pU1.g;
        MN mn = MN.d;
        ?? r1 = c5940pU1.i;
        try {
            if (r1 == 0) {
                C1795Pt1.b(obj);
                C2897bC1 c2897bC1 = new C2897bC1(null, c5940pU1.getContext());
                c5940pU1.d = this;
                c5940pU1.e = c2897bC1;
                c5940pU1.i = 1;
                throw null;
            }
            if (r1 != 1) {
                if (r1 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
                return Unit.a;
            }
            C2897bC1 c2897bC2 = c5940pU1.e;
            C6150qU1 c6150qU1 = c5940pU1.d;
            C1795Pt1.b(obj);
            c2897bC2.releaseIntercepted();
            c6150qU1.getClass();
            return Unit.a;
        } catch (Throwable th) {
            r1.releaseIntercepted();
            throw th;
        }
    }
}

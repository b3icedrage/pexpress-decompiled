package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class OZ1 {

    @InterfaceC3368dU(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {101}, m = "withTimeoutOrNull")
    public static final class a<T> extends LM {
        public Function2 d;
        public C3027bp1 e;
        public /* synthetic */ Object g;
        public int h;

        public a() {
            throw null;
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.g = obj;
            this.h |= Integer.MIN_VALUE;
            return OZ1.c(0L, null, this);
        }
    }

    public static final <U, T extends U> Object a(NZ1<U, ? super T> nz1, Function2<? super KN, ? super JM<? super T>, ? extends Object> function2) throws Throwable {
        Object og;
        Object objD0;
        ED.j(nz1, false, new E20(IW.d(nz1.h.getContext()).G(nz1.i, nz1, nz1.g)), 3);
        try {
            if (function2 == null) {
                og = C5885pC0.c(function2, nz1, nz1);
            } else {
                F62.e(2, function2);
                og = function2.invoke(nz1, nz1);
            }
        } catch (Throwable th) {
            og = new OG(th, false);
        }
        MN mn = MN.d;
        if (og == mn || (objD0 = nz1.d0(og)) == C3787fU.e) {
            return mn;
        }
        if (objD0 instanceof OG) {
            Throwable th2 = ((OG) objD0).a;
            if (!(th2 instanceof MZ1) || ((MZ1) th2).d != nz1) {
                throw th2;
            }
            if (og instanceof OG) {
                throw ((OG) og).a;
            }
        } else {
            og = C3787fU.o(objD0);
        }
        return og;
    }

    @Nullable
    public static final Object b(long j, @NotNull Function2 function2, @NotNull LM frame) throws Throwable {
        if (j <= 0) {
            throw new MZ1("Timed out immediately", null);
        }
        Object objA = a(new NZ1(j, frame), function2);
        if (objA == MN.d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objA;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [NZ1, T] */
    @Nullable
    public static final <T> Object c(long j, @NotNull Function2<? super KN, ? super JM<? super T>, ? extends Object> function2, @NotNull JM<? super T> jm) {
        a frame;
        C3027bp1 c3027bp1;
        if (jm instanceof a) {
            frame = (a) jm;
            int i = frame.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                frame.h = i - Integer.MIN_VALUE;
            } else {
                frame = new a(jm);
            }
        } else {
            frame = new a(jm);
        }
        Object obj = frame.g;
        MN mn = MN.d;
        int i2 = frame.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            if (j <= 0) {
                return null;
            }
            C3027bp1 c3027bp2 = new C3027bp1();
            try {
                frame.d = function2;
                frame.e = c3027bp2;
                frame.h = 1;
                ?? r2 = (T) new NZ1(j, frame);
                c3027bp2.d = r2;
                Object objA = a(r2, function2);
                if (objA == mn) {
                    try {
                        Intrinsics.checkNotNullParameter(frame, "frame");
                    } catch (MZ1 e) {
                        e = e;
                        c3027bp1 = c3027bp2;
                        if (e.d == c3027bp1.d) {
                            return null;
                        }
                        throw e;
                    }
                }
                return objA == mn ? mn : objA;
            } catch (MZ1 e2) {
                e = e2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3027bp1 = frame.e;
            try {
                C1795Pt1.b(obj);
                return obj;
            } catch (MZ1 e3) {
                e = e3;
            }
        }
        if (e.d == c3027bp1.d) {
            return null;
        }
        throw e;
    }

    @Nullable
    public static final Object d(long j, @NotNull Function2 function2, @NotNull LM lm) {
        return c(IW.e(j), function2, lm);
    }
}

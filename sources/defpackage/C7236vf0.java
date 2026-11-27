package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7236vf0 {

    @NotNull
    public static final EM a = LN.a(CoroutineContext.Element.a.c(C0564Aa.a(), C6266r20.a));

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: vf0$a */
    @InterfaceC3368dU(c = "com.api.utils.FlowKt$firstNotNull$2", f = "Flow.kt", l = {95}, m = "invokeSuspend")
    public static final class a<T> extends AW1 implements Function1<JM<? super T>, Object> {
        public int d;
        public final /* synthetic */ InterfaceC6396rf0<T> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC6396rf0<? extends T> interfaceC6396rf0, JM<? super a> jm) {
            super(1, jm);
            this.e = interfaceC6396rf0;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new a(this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((a) create((JM) obj)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
                return obj;
            }
            C1795Pt1.b(obj);
            C4250hg0 c4250hg0 = new C4250hg0(this.e, 0);
            this.d = 1;
            Object objO = C4466ii.o(c4250hg0, this);
            return objO == mn ? mn : objO;
        }
    }

    /* JADX INFO: renamed from: vf0$b */
    @InterfaceC3368dU(c = "com.api.utils.FlowKt", f = "Flow.kt", l = {107}, m = "watchedWait")
    public static final class b<T> extends LM {
        public String d;
        public C2936bP1 e;
        public long g;
        public /* synthetic */ Object h;
        public int i;

        public b() {
            throw null;
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.h = obj;
            this.i |= Integer.MIN_VALUE;
            return C7236vf0.d(this, null, null);
        }
    }

    /* JADX INFO: renamed from: vf0$c */
    @InterfaceC3368dU(c = "com.api.utils.FlowKt$watchedWait$watchdog$1", f = "Flow.kt", l = {103}, m = "invokeSuspend")
    public static final class c extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, JM<? super c> jm) {
            super(2, jm);
            this.e = str;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new c(this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((c) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                this.d = 1;
                if (IW.b(8000L, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            C1050Gg c1050Gg = U0.l;
            if (c1050Gg != null) {
                c1050Gg.invoke(this.e, new Long(8000L));
            }
            return Unit.a;
        }
    }

    @Nullable
    public static final <T> Object a(@NotNull InterfaceC6396rf0<? extends T> interfaceC6396rf0, @NotNull JM<? super T> jm) {
        IN in = (IN) jm.getContext().p(IN.g);
        return d(jm, in != null ? in.e : null, new a(interfaceC6396rf0, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object b(@NotNull InterfaceC6396rf0 interfaceC6396rf0, long j, @NotNull Function1 function1, @NotNull LM lm) {
        C7657xf0 c7657xf0;
        if (lm instanceof C7657xf0) {
            c7657xf0 = (C7657xf0) lm;
            int i = c7657xf0.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                c7657xf0.e = i - Integer.MIN_VALUE;
            } else {
                c7657xf0 = new C7657xf0(lm);
            }
        } else {
            c7657xf0 = new C7657xf0(lm);
        }
        Object obj = c7657xf0.d;
        MN mn = MN.d;
        int i2 = c7657xf0.e;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
                return obj;
            }
            C1795Pt1.b(obj);
            C7867yf0 c7867yf0 = new C7867yf0(null, interfaceC6396rf0, function1);
            c7657xf0.e = 1;
            Object objB = OZ1.b(IW.e(j), c7867yf0, c7657xf0);
            return objB == mn ? mn : objB;
        } catch (MZ1 unused) {
            return null;
        } catch (Throwable th) {
            if (th instanceof CancellationException) {
                throw th;
            }
            th.printStackTrace();
            C1910Rg c1910Rg = U0.v;
            if (c1910Rg != null) {
                c1910Rg.invoke(th, OW0.b(new Pair("phase", "first_with_timeout_or_null")));
            }
            return null;
        }
    }

    @Nullable
    public static final Object c(@NotNull String str, @NotNull Function1 function1, @NotNull LM lm) {
        return LN.d(new C8077zf0(null, str, function1), lm);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(JM jm, String str, Function1 function1) throws Throwable {
        b bVar;
        C2936bP1 c2936bP1;
        String str2;
        Throwable th;
        long j;
        long jCurrentTimeMillis;
        C1206Ig c1206Ig;
        long jCurrentTimeMillis2;
        C1206Ig c1206Ig2;
        if (jm instanceof b) {
            bVar = (b) jm;
            int i = bVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.i = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(jm);
            }
        } else {
            bVar = new b(jm);
        }
        Object obj = bVar.h;
        MN mn = MN.d;
        int i2 = bVar.i;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = bVar.g;
            c2936bP1 = bVar.e;
            str2 = bVar.d;
            try {
                C1795Pt1.b(obj);
                c2936bP1.l(null);
                jCurrentTimeMillis2 = System.currentTimeMillis() - j;
                if (jCurrentTimeMillis2 > 1000 && (c1206Ig2 = U0.m) != null) {
                    c1206Ig2.invoke(str2, new Long(jCurrentTimeMillis2));
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                c2936bP1.l(null);
                jCurrentTimeMillis = System.currentTimeMillis() - j;
                if (jCurrentTimeMillis > 1000 && (c1206Ig = U0.m) != null) {
                    c1206Ig.invoke(str2, new Long(jCurrentTimeMillis));
                }
                throw th;
            }
        }
        C1795Pt1.b(obj);
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        C2936bP1 c2936bP1K = C5189lv.k(a, null, new c(str, null), 3);
        try {
            bVar.d = str;
            bVar.e = c2936bP1K;
            bVar.g = jCurrentTimeMillis3;
            bVar.i = 1;
            Object objInvoke = function1.invoke(bVar);
            if (objInvoke == mn) {
                return mn;
            }
            c2936bP1 = c2936bP1K;
            str2 = str;
            obj = objInvoke;
            j = jCurrentTimeMillis3;
            c2936bP1.l(null);
            jCurrentTimeMillis2 = System.currentTimeMillis() - j;
            if (jCurrentTimeMillis2 > 1000) {
                c1206Ig2.invoke(str2, new Long(jCurrentTimeMillis2));
            }
            return obj;
        } catch (Throwable th3) {
            c2936bP1 = c2936bP1K;
            str2 = str;
            th = th3;
            j = jCurrentTimeMillis3;
            c2936bP1.l(null);
            jCurrentTimeMillis = System.currentTimeMillis() - j;
            if (jCurrentTimeMillis > 1000) {
                c1206Ig.invoke(str2, new Long(jCurrentTimeMillis));
            }
            throw th;
        }
    }
}

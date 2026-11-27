package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: zf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.utils.FlowKt$hotPathWatchdog$2", f = "Flow.kt", l = {187}, m = "invokeSuspend")
public final class C8077zf0 extends AW1 implements Function2<KN, JM<Object>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ AW1 g;
    public final /* synthetic */ String h;

    /* JADX INFO: renamed from: zf0$a */
    @InterfaceC3368dU(c = "com.api.utils.FlowKt$hotPathWatchdog$2$watchdog$1", f = "Flow.kt", l = {180}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, JM<? super a> jm) {
            super(2, jm);
            this.e = str;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new a(this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                this.d = 1;
                if (IW.b(15000L, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            C1910Rg c1910Rg = U0.v;
            if (c1910Rg != null) {
                String str = this.e;
                c1910Rg.invoke(new RuntimeException("Hot path stuck >15000ms: ".concat(str)), OW0.b(new Pair("phase", "hot_path_".concat(str))));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8077zf0(JM jm, String str, Function1 function1) {
        super(2, jm);
        this.g = (AW1) function1;
        this.h = str;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [AW1, kotlin.jvm.functions.Function1] */
    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C8077zf0 c8077zf0 = new C8077zf0(jm, this.h, this.g);
        c8077zf0.e = obj;
        return c8077zf0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<Object> jm) {
        return ((C8077zf0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [AW1, kotlin.jvm.functions.Function1] */
    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) throws Throwable {
        XF0 xf0;
        Throwable th;
        MN mn = MN.d;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xf0 = (XF0) this.e;
            try {
                C1795Pt1.b(obj);
                xf0.l(null);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                xf0.l(null);
                throw th;
            }
        }
        C1795Pt1.b(obj);
        C2936bP1 c2936bP1K = C5189lv.k((KN) this.e, null, new a(this.h, null), 3);
        try {
            ?? r1 = this.g;
            this.e = c2936bP1K;
            this.d = 1;
            Object objInvoke = r1.invoke(this);
            if (objInvoke == mn) {
                return mn;
            }
            xf0 = c2936bP1K;
            obj = objInvoke;
            xf0.l(null);
            return obj;
        } catch (Throwable th3) {
            xf0 = c2936bP1K;
            th = th3;
            xf0.l(null);
            throw th;
        }
    }
}

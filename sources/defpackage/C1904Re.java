package defpackage;

import io.sentry.android.core.b0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Re, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.telemetry.probe.AppDataReadinessProbe$launchFieldWatchdog$1", f = "AppDataReadinessProbe.kt", l = {305}, m = "invokeSuspend")
public final class C1904Re extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C4245hf g;
    public final /* synthetic */ InterfaceC4302hv0 h;
    public final /* synthetic */ C5647o42 i;
    public final /* synthetic */ String j;
    public final /* synthetic */ AW1 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1904Re(C4245hf c4245hf, InterfaceC4302hv0 interfaceC4302hv0, C5647o42 c5647o42, String str, Function1<? super JM<Object>, ? extends Object> function1, JM<? super C1904Re> jm) {
        super(2, jm);
        this.g = c4245hf;
        this.h = interfaceC4302hv0;
        this.i = c5647o42;
        this.j = str;
        this.k = (AW1) function1;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [AW1, kotlin.jvm.functions.Function1] */
    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        String str = this.j;
        ?? r5 = this.k;
        C1904Re c1904Re = new C1904Re(this.g, this.h, this.i, str, r5, jm);
        c1904Re.e = obj;
        return c1904Re;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C1904Re) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [AW1, kotlin.jvm.functions.Function1] */
    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        Object objA;
        MN mn = MN.d;
        int i = this.d;
        String str = this.j;
        C5647o42 c5647o42 = this.i;
        try {
            if (i == 0) {
                C1795Pt1.b(obj);
                C4245hf c4245hf = this.g;
                InterfaceC4302hv0 interfaceC4302hv0 = this.h;
                ?? r6 = this.k;
                C1717Ot1.a aVar = C1717Ot1.e;
                this.d = 1;
                if (C4245hf.a(c4245hf, interfaceC4302hv0, c5647o42, str, r6, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            objA = Unit.a;
            C1717Ot1.a aVar2 = C1717Ot1.e;
        } catch (Throwable th) {
            C1717Ot1.a aVar3 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        Throwable thA = C1717Ot1.a(objA);
        if (thA != null) {
            c5647o42.b.set(true);
            b0.f("AppDataReadinessProbe", "field=" + str + " watchdog failed", thA);
        }
        return Unit.a;
    }
}

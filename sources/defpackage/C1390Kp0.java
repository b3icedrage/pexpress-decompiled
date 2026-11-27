package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Kp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1390Kp0 {

    @NotNull
    public static final a d = new a();

    @NotNull
    public static final C2498Yk<C1390Kp0> e = new C2498Yk<>("HttpResponseValidator");

    @NotNull
    public final List<Function2<AbstractC5391mr0, JM<? super Unit>, Object>> a;

    @NotNull
    public final List<InterfaceC0760Cn0> b;
    public final boolean c;

    /* JADX INFO: renamed from: Kp0$a */
    public static final class a implements InterfaceC4755jq0<b, C1390Kp0> {
        @Override // defpackage.InterfaceC4755jq0
        public final void a(C1390Kp0 c1390Kp0, C1782Pp0 scope) throws C6514sC0 {
            C1390Kp0 plugin = c1390Kp0;
            Intrinsics.checkNotNullParameter(plugin, "plugin");
            Intrinsics.checkNotNullParameter(scope, "scope");
            scope.i.f(C4539ir0.f, new C1156Hp0(plugin, null));
            C1277Jd1 phase = new C1277Jd1("BeforeReceive");
            C1277Jd1 relativeTo = C6440rr0.f;
            C6440rr0 c6440rr0 = scope.j;
            c6440rr0.getClass();
            Intrinsics.checkNotNullParameter(relativeTo, "reference");
            Intrinsics.checkNotNullParameter(phase, "phase");
            if (!c6440rr0.e(phase)) {
                int iC = c6440rr0.c(relativeTo);
                if (iC == -1) {
                    throw new C6514sC0("Phase " + relativeTo + " was not registered for this pipeline");
                }
                ArrayList arrayList = c6440rr0.a;
                Intrinsics.checkNotNullParameter(relativeTo, "relativeTo");
                arrayList.add(iC, new C7860yd1(phase, new AbstractC1355Kd1.b()));
            }
            c6440rr0.f(phase, new C1234Ip0(plugin, null));
            C6860tr0.d dVar = C6860tr0.b;
            C6860tr0 c6860tr0 = (C6860tr0) C4965kq0.a(scope);
            C1312Jp0 block = new C1312Jp0(plugin, null);
            Intrinsics.checkNotNullParameter(block, "block");
            c6860tr0.a.add(block);
        }

        @Override // defpackage.InterfaceC4755jq0
        public final C1390Kp0 b(Function1<? super b, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            b bVar = new b();
            block.invoke(bVar);
            return new C1390Kp0(CollectionsKt.S(bVar.a), CollectionsKt.S(bVar.b), bVar.c);
        }

        @Override // defpackage.InterfaceC4755jq0
        @NotNull
        public final C2498Yk<C1390Kp0> getKey() {
            return C1390Kp0.e;
        }
    }

    /* JADX INFO: renamed from: Kp0$b */
    public static final class b {

        @NotNull
        public final ArrayList a = new ArrayList();

        @NotNull
        public final ArrayList b = new ArrayList();
        public boolean c = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1390Kp0(@NotNull List<? extends Function2<? super AbstractC5391mr0, ? super JM<? super Unit>, ? extends Object>> responseValidators, @NotNull List<? extends InterfaceC0760Cn0> callExceptionHandlers, boolean z) {
        Intrinsics.checkNotNullParameter(responseValidators, "responseValidators");
        Intrinsics.checkNotNullParameter(callExceptionHandlers, "callExceptionHandlers");
        this.a = responseValidators;
        this.b = callExceptionHandlers;
        this.c = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Unit a(C1390Kp0 c1390Kp0, Throwable th, InterfaceC2595Zq0 interfaceC2595Zq0, LM lm) {
        C1468Lp0 c1468Lp0;
        Iterator it;
        c1390Kp0.getClass();
        if (lm instanceof C1468Lp0) {
            c1468Lp0 = (C1468Lp0) lm;
            int i = c1468Lp0.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1468Lp0.j = i - Integer.MIN_VALUE;
            } else {
                c1468Lp0 = new C1468Lp0(c1390Kp0, lm);
            }
        } else {
            c1468Lp0 = new C1468Lp0(c1390Kp0, lm);
        }
        Object obj = c1468Lp0.h;
        MN mn = MN.d;
        int i2 = c1468Lp0.j;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            C1704Op0.a.c("Processing exception " + th + " for request " + interfaceC2595Zq0.getUrl());
            it = c1390Kp0.b.iterator();
        } else {
            if (i2 != 1 && i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c1468Lp0.g;
            InterfaceC2595Zq0 interfaceC2595Zq1 = c1468Lp0.e;
            Throwable th2 = c1468Lp0.d;
            C1795Pt1.b(obj);
            interfaceC2595Zq0 = interfaceC2595Zq1;
            th = th2;
        }
        while (it.hasNext()) {
            InterfaceC0760Cn0 interfaceC0760Cn0 = (InterfaceC0760Cn0) it.next();
            if (interfaceC0760Cn0 instanceof B90) {
                ((B90) interfaceC0760Cn0).getClass();
                c1468Lp0.d = th;
                c1468Lp0.e = interfaceC2595Zq0;
                c1468Lp0.g = it;
                c1468Lp0.j = 1;
                throw null;
            }
            if (interfaceC0760Cn0 instanceof C7915ys1) {
                ((C7915ys1) interfaceC0760Cn0).getClass();
                c1468Lp0.d = th;
                c1468Lp0.e = interfaceC2595Zq0;
                c1468Lp0.g = it;
                c1468Lp0.j = 2;
                throw null;
            }
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object b(C1390Kp0 c1390Kp0, AbstractC5391mr0 abstractC5391mr0, LM lm) {
        C1545Mp0 c1545Mp0;
        Iterator it;
        c1390Kp0.getClass();
        if (lm instanceof C1545Mp0) {
            c1545Mp0 = (C1545Mp0) lm;
            int i = c1545Mp0.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1545Mp0.i = i - Integer.MIN_VALUE;
            } else {
                c1545Mp0 = new C1545Mp0(c1390Kp0, lm);
            }
        } else {
            c1545Mp0 = new C1545Mp0(c1390Kp0, lm);
        }
        Object obj = c1545Mp0.g;
        MN mn = MN.d;
        int i2 = c1545Mp0.i;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            C1704Op0.a.c("Validating response for request " + abstractC5391mr0.b().c().getUrl());
            it = c1390Kp0.a.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c1545Mp0.e;
            abstractC5391mr0 = c1545Mp0.d;
            C1795Pt1.b(obj);
        }
        while (it.hasNext()) {
            Function2 function2 = (Function2) it.next();
            c1545Mp0.d = abstractC5391mr0;
            c1545Mp0.e = it;
            c1545Mp0.i = 1;
            if (function2.invoke(abstractC5391mr0, c1545Mp0) == mn) {
                return mn;
            }
        }
        return Unit.a;
    }
}

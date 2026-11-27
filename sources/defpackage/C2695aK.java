package defpackage;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: aK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2695aK {

    @NotNull
    public final b a;

    /* JADX INFO: renamed from: aK$a */
    public static final class a {
        public final KW1 a;
        public final InterfaceC7394wP0 b;
        public final F81.a c;
        public final C0957Fb d;
        public final AbstractC4836kD1 e;

        public a(@NotNull InterfaceC7394wP0 lifecycle, @NotNull F81.a webSocketFactory, @NotNull C0957Fb backoffStrategy, @NotNull AbstractC4836kD1 scheduler) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(webSocketFactory, "webSocketFactory");
            Intrinsics.checkNotNullParameter(backoffStrategy, "backoffStrategy");
            Intrinsics.checkNotNullParameter(scheduler, "scheduler");
            this.b = lifecycle;
            this.c = webSocketFactory;
            this.d = backoffStrategy;
            this.e = scheduler;
            this.a = XO0.b(new C7375wJ(this));
        }
    }

    /* JADX INFO: renamed from: aK$b */
    public static final class b {
        public final LP0 a;
        public final C2158Uk1<AbstractC2882b80> b;
        public final LP1<CP1, AbstractC2882b80, Object> c;

        @NotNull
        public final InterfaceC7394wP0 d;
        public final F81.a e;
        public final C0957Fb f;
        public final AbstractC4836kD1 g;

        public b(@NotNull InterfaceC7394wP0 lifecycle, @NotNull F81.a webSocketFactory, @NotNull C0957Fb backoffStrategy, @NotNull AbstractC4836kD1 scheduler) {
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            Intrinsics.checkNotNullParameter(webSocketFactory, "webSocketFactory");
            Intrinsics.checkNotNullParameter(backoffStrategy, "backoffStrategy");
            Intrinsics.checkNotNullParameter(scheduler, "scheduler");
            this.d = lifecycle;
            this.e = webSocketFactory;
            this.f = backoffStrategy;
            this.g = scheduler;
            this.a = new LP0(this);
            C2158Uk1<AbstractC2882b80> c2158Uk1 = new C2158Uk1<>();
            Intrinsics.checkNotNullExpressionValue(c2158Uk1, "PublishProcessor.create<Event>()");
            this.b = c2158Uk1;
            LP1.a aVar = LP1.c;
            YJ yj = new YJ(this);
            aVar.getClass();
            LP1.c<CP1, AbstractC2882b80, Object> cVar = new LP1.c<>(0);
            yj.invoke(cVar);
            CP1 cp1 = cVar.a;
            if (cp1 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            this.c = new LP1<>(new LP1.b(cp1, PW0.k(cVar.b), CollectionsKt.e0(cVar.c)));
        }

        public static final LP1.d a(b bVar) {
            bVar.getClass();
            LP1.d dVar = new LP1.d(AbstractC2882b80.a.C0249a.class);
            dVar.b(C7585xJ.d);
            return dVar;
        }

        public static final LP1.d b(b bVar) {
            bVar.getClass();
            LP1.d dVar = new LP1.d(AbstractC2882b80.a.C0249a.class);
            dVar.b(C7795yJ.d);
            return dVar;
        }

        public static final DI1 c(b bVar) {
            F81.a aVar = bVar.e;
            aVar.getClass();
            H81 h81 = new H81();
            G81 g81 = new G81();
            F81 f81 = new F81(h81, g81, aVar.a);
            C5983pg2 c5983pg2 = new C5983pg2(bVar);
            C1207Ig0 c1207Ig0E = g81.e.e();
            Intrinsics.checkNotNullExpressionValue(c1207Ig0E, "processor.onBackpressureBuffer()");
            C0661Bg0 toStream = new C0661Bg0(new C0739Cg0(c1207Ig0E, new C7173vM(f81)), new C7087ux(new C3156cT0(1, f81, F81.class, "handleWebSocketEvent", "handleWebSocketEvent(Lcom/tinder/scarlet/WebSocket$Event;)V", 0, 1)));
            Intrinsics.checkNotNullExpressionValue(toStream, "okHttpWebSocketEventObse…is::handleWebSocketEvent)");
            Intrinsics.checkNotNullParameter(toStream, "$this$toStream");
            C0895Eg0 c0895Eg0 = new C0895Eg0(new C1441Lg0(toStream));
            AbstractC4836kD1 abstractC4836kD1 = bVar.g;
            C1589Ne.r(abstractC4836kD1, "scheduler is null");
            int i = AbstractC7871yg0.d;
            C1589Ne.x(i, "bufferSize");
            new C1051Gg0(new C1129Hg0(c0895Eg0, abstractC4836kD1, i), new C3636ek0.a()).g(c5983pg2);
            return new DI1(f81, c5983pg2);
        }

        public static final void d(b bVar) {
            LP0 lp0 = bVar.a;
            AtomicInteger atomicInteger = lp0.e;
            if (atomicInteger.get() == 0) {
                atomicInteger.incrementAndGet();
                lp0.d.get().s(1L);
            }
        }

        public static final C2449Xt1 e(b bVar, long j) {
            bVar.getClass();
            C2449Xt1 c2449Xt1 = new C2449Xt1(bVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            int i = AbstractC7871yg0.d;
            C1589Ne.r(timeUnit, "unit is null");
            AbstractC4836kD1 abstractC4836kD1 = bVar.g;
            C1589Ne.r(abstractC4836kD1, "scheduler is null");
            new C1599Ng0(Math.max(0L, j), abstractC4836kD1).e().g(c2449Xt1);
            return c2449Xt1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void f(@NotNull AbstractC2882b80 event) {
            LP1.e eVarB;
            Intrinsics.checkNotNullParameter(event, "event");
            this.b.d(event);
            LP1<CP1, AbstractC2882b80, Object> lp1 = this.c;
            lp1.getClass();
            synchronized (lp1) {
                Object fromState = lp1.a.get();
                Intrinsics.b(fromState, "fromState");
                eVarB = lp1.b(fromState, event);
                if (eVarB instanceof LP1.e.b) {
                    lp1.a.set(((LP1.e.b) eVarB).c);
                }
            }
            Iterator it = lp1.b.c.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(eVarB);
            }
            if (eVarB instanceof LP1.e.b) {
                LP1.e.b bVar = (LP1.e.b) eVarB;
                STATE state = bVar.a;
                Iterator it2 = lp1.a(state).b.iterator();
                while (it2.hasNext()) {
                    ((Function2) it2.next()).invoke(state, event);
                }
                CP1 cp1 = bVar.c;
                Iterator it3 = lp1.a(cp1).a.iterator();
                while (it3.hasNext()) {
                    ((Function2) it3.next()).invoke(cp1, event);
                }
            }
        }
    }

    public C2695aK(@NotNull b stateManager) {
        Intrinsics.checkNotNullParameter(stateManager, "stateManager");
        this.a = stateManager;
    }
}

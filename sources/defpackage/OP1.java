package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class OP1<STATE> extends AbstractC7046uk0 {
    public STATE d;

    @NotNull
    public final KP1<STATE> e;

    public static final class a<STATE> {
        public final STATE a;

        @Nullable
        public ML0 b;

        @Nullable
        public ML0 c;

        @Nullable
        public ML0 d;

        public a(STATE state) {
            this.a = state;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final void a(@NotNull Function1 call) {
            Intrinsics.checkNotNullParameter(call, "call");
            this.c = (ML0) call;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OP1(@NotNull InterfaceC5889pD1 schedulers, @NotNull String name, STATE state) {
        super(schedulers, name);
        Intrinsics.checkNotNullParameter(schedulers, "schedulers");
        Intrinsics.checkNotNullParameter(name, "name");
        this.d = state;
        this.e = new KP1<>(state);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ML0, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v1, types: [ML0, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r3v2, types: [ML0, kotlin.jvm.functions.Function1] */
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
    public final void O(Function1<? super a<STATE>, Unit> function1) {
        Pair pair;
        STATE state;
        STATE state2 = this.d;
        a aVar = new a(state2);
        function1.invoke(aVar);
        ?? r3 = aVar.b;
        if (r3 == 0 || ((Boolean) r3.invoke(state2)).booleanValue()) {
            ?? r4 = aVar.c;
            if (r4 == 0) {
                throw new IllegalArgumentException("You need to implement transform method");
            }
            Object objInvoke = r4.invoke(state2);
            ?? r0 = aVar.d;
            if (r0 != 0) {
                r0.invoke(objInvoke);
            }
            pair = new Pair(Boolean.TRUE, objInvoke);
        } else {
            pair = new Pair(Boolean.FALSE, null);
        }
        if (!((Boolean) pair.d).booleanValue() || (state = (STATE) pair.e) == null) {
            return;
        }
        C4201hS c4201hS = C6104qF0.a;
        C6104qF0.a("Update state to " + state);
        this.d = state;
        this.e.k(state);
    }

    public final void P(@NotNull Function1<? super a<STATE>, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        RunnableC3586eX runnable = new RunnableC3586eX(this, handler);
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.c.execute(runnable);
    }

    public final void Q(long j, @NotNull Function1<? super a<STATE>, Unit> handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        FR runnable = new FR(this, handler);
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        if (j == 0) {
            this.b.execute(runnable);
        } else {
            this.a.postDelayed(new RunnableC6836tk0(0, this, runnable), j);
        }
    }
}

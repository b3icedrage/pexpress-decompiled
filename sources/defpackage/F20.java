package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class F20<T> implements InterfaceC6396rf0<T> {

    @NotNull
    public final InterfaceC6396rf0<T> d;

    @NotNull
    public final Function1<T, Object> e;

    @NotNull
    public final C0970Ff0.a g;

    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ F20<T> d;
        public final /* synthetic */ C3027bp1<Object> e;
        public final /* synthetic */ InterfaceC6606sf0<T> g;

        /* JADX INFO: renamed from: F20$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {73}, m = "emit")
        public static final class C0028a extends LM {
            public /* synthetic */ Object d;
            public final /* synthetic */ a<T> e;
            public int g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0028a(a<? super T> aVar, JM<? super C0028a> jm) {
                super(jm);
                this.e = aVar;
            }

            @Override // defpackage.AbstractC7487wq
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.d = obj;
                this.g |= Integer.MIN_VALUE;
                return this.e.a(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(F20<T> f20, C3027bp1<Object> c3027bp1, InterfaceC6606sf0<? super T> interfaceC6606sf0) {
            this.d = f20;
            this.e = c3027bp1;
            this.g = interfaceC6606sf0;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
        @Override // defpackage.InterfaceC6606sf0
        @Nullable
        public final Object a(T t, @NotNull JM<? super Unit> jm) {
            C0028a c0028a;
            if (jm instanceof C0028a) {
                c0028a = (C0028a) jm;
                int i = c0028a.g;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0028a.g = i - Integer.MIN_VALUE;
                } else {
                    c0028a = new C0028a(this, jm);
                }
            } else {
                c0028a = new C0028a(this, jm);
            }
            Object obj = c0028a.d;
            MN mn = MN.d;
            int i2 = c0028a.g;
            if (i2 == 0) {
                C1795Pt1.b(obj);
                F20<T> f20 = this.d;
                T t2 = (T) f20.e.invoke(t);
                C3027bp1<Object> c3027bp1 = this.e;
                Object obj2 = c3027bp1.d;
                if (obj2 != C5208m0.h && ((Boolean) f20.g.invoke(obj2, t2)).booleanValue()) {
                    return Unit.a;
                }
                c3027bp1.d = t2;
                c0028a.g = 1;
                if (this.g.a(t, c0028a) == mn) {
                    return mn;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    public F20(@NotNull InterfaceC6396rf0 interfaceC6396rf0, @NotNull Function1 function1, @NotNull C0970Ff0.a aVar) {
        this.d = interfaceC6396rf0;
        this.e = function1;
        this.g = aVar;
    }

    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super T> interfaceC6606sf0, @NotNull JM<? super Unit> jm) {
        C3027bp1 c3027bp1 = new C3027bp1();
        c3027bp1.d = (T) C5208m0.h;
        Object objC = this.d.c(new a(this, c3027bp1, interfaceC6606sf0), jm);
        return objC == MN.d ? objC : Unit.a;
    }
}
